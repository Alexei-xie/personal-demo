package com.itself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xxw
 * @Date 2021/08/17
 */
@SpringBootApplication
//@ComponentScan("com.itself.user")
//@MapperScan("com.itself.user.mapper") // 让springboot知道mapper是这个项目的持久层  可以指定要扫描的Mapper类的包的路径
public class AopApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class,args);
    }
}
