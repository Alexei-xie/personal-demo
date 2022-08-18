package com.itself.aop.controller;

import com.itself.aop.service.AopUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author xxw
 * @Date 2021/08/17
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private AopUserService aopUserService;

    /**
     * 访问路径 http://localhost:1212/user/findUserNameByTel?tel=1234567
     *
     * @param tel 手机号
     * @return userName
     */
//    @OperationLogDetail()
    @GetMapping("/findUserNameByTel")
    public String findUserNameByTel(@RequestParam("tel") String tel) {
        return aopUserService.findUserName(tel);
    }
}
