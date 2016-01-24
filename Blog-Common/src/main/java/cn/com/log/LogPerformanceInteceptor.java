package cn.com.log;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Administrator on 2016/1/20.
 */
@Slf4j
public class LogPerformanceInteceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long methodegin = System.currentTimeMillis();
        Object result = invocation.proceed();
        long during = System.currentTimeMillis() - methodegin;
        //只有加上注解的才进行解析
        if (invocation.getMethod().isAnnotationPresent(LogPerformance.class)) {
            log.info("blog-db : Class {} , Method {} execute time {} ms ",
                    invocation.getMethod().getDeclaringClass().getName(), invocation.getMethod().getName(), during);
        }
        return result;
    }
}
