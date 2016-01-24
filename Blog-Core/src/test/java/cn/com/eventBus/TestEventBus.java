package cn.com.eventBus;

import com.google.common.eventbus.EventBus;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/1/10.
 */
public class TestEventBus {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testEventBus() {
        EventBus eventBus = (EventBus) context.getBean("eventBus");
        System.out.println(eventBus);
    }
}
