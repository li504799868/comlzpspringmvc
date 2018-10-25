package com.lzp.springmvc.controller;

import com.lzp.springmvc.bean.Student;
import com.lzp.springmvc.exception.StudentException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    /**
     *  ModelAndView student参数表示返回的jsp页面的名称
     *               command 插入的自定义属性的key
     *               第三个参数是插入的自定义属性的value
     * */
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    @ExceptionHandler({StudentException.class})
    public String addStudent(ModelMap modelMap, @ModelAttribute("SpringWeb") Student student){

        if (student.getName().length() < 5){
            throw new StudentException("Student name is too short");
        }

        if (student.getAge() < 1){
            throw new IllegalArgumentException("Student age is too small");
        }

        modelMap.addAttribute("name", student.getName());
        modelMap.addAttribute("age", student.getAge());
        return "result";
    }


//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    @ExceptionHandler({StudentException.class})
//    public String test(ModelMap modelMap){
//        modelMap.addAttribute("name", "1111");
//        modelMap.addAttribute("age", 2);
//        return "/exception/ExceptionPage";
//    }

}
