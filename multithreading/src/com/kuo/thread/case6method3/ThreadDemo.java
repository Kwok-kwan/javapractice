package com.kuo.thread.case6method3;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/21 12:25
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();
        MyThread02 myThread02 = new MyThread02();
        myThread01.setName("女神");
        myThread02.setName("备胎");
        // 陆续结束
        myThread02.setDaemon(true);
        myThread01.start();
        myThread02.start();
    }
}
