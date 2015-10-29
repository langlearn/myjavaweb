package com.mydomain.myproject.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mydomain.myproject.dao.UserMapper;
import com.mydomain.myproject.modal.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public Page<User> query() {
        PageHelper.startPage(1,10);
        return (Page<User>) userMapper.query();
    }
}
