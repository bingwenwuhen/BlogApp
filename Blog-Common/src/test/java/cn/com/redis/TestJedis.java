package cn.com.redis;

import cn.com.container.ServiceProvinder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Created by Administrator on 2016/1/24.
 */
public class TestJedis {

    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }


    @Test
    public void test() {
        //ShardedJedisPool shardedJedisPool = (ShardedJedisPool) context.getBean("jedisPool");
        ShardedJedisPool shardedJedisPool = (ShardedJedisPool) ServiceProvinder.getService("jedisPool");
        System.out.println(shardedJedisPool);
    }
}
