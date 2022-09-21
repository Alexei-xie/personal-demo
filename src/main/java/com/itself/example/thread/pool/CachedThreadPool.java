package com.itself.example.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  可缓存的线程池 newCachedThreadPool
 * @Author xxw
 * @Date 2022/09/21
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool(); // 创建一个可缓存的线程池
        for (int i = 0; i < 10; i++) {
            int index = i;
            threadPool.submit(()-> System.out.println("i:" + index + " | 线程名称：" + Thread.currentThread().getName()));
        }
    }
}
