package com.itself.demo;

import org.junit.Test;

import java.time.Instant;

/**
 * @Author xxw
 * @Date 2021/08/18
 */
public class Test01 {
    @Test
    public void test01(){
        Instant now = Instant.now();
        System.out.println("now = " + now);
    }
    @Test
    public void test02(){
        char c = 's';
        int i = 1;
        System.out.println("i = " + i);
        System.out.println("c = " + c);
    }
}
