package com.itself.example.单例;

/**
 * @Author xxw
 * @Date 2022/05/17
 */
public class LazyDemo {
    private  String value;
    private LazyDemo(){}
    private  String getInstance(){
        if (value == null){
            value = "new LazyDemo()";
        }
        return value;
    }
}
