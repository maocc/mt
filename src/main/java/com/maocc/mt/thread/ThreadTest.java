package com.maocc.mt.thread;

/**
 * @author maocc
 * @description
 * @date: 2019/2/21 11:03
 */
public class ThreadTest {

    public static void main(String[] args) {
    	new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(10000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("11");
			}
		}).start();
		System.out.println("我就是快");
		System.out.println("我就是快");
	}
}
