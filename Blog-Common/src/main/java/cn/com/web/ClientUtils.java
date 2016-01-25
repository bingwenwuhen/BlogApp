package cn.com.web;

import lombok.Data;

/**
 * Created by Administrator on 2016/1/10.
 */
public class ClientUtils {

    /**
     * 客户端相关信息
     */
    private static Client client;

    public static Client getClient() {
        if (client == null) {
            client = new Client();
        }
        return client;
    }
}
