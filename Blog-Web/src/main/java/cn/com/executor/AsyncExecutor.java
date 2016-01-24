package cn.com.executor;

import lombok.Data;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2016/1/11.
 */
@Data
public class AsyncExecutor {

    private Executor executor;

    public AsyncExecutor() {
        executor = Executors.newFixedThreadPool(10);
    }
}
