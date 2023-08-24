package com.itself.demo;

import com.google.common.collect.Lists;
import com.itself.demo.bean.User;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * @Author xxw
 * @Date 2021/09/29
 */
public class UserDemo {
    public static void main(String[] args) throws ParseException {

        User user = new User();
        user.setAge(" 1 ");

        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(objects.size());
        System.out.println(user.getAge().equals(null));
        System.out.println(Lists.newArrayList(user));
        System.out.println(Lists.newArrayList(user).size());
    }
}
