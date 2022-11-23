package com.itself.demo.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Author xxw
 * @Date 2021/09/29
 */
@Data
@Accessors(chain = true)
public class User implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

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

        //测试clone方法
        try {
            User clone = (User)user.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 重写clone方法，主要目的是为了将修饰方法的 protected 权限修改为 public
     */
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
