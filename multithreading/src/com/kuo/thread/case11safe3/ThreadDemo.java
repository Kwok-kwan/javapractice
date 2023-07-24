package com.kuo.thread.case11safe3;

/**
 * @Author GuoKunKun
 * @Description 买票
 * @Date 2023/7/23 22:45
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
