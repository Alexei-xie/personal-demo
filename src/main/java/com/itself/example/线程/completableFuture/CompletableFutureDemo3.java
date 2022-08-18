package com.itself.example.线程.completableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @Author xw
 * @Date 2022/07/06
 *      3-转换，消费，执行
 *      方法名      功能描述
 *      thenApply    获取上一个任务的返回，并返回当前任务的值
 *      thenAccept   获取上一个任务的返回，单纯消费，没有返回值
 *      thenRun      上一个任务执行完成后，开始执行thenRun中的任务
 */
public class CompletableFutureDemo3 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            return "hello ";
        }).thenAccept(str -> {
            // hello world
            System.out.println(str + "world");
        }).thenRun(() -> {
            // task finish
            System.out.println("task finish");
        });
    }
}
