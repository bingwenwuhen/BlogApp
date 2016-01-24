package cn.com.user;

import cn.com.domain.User;
import cn.com.mapper.UserMapper;
import cn.com.md5.MD5keyBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/1/6.
 */
public class TestUserMapper {

    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testAddUser() {
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        User user = new User();
        user.setUsername("xiaxuan");
        user.setPassword((new MD5keyBean()).getkeyBeanofStr("123456"));
        user.setAge(22);
        user.setJob("software engineer");
        user.setAddress("北坞嘉园");
        user.setEmail("bingwenwuhen@163.com");
        userMapper.addUser(user);
    }
}
