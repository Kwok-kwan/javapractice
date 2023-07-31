package com.kuo.MyThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * MyThreadPoolDemo
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/30
 * @description TODO
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
//        pool1.shutdown();
    }
}
