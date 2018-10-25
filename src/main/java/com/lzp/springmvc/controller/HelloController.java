package com.lzp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("message", "Hello Spring MVC FrameWork");
        return "hello";
    }
}
