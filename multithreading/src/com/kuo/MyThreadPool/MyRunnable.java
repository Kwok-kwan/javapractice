package com.kuo.MyThreadPool;

/**
 * MyRunnable
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/30
 * @description TODO
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-----");

//        }
    }
}
