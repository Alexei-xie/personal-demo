package com.itself.demo;

import cn.hutool.http.HttpUtil;
import com.itself.demo.bean.User;

import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * @Author xxw
 * @Date 2021/08/18
 */
public class Demo01 {
    public static void main(String[] args) {
        // Stream.iterate(0,i -> i+1).parallel().limit(5).forEach(System.out::println);
        String result = HttpUtil.get("https://www.baidu.com");
        System.out.println(result);
    }
}
