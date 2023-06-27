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
     * 访问路径 http://localhost:1212/aop/findUserNameByTel?tel=1234567
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
