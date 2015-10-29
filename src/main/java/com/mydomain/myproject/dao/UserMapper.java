package com.mydomain.myproject.dao;

import com.mydomain.myproject.modal.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yangjj on 2015/10/29.
 */
public interface UserMapper {
    @Select("SELECT * FROM users WHERE id = #{id}")
    User getUser(@Param("id") int id);
}
