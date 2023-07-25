package com.kuo.thread.case14waitandnotify;


import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author GuoKunKun
 * @Description 消费者
 * @Date 2023/7/24 12:19
 */
public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                String take = queue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
