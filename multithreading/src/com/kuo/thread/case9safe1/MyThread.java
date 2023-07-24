package com.kuo.thread.case9safe1;

/**
 * @Author GuoKunKun
 * @Description 同步代码快
 * @Date 2023/7/20 18:56
 */
public class MyThread extends Thread{

    static int ticket = 0 ;
    // 锁对象一定要唯一
    static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            // 锁对象必须唯一
            synchronized (MyThread.class) { // 写在循环外面，就会只有一个线程卖票。
                if (ticket < 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票！");
                } else {
                    break;
                }
            }
        }
    }
}
