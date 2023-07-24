package com.kuo.thread.case10safe2;

/**
 * @Author GuoKunKun
 * @Description 同步方法
 * @Date 2023/7/23 23:08
 */
public class MyRunnable implements Runnable{

    // 对象只建一次，没有必要设置成静态，因为是作为参数传入Thread
    int ticket = 0;

    @Override
    public void run() {
        while (true){
            if (method()) break;
        }
    }

    private  synchronized boolean method() {
        if (ticket == 100)
            return true;
        else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"在卖第"+ticket+"张票");
        }
        return false;
    }
}
