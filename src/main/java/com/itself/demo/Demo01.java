package com.itself.demo;

import com.itself.demo.bean.User;

import java.util.logging.Logger;

/**
 * @Author xxw
 * @Date 2021/08/18
 */
public class Demo01 {
    public static void main(String[] args) {
        User user = new User().setAge("11").setName("xxw");
        try {
            User clone = (User)user.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
