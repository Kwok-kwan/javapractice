package com.kuo.thread.case13waitandnotify;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/24 12:24
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Cook c = new Cook();
        Foodie f = new Foodie();
        c.setName("厨师");
        f.setName("吃货");
        c.start();
        f.start();
    }
}
