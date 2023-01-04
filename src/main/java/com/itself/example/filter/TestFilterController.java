package com.itself.example.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xxw
 * @Date 2023/01/04
 */
@RestController
@RequestMapping("/filter")
public class TestFilterController {


    @GetMapping("/test")
    public String testFilter(){
        System.out.println("filter执行成功");
        return "filter";
    }

}
