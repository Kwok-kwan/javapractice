package com.kuo.thread.case3;

import java.util.concurrent.Callable;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/20 12:18
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <100 ; i++) {
            sum+=i;
        }
        return sum;
    }
}
