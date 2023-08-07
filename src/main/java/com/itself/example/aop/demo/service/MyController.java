package com.itself.example.aop.demo.service;

import com.itself.example.aop.demo.annotation.MyAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myAnnotation")
public class MyController {

    @MyAnnotation
    @GetMapping("/{param1}/{param2}")
    public void myMethod(@PathVariable String param1,@PathVariable int param2){
        System.out.println();
    }
}