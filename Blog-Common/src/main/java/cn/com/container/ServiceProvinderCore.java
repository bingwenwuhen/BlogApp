package cn.com.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 该类的主要目的是加载spring配置文件
 * Created by Administrator on 2016/1/19.
 */
public class ServiceProvinderCore {

    protected ApplicationContext context;

    public void load(String filename) {
        context = new ClassPathXmlApplicationContext(filename);
    }
}
