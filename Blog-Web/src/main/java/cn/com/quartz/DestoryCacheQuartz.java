package cn.com.quartz;

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


    }

}
