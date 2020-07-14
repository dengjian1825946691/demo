package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hell0 woefesn!";
    }

    @RequestMapping("index")
    public String index(){
        System.out.println("你好你好");
        return "index";
    }

}
