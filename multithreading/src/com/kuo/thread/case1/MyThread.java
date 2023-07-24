package com.kuo.thread.case1;

/**
 * @Author GuoKunKun
 * @Description 线程,继承Thread
 * @Date 2023/7/18 12:31
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + "hello world!");
        }
    }
}
