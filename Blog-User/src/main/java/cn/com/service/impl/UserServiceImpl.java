package cn.com.service.impl;

import cn.com.domain.User;
import cn.com.mapper.UserMapper;
import cn.com.md5.MD5keyBean;
import cn.com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/1/6.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Inject
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        //首先要对密码进行加密
        user.setPassword(new MD5keyBean().getkeyBeanofStr(user.getPassword()));
        userMapper.addUser(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user.getUsername(), new MD5keyBean().getkeyBeanofStr(user.getPassword()));
    }

    @Override
    public User load(String username) {
        return userMapper.load(username);
    }

    @Override
    public int checkUser(String username) {
        return userMapper.checkUser(username);
    }

    @Override
    public void updateUser(User user) {
        user.setPassword(new MD5keyBean().getkeyBeanofStr(user.getPassword()));
        userMapper.updateUser(user);
    }
}
