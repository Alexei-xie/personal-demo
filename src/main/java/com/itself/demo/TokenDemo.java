package com.itself.demo;

import com.itself.utils.JwtUtils;

/**
 * @Author xxw
 * @Date 2021/12/23
 */
public class TokenDemo {
    public static void main(String[] args) {

        String token = JwtUtils.createToken("xxw", "12");
        System.out.println(token);
    }
}
