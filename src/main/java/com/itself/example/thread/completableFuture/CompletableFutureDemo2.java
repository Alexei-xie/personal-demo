package com.itself.example.thread.completableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @Author xw
 * @Date 2022/07/06
 *      2-计算结果完成时.可以执行的方法
 *      whenComplete(BiConsumer<? super T,? super Throwable> action)
 *      whenCompleteAsync(BiConsumer<? super T,? super Throwable> action)
 *      whenCompleteAsync(BiConsumer<? super T,? super Throwable> action, Executor executor)
 *
 */
public class CompletableFutureDemo2 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "hello";
        }).whenComplete((v,e) -> {
            // hello
            System.out.println(v);
        });
        // hello
        System.out.println(future.get());
    }
}
