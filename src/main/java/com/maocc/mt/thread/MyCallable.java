package com.maocc.mt.thread;

import java.util.concurrent.*;

/**
 * @author maocc
 * @description
 * @date: 2019/2/21 11:27
 */
public class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		return 666;
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		MyCallable mc = new MyCallable();
		FutureTask<Integer> ft = new FutureTask<>(mc);
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(ft);
		System.out.println(ft.get());
	}
}
