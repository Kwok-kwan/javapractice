package com.kuo.thread.case13waitandnotify;



/**
 * @Author GuoKunKun
 * @Description 生产者
 * @Date 2023/7/24 12:09
 */
public class Cook extends Thread {
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                } else {
                    if (Desk.footFlag == 1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println("厨师做了一碗面");
                        Desk.footFlag = 1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
