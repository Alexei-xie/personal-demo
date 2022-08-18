package com.itself.example.线程.completableFuture;

import java.util.concurrent.CompletableFuture;


/**
 *
 *   简书地址： https://www.jianshu.com/p/bf77dc48d4d2
 *   csdn地址：https://blog.csdn.net/sermonlizhi/article/details/123356877
 *
 * @Author xw
 * @Date 2022/7/6
 *      1-创建CompletableFuture对象
 *      方法名  功能描述
 *      1.completedFuture(U value)    返回一个已经计算好的CompletableFuture
 *      2.runAsync(Runnable runnable) 使用ForkJoinPool.commonPool()作为线程池执行任务，没有返回值
 *      3.runAsync(Runnable runnable, Executor executor)  使用指定的线程池执行任务，没有返回值
 *      4.supplyAsync(Supplier<U> supplier)   使用ForkJoinPool.commonPool()作为线程池执行任务，有返回值
 *      5.supplyAsync(Supplier<U> supplier, Executor executor)    使用指定的线程池执行任务，有返回值
 */
public class CompletableFutureDemo1 {
    public static void main(String[] args) throws Exception {
        //1.completedFuture(U value)    返回一个已经计算好的CompletableFuture：参数 Integer value
        CompletableFuture<Integer> intFuture = CompletableFuture.completedFuture(100);
        //输出100
        System.out.println("1-1 "+intFuture.get());

        //2.runAsync(Runnable runnable) 使用ForkJoinPool.commonPool()作为线程池执行任务，没有返回值
        //输出hello
        CompletableFuture<Void> voidFuture = CompletableFuture.runAsync(() -> System.out.println("2-1 hello"));
        //输出null
        System.out.println("2-2 "+voidFuture.get());

        //4.supplyAsync(Supplier<U> supplier)   使用ForkJoinPool.commonPool()作为线程池执行任务，有返回值
        CompletableFuture<String> stringFuture = CompletableFuture.supplyAsync(()->"hello");
        //输出hello
        System.out.println("4-1 "+stringFuture.get());
    }
}
