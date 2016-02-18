package cn.com.ecache;

import cn.com.container.ServiceProvinder;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.junit.Test;

/**
 * Created by Administrator on 2016/1/24.
 */
public class TestEcache {

    @Test
    public void Test() {
        Cache cache = (Cache) ServiceProvinder.getService("ehCache");
        Element lgElement = new Element("loginName", "xiaxuan");
        Element pwElement = new Element("password", "xiaxuan");
        cache.put(lgElement);
        cache.put(pwElement);
        System.out.println(cache.get("loginName"));
    }
}
