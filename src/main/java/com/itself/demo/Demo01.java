package com.itself.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xxw
 * @Date 2021/08/18
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        // Stream.iterate(0,i -> i+1).parallel().limit(5).forEach(System.out::println);
        // String result = HttpUtil.get("https://www.baidu.com");
        // System.out.println(result);
    }
}
