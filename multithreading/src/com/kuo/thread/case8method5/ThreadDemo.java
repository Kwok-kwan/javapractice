package com.kuo.thread.case8method5;


/**
 * @Author GuoKunKun
 * @Description 线程方法
 * @Date 2023/7/20 18:56
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("飞机");
        t1.start();
        t1.join();
        for (int i = 0; i < 100; i++) {
            System.out.println("main线程坦克"+i);
        }

    }
}
