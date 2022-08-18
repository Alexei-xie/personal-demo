package com.itself.example.泛型;

import com.google.common.collect.Lists;
import com.itself.demo.bean.User;
import com.itself.utils.CheckParamUtil;

import java.util.ArrayList;

/**
 * @Author xxw
 * @Date 2022/03/27
 */
public class GenericDemo {
    public static void main(String[] args) {
        //指定类型
        Generic<String> generic = new Generic<>();
        //创建对应类型的集合
        ArrayList<String> arrayList = Lists.newArrayList("苹果手机", "华为手机", "小米手机");
        //将集合填入类里面的集合
        for (String s : arrayList) {
            generic.addObject(s);
        }
        //获取对应的随机数据
        System.out.println(generic.getObject());
        System.out.println("------------------------------------");
        User user = new User();
        User result = CheckParamUtil.checkParam(user);
        System.out.println(result);


    }
}
