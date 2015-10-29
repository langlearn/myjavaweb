package com.mydomain.myproject.dao;

import com.mydomain.myproject.modal.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by yangjj on 2015/10/29.
 */
@Repository
public interface UserMapper {
    User getUser(int id);
}
