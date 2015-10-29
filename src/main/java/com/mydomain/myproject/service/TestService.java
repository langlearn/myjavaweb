package com.mydomain.myproject.service;

import com.google.common.collect.ImmutableMap;
import com.mydomain.myproject.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yjj on 2014/5/28.
 */
@Service
public class TestService {
    @Resource
    private TestDao testDao;

    public Map<String, Object> query() {
        List<Map<String,Object>> data=testDao.query();
        return ImmutableMap.of("success", true, "data", data);
    }
}
