package cn.com.morphia;

import cn.com.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.mongodb.morphia.Datastore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/1/19.
 */
public class TestMorphia {

    public ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void test() {
        Datastore datastore = (Datastore) context.getBean("datastore");
        User u = new User();
        u.setUsername("xx");
        u.setPassword("xx");
        datastore.save(u);
        System.out.println(datastore);
    }
}
