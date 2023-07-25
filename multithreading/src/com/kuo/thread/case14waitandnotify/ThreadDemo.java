package com.kuo.thread.case14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author GuoKunKun
 * @Description 阻塞队列
 * @Date 2023/7/24 18:50
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);
        cook.start();
        foodie.start();
    }
}
