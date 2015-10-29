package com.mydomain.myproject.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yjj on 2014/5/28.
 */
@Repository
public class TestDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Map<String,Object>> query(){
        String sql="select * from test";
        return jdbcTemplate.queryForList(sql);
    }
}
