package com.kuo.thread.case2;

/**
 * @Author GuoKunKun
 * @Description 实现runnable 接口
 * @Date 2023/7/18 12:37
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "hello world" + i);
        }
    }
}
