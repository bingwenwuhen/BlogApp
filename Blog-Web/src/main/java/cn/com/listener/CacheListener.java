package cn.com.listener;

import cn.com.container.ServiceProvinder;
import redis.clients.jedis.ShardedJedisPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Administrator on 2016/1/24.
 */
@WebListener()
public class CacheListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //此处加载缓存
        ShardedJedisPool shardedJedisPool = (ShardedJedisPool) ServiceProvinder.getService("jedisPool");
        System.out.println(servletContextEvent);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
