package com.itself.demo;

import org.springframework.context.annotation.Bean;

/**
 * @Author xxw
 * @Date 2023/01/10
 */
// @Configuration
public class BeanTestDemo {



    // public void init(){
    //     System.out.println("===bean初始化===");
    // }
    //
    // public void destroy(){
    //     System.out.println("====bean销毁===");
    // }

    @Bean
    public void testBeanAnnotation(){
        System.out.println("====Bean对象已经成功注入spring容器中====");
    }

    // @Bean(initMethod = "init",destroyMethod = "destroy")
    // public BeanTestDemo beanTestDemo(){
    //     return new BeanTestDemo();
    // }

}
