package com.itself.example.annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xxw
 * @Date 2022/10/17
 */

@RestController
public class TestController {

    @NoRepeatSubmit(lockTime = 10)
    @GetMapping("/test")
    public void test(){
        System.out.println("1111");
    }

}
