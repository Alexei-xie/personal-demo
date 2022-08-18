package com.itself.demo.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Author xxw
 * @Date 2021/09/29
 */
@Data
public class User {

    private String name = "2";
    private String age ;

    public static void main(String[] args) {
        User user = new User();
//        user.setName("null")；
        System.out.println(user.getAge() + "22");


        BigDecimal b = new BigDecimal(0);
        BigDecimal a = new BigDecimal(202.200);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        System.out.println(decimalFormat.format(b));


        System.out.println(b);
        System.out.println(b.compareTo(BigDecimal.ZERO));

        System.out.println(a.subtract(b));
        if (a.compareTo(b) > -1) {
            System.out.println("a大于等于b");
        }

        if (a.compareTo(b) < 1) {
            System.out.println("a小于等于b");
        }

        if(a.compareTo(b) == -1){
            System.out.println("a小于b");
        }

        if(a.compareTo(b) == 0){
            System.out.println("a等于b");
        }

        if(a.compareTo(b) == 1) {
            System.out.println("a大于b");
        }
    }
}
