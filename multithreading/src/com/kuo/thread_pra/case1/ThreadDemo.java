package com.kuo.thread_pra.case1;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/26 12:12
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("工作台1");
        MyThread t2 = new MyThread("工作台2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

    }
}
