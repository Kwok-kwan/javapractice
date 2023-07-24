package com.kuo.thread.case6method3;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/21 12:24
 */
public class MyThread02 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
