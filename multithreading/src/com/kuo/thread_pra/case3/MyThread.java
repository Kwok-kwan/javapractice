package com.kuo.thread_pra.case3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

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
    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 如果有多个线程，可在run方法中新建List
//        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    if ("抽奖池1".equals(getName())){
                        System.out.println("抽奖箱1"+list1);
                        list1.sort(Integer::compareTo);
                        System.out.println("抽奖箱1最高奖项"+list1.get(list1.size()-1));
                        System.out.println("抽奖箱1最高奖项"+list1.stream().max(Integer::compareTo).orElse(0));
                        System.out.println("抽奖池1奖金总和"+list1.stream().reduce(0,Integer::sum));

                    } else {
                        System.out.println("抽奖箱2"+list2);
                    }
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
//                    System.out.println(getName()+"产生了"+prize+"元大奖");
                    if ("抽奖池1".equals(getName())){
                        list1.add(prize);
                    } else {
                        list2.add(prize);
                    }
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
