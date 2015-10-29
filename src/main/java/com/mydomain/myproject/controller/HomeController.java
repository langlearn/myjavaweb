package com.mydomain.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yjj on 2014/5/28.
 */
@Controller
public class HomeController {


    @RequestMapping({"/home","/"})
    public String home(){
        return "home";
    }

}
