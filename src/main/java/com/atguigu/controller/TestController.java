package com.atguigu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public static void main(String[] args) {
        System.out.println("hello git!");
        System.out.println("hello git2!");
        System.out.println("hello git3!");
        System.out.println("master test");
        System.out.println("hot-fix test");
    }

    @GetMapping("/")
    public String test(){
        return "hello";
    }



}
