package com.kuo.thread.case3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author GuoKunKun
 * @Description callable
 * @Date 2023/7/20 12:16
 */
public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> task = new FutureTask<Integer>(mc);
        Thread t1 = new Thread(task);
        t1.start();
        Integer integer = task.get();
        System.out.println(integer);
    }
}
