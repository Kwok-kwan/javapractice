package com.kuo.thread_pra.case4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/**
 * MyThread
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/28
 * @description 抽奖
 */
public class MyCallable implements Callable {
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public Object call() throws Exception {
        // 如果有多个线程，可在run方法中新建List
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyCallable.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName()+boxList);
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    boxList.add(prize);
                }
            }
            Thread.sleep(10);
        }
        return boxList.stream().max(Integer::compareTo).orElse(0);
    }
}
