package com.kuo.thread.case5method2;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/21 12:17
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread plane = new Thread(myRunnable, "飞机");
        Thread tanker = new Thread(myRunnable, "坦克");
        plane.setPriority(Thread.MIN_PRIORITY);
        tanker.setPriority(Thread.MAX_PRIORITY);
        plane.start();
        tanker.start();
        System.out.println(plane.getPriority());
        System.out.println(tanker.getPriority());
        System.out.println(Thread.currentThread().getPriority());

    }
}
