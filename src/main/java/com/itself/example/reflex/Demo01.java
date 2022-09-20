package com.itself.example.reflex;

import com.itself.demo.bean.User;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射
 * @Author xxw
 * @Date 2022/09/20
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("张三").setAge("20");
        Class<? extends User> clazz = user.getClass(); // 返回该对象的运行时类
        Field[] fields = clazz.getDeclaredFields(); // 获取该类下的所有属性
        List<String> list = new ArrayList<>();
        for (Field field : fields) {
            field.setAccessible(true); // 暴力反射，以便于操作该字段的属性
            String name = field.getName(); // 获取该字段的属性名称
            if ("name".equals(name)){   // 根据某个已知的属性名称去做判断，然后给该属性赋值
                field.set(user,"李四");
            }
            list.add(name);
            System.out.println(field.getType());    // 获取该属性的字段类型
            System.out.println(field.get(user));    // field.get(obj) 获取该对象该字段的value值
            list.add(String.valueOf(field.get(user)));
        }
        System.out.println(list);
    }
}
