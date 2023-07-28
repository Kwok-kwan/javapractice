package com.kuo.thread_pra.case3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Test
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/28
 * @description 抽奖
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> pool = new ArrayList<>();
        Collections.addAll(pool,10,25,90,68,75,18,67);
        MyThread t1 = new MyThread(pool);
        MyThread t2 = new MyThread(pool);
        t1.setName("抽奖池1");
        t2.setName("抽奖池2");
        t1.start();
        t2.start();

    }
}
