package com.lzp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 重定向Controller
 * */
@Controller
public class RedirectController {

    /**
     * 重定向到finalPage请求
     */
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }

    /***
     * 定位到final页面
     */
    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "/redirect/final";
    }

}
