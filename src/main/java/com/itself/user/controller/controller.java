package com.itself.user.controller;

import com.itself.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author xxw
 * @Date 2023/07/19
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class controller {
    @Resource
    private UserService userService;

    @Resource
    private ThreadPoolTaskExecutor taskExecutor;

    @GetMapping("/test")
    public void printResult() {
        log.info("start");
        System.out.println("result=" + userService.listAll());
        taskExecutor.execute(() -> {
            for (int i = 0; i < 10; i++) {
                log.info(String.valueOf(i));
                if (i == 5) {
                    System.out.println(i / 0);
                }
            }
        });
        log.info("=====");
    }
}
