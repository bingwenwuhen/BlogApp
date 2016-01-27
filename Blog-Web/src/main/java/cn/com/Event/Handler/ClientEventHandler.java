package cn.com.Event.Handler;

import cn.com.Event.Events.ClientEvent;
import cn.com.domain.User;
import cn.com.service.IUserService;
import cn.com.web.ClientUtils;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import eu.bitwalker.useragentutils.UserAgent;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Administrator on 2016/1/10.
 */
@Singleton
public class ClientEventHandler {

    @Inject
    private AsyncEventBus eventBus;

    @Inject
    private IUserService userService;

    @PostConstruct
    public void init() {
        eventBus.register(this);
    }

    @Subscribe
    public void handler(ClientEvent clientEvent) {
        ClientUtils.getClient().setUsername(clientEvent.getRequest().getParameter("username"));
        User user = userService.load(clientEvent.getRequest().getParameter("username"));
        ClientUtils.getClient().setUserId(user.getId());
        UserAgent userAgent = new UserAgent(clientEvent.getRequest().getHeader("user-agent"));
        ClientUtils.getClient().setBrowser(userAgent.getBrowser().getName());
        ClientUtils.getClient().setBrowserVersion(userAgent.getBrowser().getBrowserType().getName());
        ClientUtils.getClient().setIp(clientEvent.getRequest().getRemoteAddr());
    }
}
