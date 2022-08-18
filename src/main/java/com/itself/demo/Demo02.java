package com.itself.demo;

import com.itself.utils.DesensitizationUtils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author xxw
 * @Date 2021/09/16
 */
public class Demo02 {
    private static final Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
    public static void main(String[] args) {
       /* Map<Integer,String> map = new HashMap<>();
        map.put(1,"w");
        map.put(2,"s");
        map.put(3,"f");
        map.put(4,"g");
        map.put(4,"g");
        map.put(4,"g");
        map.put(4,"g");
        System.out.println(map.get(6));*/

        //        String reg = "^.*\\d{11}.*$";
        String reg = "(\\d+)";
        String text = "assssn你好b460106213123413325sdad213123dsad";
        String s = text.trim();
        Matcher matcher = Pattern.compile(reg).matcher(s);
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            if (matcher.group().length() >= 11) {
                Pattern rule = pattern;
                if (rule.matcher(matcher.group()).matches()){
                    String s1 = s.substring(0, s.indexOf(matcher.group()));
                    list.add(s1);
                    list.add(DesensitizationUtils.encryptMobile(matcher.group()).trim());
                    String s2 = s.substring(s.indexOf(matcher.group()) + matcher.group().length());
                    list.add(s2);
                    for (String ss : list) {
                        sb.append(ss);
                    }
                }else {

                }

            }
        }
        System.out.println(sb.toString());
    }
}
