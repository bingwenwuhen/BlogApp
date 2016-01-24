package cn.com.controller;

import cn.com.Event.Events.ClientEvent;
import cn.com.domain.User;
import cn.com.service.IUserService;
import com.google.common.eventbus.EventBus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/1/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Inject
    private IUserService userService;

    @Inject
    private EventBus eventBus;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, User user, Model model) {
        user = userService.login(user);
        if (user != null) {
            ClientEvent clientEvent = new ClientEvent();
            clientEvent.setRequest(request);
            eventBus.post(clientEvent);
            model.addAttribute("user", user);
        } else {
            return "login";
        }
        return "blog/index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request, User user) {
        userService.addUser(user);
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public Map<String, Object> checkUser(String username) {
        Map<String, Object> result = new HashMap<>();
        boolean exist = userService.checkUser(username) > 0 ? true : false;
        result.put("result", exist);
        return result;
    }
}
