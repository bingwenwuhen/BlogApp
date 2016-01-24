package cn.com.container;

import cn.com.exception.ExceptionMessage;
import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2016/1/19.
 */
public class ServiceProvinder {

    private static ServiceProvinderCore sc;

    static {
        sc = new ServiceProvinderCore();
        sc.load("classpath*:spring/applicationContext.xml");
    }

    public static Object getService(String beanName) {
        Object bean = null;
        if (!StringUtils.hasText(beanName)) {
            throw new RuntimeException("您要访问的服务名不能为空");
        }
        //如果spring容器中包含beanName
        if (sc.context.containsBean(beanName)) {
            bean = sc.context.getBean(beanName);
        }
        //如果spring容器中不包含beanName
        if (bean == null) {
            //"您要访问的服务名称[" + beanName + "]不存在"
            throw new RuntimeException(String.format(ExceptionMessage.BEAN_NOT_FOUND, beanName));
        }
        return bean;
    }
}
