package cn.com.web;

import lombok.Data;

/**
 * Created by Administrator on 2016/1/10.
 */
@Data
public class Client {

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户ip
     */
    private  String ip;

    /**
     * 浏览器类型
     */
    private String browser;

    /**
     * 浏览器版本
     */
    private String browserVersion;
}
