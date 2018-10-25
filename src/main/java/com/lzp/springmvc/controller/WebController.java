package com.lzp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    /**
     * 重定向到静态资源页面
     * */
    @RequestMapping(value = "/static/redirect", method = RequestMethod.GET)
    public String redirect(){
        return "redirect:/static/page.html";
    }

}
