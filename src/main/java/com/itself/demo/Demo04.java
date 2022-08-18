package com.itself.demo;

import java.util.regex.Pattern;

/**
 * @Author xxw
 * @Date 2021/09/29
 */
public class Demo04 {
    public static void main(String[] args) {
      /*  StringBuilder sb = new StringBuilder();
        sb.append("123");
        sb.append("456");
        System.out.println(sb.toString());*/
        String phone = "1523716821300";
        Pattern rule = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        boolean matches = rule.matcher(phone).matches();
        System.out.println("matches = " + matches);

    }
}
