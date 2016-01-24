package cn.com.Event.Events;

import lombok.Data;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/1/10.
 */
@Data
public class ClientEvent {

    /**
     * 用户的请求
     */
    private HttpServletRequest request;
}
