package com.kuo.thread.case13waitandnotify;

/**
 * @Author GuoKunKun
 * @Description 桌子
 * @Date 2023/7/24 12:06
 */
public class Desk {
    // 是否有面条 0：有   1：没有
    public static int footFlag = 0;

    // 总个数
    public static int count = 10;


    // 锁对象
    public static Object lock = new Object();

}
