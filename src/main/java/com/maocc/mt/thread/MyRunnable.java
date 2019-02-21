package com.maocc.mt.thread;

/**
 * @author maocc
 * @description
 * @date: 2019/2/21 11:23
 */
public class MyRunnable implements Runnable {
    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("我就是要Runnable 运行");
    }
}
