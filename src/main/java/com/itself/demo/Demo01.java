package com.itself.demo;

import java.util.logging.Logger;

/**
 * @Author xxw
 * @Date 2021/08/18
 */
public class Demo01 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Demo01.class.getName());
        String code = String.valueOf((int)((Math.random()*9+1)*100000));
        logger.info("-----");
        System.out.println("code = " + code);
    }
}
