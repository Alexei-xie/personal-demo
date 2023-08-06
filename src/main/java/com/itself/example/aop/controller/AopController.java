package com.itself.example.aop.controller;

import com.itself.example.aop.service.AopUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author xxw
 * @Date 2021/08/17
 */
@RestController
@Controller
@RequestMapping("aop")
public class AopController {
    @Resource
    private AopUserService aopUserService;

    /**
     * http://localhost:1212/aop/xw/findUserNameByTel?tel=1234567
     */
    // @OperationLogDetail()
    @GetMapping("/{user}/findUserNameByTel")
    public String findUserNameByTel(@PathVariable String user, @RequestParam("tel") String tel) {
        return aopUserService.findUserName(user,tel);
    }
}
