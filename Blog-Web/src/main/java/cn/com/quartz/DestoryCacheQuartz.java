package cn.com.quartz;

import cn.com.container.ServiceProvinder;
import cn.com.domain.Article;
import cn.com.domain.ArticleMeta;
import cn.com.service.ArticleMetaService;
import cn.com.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.ObjectMapper;
import org.mongodb.morphia.Datastore;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/24.
 */
@Slf4j
public class DestoryCacheQuartz {

    @Inject
    private ShardedJedisPool jedisPool;

    @Inject
    private ArticleService articleService;

    @Inject
    private ArticleMetaService articleMetaService;
    /**
     * 在此处定时刷新缓存
     */
    public void run() {
        ShardedJedis jedis = null;
        try {
            jedis = jedisPool.getResource();
        } catch (Exception e) {
            jedis.close();
            log.error("error:{}", e);
        }
        //首先删除cache
        DestoryCace(jedis);
        //其次更新cache
        updateCache(jedis);
        //最后将jedis关闭
        jedis.close();
    }

    /**
     * 删除cache
     * @param jedis
     */
    private void DestoryCace(ShardedJedis jedis) {
        log.info("删除cache");
        List<ArticleMeta> articleMetas = null;
        try {
            articleMetas = new ObjectMapper().readValue(jedis.get("RecentlyArticles"), ArrayList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //将这个key删除
        if (articleMetas != null) {
            jedis.del("RecentlyArticles");
            for (ArticleMeta articleMeta: articleMetas) {
                //将文章元数据与文章均删除
                jedis.del(articleMeta.getId().toString());
                jedis.del(articleMeta.getArticleId());
            }
        }
    }

    /**
     * 重新更新cache
     * @param jedis
     */
    private void updateCache(ShardedJedis jedis) {
        log.info("更新cache");
        List<ArticleMeta> articleMetas = articleMetaService.loadArticleRecently();
        try {
            if (articleMetas != null && articleMetas.size() > 0) {
                jedis.set("RecentlyArticles", new ObjectMapper().writeValueAsString(articleMetas));
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error("error:{}", e);
        }
        if (articleMetas != null &&  articleMetas.size() > 0) {
            for (ArticleMeta articleMeta: articleMetas) {
                Article article = articleService.loadArticle(articleMeta.getArticleId());
                //将文章元数据信息以及文章均放到缓存中
                try {
                    jedis.set(articleMeta.getId().toString(), new ObjectMapper().writeValueAsString(articleMeta));
                    jedis.set(article.getId(), new ObjectMapper().writeValueAsString(article));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
