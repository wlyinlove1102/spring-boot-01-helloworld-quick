package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王路遥
 * @create 2018-08-12 17:06
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick!";
    }
}
