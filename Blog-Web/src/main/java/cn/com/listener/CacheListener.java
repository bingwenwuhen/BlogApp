package cn.com.listener;

import cn.com.container.ServiceProvinder;
import cn.com.domain.Article;
import cn.com.domain.ArticleMeta;
import cn.com.service.ArticleMetaService;
import cn.com.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.ObjectMapper;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/24.
 */
@WebListener
@Slf4j
public class CacheListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //此处加载缓存
        ShardedJedisPool shardedJedisPool = (ShardedJedisPool) ServiceProvinder.getService("jedisPool");
        ShardedJedis jedis = shardedJedisPool.getResource();
        ArticleMetaService articleMetaService = (ArticleMetaService) ServiceProvinder.getService("articleMetaService");
        List<ArticleMeta> articleMetas = articleMetaService.loadArticleRecently();
        try {
            jedis.set("RecentlyArticles", new ObjectMapper().writeValueAsString(articleMetas));
        } catch (IOException e) {
            e.printStackTrace();
            log.error("error:{}", e);
        }
        ArticleService articleService = (ArticleService) ServiceProvinder.getService("articleService");
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
        jedis.close();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ShardedJedisPool shardedJedisPool = (ShardedJedisPool) ServiceProvinder.getService("jedisPool");
        ShardedJedis jedis = shardedJedisPool.getResource();
        List<ArticleMeta> articleMetas = null;
        try {
            articleMetas = new ObjectMapper().readValue(jedis.get("RecentlyArticles"), ArrayList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //将这个key删除
        jedis.del("RecentlyArticles");
        for (ArticleMeta articleMeta: articleMetas) {
           //将文章元数据与文章均删除
            jedis.del(articleMeta.getId().toString());
            jedis.del(articleMeta.getArticleId());
        }
        jedis.close();
    }
}
