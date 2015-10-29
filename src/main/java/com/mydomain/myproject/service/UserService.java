package com.mydomain.myproject.service;

import com.mydomain.myproject.dao.CommonDao;
import com.mydomain.myproject.modal.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yang on 2015/10/30.
 */
@Service
public class UserService {
    @Resource
    private CommonDao commonDao;

    public List<User> queryAll(){
        return commonDao.findAll(User.class);
    }
}
