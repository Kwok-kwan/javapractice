package com.kuo.ThreadTest.case2;

import java.util.Random;

/**
 * MyThread
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/28
 * @description TODO
 */
public class MyThread extends Thread {
    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包！");
            } else {
                double prize = 0;
                if (count == 1) {
                    prize = money;
                } else {
                    Random random = new Random();
                    double bounds = money - (count - 1) * MIN;
                    prize = bounds * random.nextDouble();
                    if (prize < MIN){
                        prize = MIN;
                    }
                }
                money -= prize;
                count--;
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }
}
