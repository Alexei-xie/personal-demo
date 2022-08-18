package com.itself.demo;

import java.util.HashMap;

/**
 * @Author xxw
 * @Date 2021/09/18
 */
public class Demo03 {
    public static void main(String[] args) {
        String[] files = {"aaa"};

        HashMap<String, String> map = new HashMap<>();
        map.put("aaa","111");
        map.put("bbb","222");
        map.forEach((k,v)->{
            if (v.equals("222")){
                files[0] = k;
            }
        });
        System.out.println(files[0]);
    }
}
