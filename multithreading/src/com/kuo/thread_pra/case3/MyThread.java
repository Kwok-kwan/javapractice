package com.kuo.thread_pra.case3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * MyThread
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/28
 * @description 抽奖
 */
public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    System.out.println(getName()+"产生了"+prize+"元大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
