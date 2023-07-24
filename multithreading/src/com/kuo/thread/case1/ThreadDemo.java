package com.kuo.thread.case1;

/**
 * @Author GuoKunKun
 * @Description test
 * @Date 2023/7/18 12:34
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
