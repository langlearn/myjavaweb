package com.mydomain.myproject.controller;

import com.mydomain.myproject.ConfigInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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
    public void config(){
        System.out.println(configInfo);
        System.out.println(configInfo.getKey1());
    }

}
