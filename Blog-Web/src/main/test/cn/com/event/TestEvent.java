package cn.com.event;

import cn.com.container.ServiceProvinder;
import com.google.common.eventbus.AsyncEventBus;
import org.junit.Test;

/**
 * Created by xiaxuan on 16/1/26.
 */
public class TestEvent {

    @Test
    public void testAsyncEventBus() {
        AsyncEventBus eventBus = (AsyncEventBus) ServiceProvinder.getService("eventBus");
        System.out.println(eventBus);
    }

}
