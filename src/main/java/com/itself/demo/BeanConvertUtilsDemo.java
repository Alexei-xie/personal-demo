package com.itself.demo;

import com.google.common.collect.Lists;
import com.itself.demo.bean.User;
import com.itself.demo.bean.UserDTO;
import com.itself.utils.BeanConvertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xxw
 * @Date 2023/03/17
 */
public class BeanConvertUtilsDemo {
    public static void main(String[] args) {
        //==================== copy  Object =====================
        User user = new User().setAge("20").setName("xxw");
        // user = null;     //当user对象为空的时候，copy方法不会报错，也只会返回null
        System.out.println("复制前的数据："+user);
        //普通写法
        UserDTO userDTO = BeanConvertUtils.convertTo(user, UserDTO::new);
        System.out.println("复制后的数据："+userDTO);
        //lambda写法，可以对不同类型的字段进行手动赋值
        UserDTO dto = BeanConvertUtils.convertTo(user, UserDTO::new, (u, d) -> d.setAge(Integer.valueOf(u.getAge())));
        System.out.println("复制后的数据："+dto);

        System.out.println("=================================================");
        //==================== copy  List<Object> =====================
        User user1 = new User().setAge("22").setName("xw");
        ArrayList<User> users = Lists.newArrayList(user1);
        System.out.println("复制前的数据："+users);
        //普通写法
        List<UserDTO> dtos = BeanConvertUtils.convertListTo(users, UserDTO::new);
        System.out.println("复制后的数据："+dtos);
        //lambda写法，可以对不同类型的字段进行手动赋值
        List<UserDTO> dtoList = BeanConvertUtils.convertListTo(users, UserDTO::new, (u, d) -> d.setAge(Integer.valueOf(u.getAge())));
        System.out.println("复制后的数据："+dtoList);

    }
}
