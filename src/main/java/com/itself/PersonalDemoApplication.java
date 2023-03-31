package com.itself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author xxw
 * @Date 2021/08/17
 */
@SpringBootApplication
//@ComponentScan("com.itself.user")
//@MapperScan("com.itself.user.mapper") // 让springboot知道mapper是这个项目的持久层  可以指定要扫描的Mapper类的包的路径，有mapper注解就不需要这个了
@ServletComponentScan("com.itself.example.filter") //描包的注解，开启包扫描,配合MyFilter使用
public class PersonalDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalDemoApplication.class,args);
    }

}
