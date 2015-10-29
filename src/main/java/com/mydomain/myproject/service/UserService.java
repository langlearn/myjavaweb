package com.mydomain.myproject.service;

import com.mydomain.myproject.dao.UserMapper;
import com.mydomain.myproject.modal.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangjj on 2015/10/29.
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User get(int id) {
        User user = userMapper.getUser(id);
        return user;
    }
}
