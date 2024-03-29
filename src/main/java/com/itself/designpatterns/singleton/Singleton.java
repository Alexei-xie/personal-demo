package com.itself.designpatterns.singleton;

import java.util.concurrent.atomic.AtomicReference;

//方式一(饿汉式)
class Singleton1{
    //私有构造方法，不允许外部new对象
    private Singleton1(){}
    //私有静态属性直接创建对象，外部无法访问，且唯一存在
    private static Singleton1 instance = new Singleton1();
    //公有静态方法，获取唯一对象
    public static Singleton1 getInstance(){
        return instance;
    }
}

//方式二(懒汉式)
class Singleton2{
    //私有构造方法，不允许外部new对象
    private Singleton2(){}
    //私有静态属性，但不创建对象，延迟加载
    private static Singleton2 instance;
    //公有静态方法，使用的时候再创建
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}

//方式三(懒汉式 加锁)
class Singleton3 {
    //私有构造方法，不允许外部new对象
    private Singleton3(){}
    //私有静态属性，但不创建对象，延迟加载
    private static Singleton3 instance;
    //公有静态方法，使用的时候再创建，同时添加synchronized保证线程安全
    public synchronized static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}

//方式四(懒汉式 双重检测)
class Singleton4 {
    //私有构造方法，不允许外部new对象
    private Singleton4(){}
    //volatile修饰，防止指令重排
    private static volatile Singleton4 instance;
    //公有静态方法
    public static Singleton4 getInstance(){
        //第一重校验，检查实例是否存在
        if(instance == null){
            //同步块，保证线程安全
            synchronized(Singleton4.class){
                //第二重校验，检查实例是否存在，如果不存在才真正创建实例
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}

//方式五(静态内部类)
class Singleton5{
    //私有构造方法，不允许外部new对象
    private Singleton5(){}
    //私有静态内部类，包含单例对象
    private static class InnerSingleton{
        private static final Singleton5 instance = new Singleton5();
    }
    //公有静态方法，可以直接获取内部类唯一对象
    public static Singleton5 getInstance(){
        return InnerSingleton.instance;
    }
}

//方式六(CAS式)
class Singleton6{
    private static final AtomicReference<Singleton6> INSTANCE = new AtomicReference<Singleton6>();
    private Singleton6(){}
    public static final Singleton6 getInstance(){
        //等待
        while(true){
            Singleton6 instance = INSTANCE.get();
            if(null == instance){
                INSTANCE.compareAndSet(null,new Singleton6());
            }
            return INSTANCE.get();
        }
    }
}

//方式七(枚举)
enum Singleton7{
    //定义一个枚举，代表了Singleton的一个实例
    INSTANCE;
    public void anyMethod(){
        System.out.println("do any thing");
    }
}
