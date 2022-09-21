package com.itself.example.strategy;

/**
 * @Author xxw
 * @Date 2022/06/08
 */
public interface Person {
    /**
     * 执行
     */
    void action();
}

class LiSi implements Person{
    @Override
    public void action() {
        System.out.println("我是李四");
    }
}

class ZhangSan implements Person{
    @Override
    public void action() {
        System.out.println("我是张三");
    }
}

