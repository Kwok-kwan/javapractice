package com.kuo.MyThreadPool1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * MyThreadPool1
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/30
 * @description TODO
 */
public class MyThreadPool1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, // 核心线程数量
                6, // 最大的线程数量>=核心线程数量
                60, // 空闲线程最大存活时间
                TimeUnit.SECONDS, // 时间单位
                new ArrayBlockingQueue<>(3), // 任务队列 排队的客户
                Executors.defaultThreadFactory(), // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy() // 任务拒绝策略

        );
//        pool.submit()
    }
}
