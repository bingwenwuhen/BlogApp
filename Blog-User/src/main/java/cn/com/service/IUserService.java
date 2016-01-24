package cn.com.service;

import cn.com.domain.User;

/**
 * Created by Administrator on 2016/1/6.
 */
public interface IUserService {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 用户登录
     * @param user  用户
     * @return      1表示登录，0表示未登录
     */
    User login(User user);

    /**
     * 根据用户名加载用户
     * @param username  用户名
     * @return          用户
     */
    User load(String username);

    /**
     * 检查用户是否存在
     * @param username  用户名
     * @return          1表示存在，0表示不存在
     */
    int checkUser(String username);

    /**
     * 修改用户资料
     * @param user
     */
    void updateUser(User user);
}
