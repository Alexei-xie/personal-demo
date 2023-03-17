package com.itself.demo.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author xxw
 * @Date 2021/11/10
 */
@Data
@Accessors(chain = true)
public class UserDTO{

    private String name ;

    private Integer age;


    public static void main(String[] args) {
        UserDTO user = new UserDTO();
//        user.setName("null")；
        System.out.println(user.getAge() + "22");
    }
}
