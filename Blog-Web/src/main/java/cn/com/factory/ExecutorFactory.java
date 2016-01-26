package cn.com.factory;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by xiaxuan on 16/1/26.
 */
public class ExecutorFactory {

    public Executor getExecutorService(){
        return Executors.newFixedThreadPool(8);
    }
}
