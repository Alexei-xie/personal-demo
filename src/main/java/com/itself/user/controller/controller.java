package com.itself.user.controller;

import com.itself.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xxw
 * @Date 2023/07/19
 */
@RestController
@RequestMapping("/user")
public class controller {

    private UserService userService;

    public controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public void printResult(){
        System.out.println("result="+ userService.listAll());
    }
}
