package com.itself.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author xxw
 * @Date 2021/08/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test02 {

    @Test
    public void test(){
        char c = 's';
        int i = 1;
        System.out.println("i = " + i);
        System.out.println("c = " + c);
    }
}
