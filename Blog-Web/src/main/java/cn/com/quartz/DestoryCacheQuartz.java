package cn.com.quartz;

import cn.com.service.ArticleMetaService;
import cn.com.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.mongodb.morphia.Datastore;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

/**
 * Created by Administrator on 2016/1/24.
 */
@Slf4j
public class DestoryCacheQuartz {

    @Inject
    private ShardedJedisPool jedisPool;

    @Inject
    private Datastore datastore;

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
    }

    /**
     * 重新更新cache
     * @param jedis
     */
    private void updateCache(ShardedJedis jedis) {
        log.info("更新cache");
    }

}
