package com.itself.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.itself.user.entity.UserPO;
import com.itself.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println("list = " + list);
    }

    @Test
    public void listUserPage(){
        Page<UserPO> page = userService.listPage(1, 2);
        System.out.println(page.getRecords());
    }

    @Test
    public void test(){
        ArrayList<String> list = Lists.newArrayList("张三", "章三", "张三");
        Collections.sort(list);
        System.out.println(list);
    }

    @Value("${demo.test}")
    private  int count;
    @Test
    public void testValue() {
        System.out.println(count);
    }
}