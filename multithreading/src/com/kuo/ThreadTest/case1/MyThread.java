package com.kuo.ThreadTest.case1;

/**
 * @Author GuoKunKun
 * @Description 多线程输出奇数
 * @Date 2023/7/26 12:08
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    private static int oodNumber = 1;
    private static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    if (oodNumber > 100)
                        break;
                    System.out.println(getName() + "输出" + oodNumber);
                    oodNumber += 2;
                    lock.notifyAll();
                    lock.wait();
                } catch (Exception  e) {
                    e.printStackTrace();
                } finally {
                    lock.notifyAll();
                }
            }
        }
    }
}
