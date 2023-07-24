package com.kuo.thread.case4method;


import java.util.HashMap;

/**
 * @Author GuoKunKun
 * @Description 线程方法
 * @Date 2023/7/20 18:56
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");
        t1.start();
        t2.start();
        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
        /*System.out.println("11111111111111111111111111");
        Thread.sleep(5000);
        System.out.println("22222222222222222222222222");*/
    }
}
