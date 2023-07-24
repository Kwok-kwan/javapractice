package com.kuo.thread.case13waitandnotify;

/**
 * @Author GuoKunKun
 * @Description 消费者
 * @Date 2023/7/24 12:19
 */
public class Foodie extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.footFlag == 0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    } else {
                        Desk.count--;
                        System.out.println("吃货在吃面条，还能再吃"+Desk.count+"碗！！！");
                        Desk.lock.notifyAll();
                        Desk.footFlag=0;
                    }
                }
            }
        }
    }
}
