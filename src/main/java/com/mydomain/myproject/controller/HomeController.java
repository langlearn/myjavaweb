package com.mydomain.myproject.controller;

import com.mydomain.myproject.ConfigInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yjj on 2014/5/28.
 */
@Controller
public class HomeController {
    @Resource
    private ConfigInfo configInfo;

    @RequestMapping({"/home","/"})
    public String home(){
        return "home";
    }

    @RequestMapping({"/config"})
    @ResponseBody
    public ConfigInfo config(){
        return configInfo;
    }

    @RequestMapping({"/json/map"})
    @ResponseBody
    public Map<String,Object> jsonMap(){
        Map<String,Object> result=new HashMap<String, Object>();
        result.put("a",1);
        result.put("b",2);
        return result;
    }

}
