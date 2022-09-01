package com.itself.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itself.user.entity.UserPO;
import com.itself.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author xxw
 * @Date 2022/07/09
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void listUser(){
        List<UserPO> list = userService.listAll();
        //System.out.println("list = " + list);
        int i = list.get(0).getPrice().compareTo(new BigDecimal("0E-8"));
        System.out.println(i);
    }

    @Test
    public void listUserPage(){
        Page<UserPO> page = userService.listPage(1, 2);
        System.out.println(page.getRecords());
    }
}