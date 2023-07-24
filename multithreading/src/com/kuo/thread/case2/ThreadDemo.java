package com.kuo.thread.case2;

import java.util.Arrays;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/18 12:37
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        MyRun myRun1 = new MyRun();
        Thread t1 = new Thread(myRun);
        t1.setName("线程1");
        Thread t2= new Thread(myRun1);
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
