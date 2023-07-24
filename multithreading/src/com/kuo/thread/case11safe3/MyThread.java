package com.kuo.thread.case11safe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author GuoKunKun
 * @Description 同步代码快
 * @Date 2023/7/20 18:56
 */
public class MyThread extends Thread {

    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 锁对象必须唯一
//            synchronized (MyThread.class) { // 写在循环外面，就会只有一个线程卖票。
            lock.lock();
            try {
                if (ticket < 100) {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票！");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
//            }
        }
    }
}
