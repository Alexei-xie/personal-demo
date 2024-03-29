package com.itself.example.annotation.redis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  自定义注解+AOP+Redis 防止重复提交
 * @Author xxw
 * @Date 2022/10/17
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoRepeatSubmit {
    /**
     * 设置请求锁定时间
     */
    int lockTime() default 5;
}
