package com.kuo.thread.case14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/24 18:51
 */
public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
