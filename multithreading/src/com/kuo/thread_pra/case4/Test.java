package com.kuo.thread_pra.case4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Test
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/28
 * @description 抽奖
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> pool = new ArrayList<>();
        Collections.addAll(pool, 10, 25, 90, 68, 75, 18, 67);
        MyCallable mc = new MyCallable(pool);
        FutureTask<Integer> task1 = new FutureTask<Integer>(mc);
        FutureTask<Integer> task2 = new FutureTask<Integer>(mc);
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.setName("抽奖池1");
        t1.setName("抽奖池2");
        t1.start();
        t2.start();
        Integer i1 = task1.get();
        Integer i2 = task2.get();
        System.out.println(i1);
        System.out.println(i2);
    }
}
