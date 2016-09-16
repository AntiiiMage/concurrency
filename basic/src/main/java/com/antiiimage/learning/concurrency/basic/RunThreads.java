package com.antiiimage.learning.concurrency.basic;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunThreads {

	// print status in n thread
	public static void runInThread(List<Runnable> list) {
		for (Runnable temp : list) {
			Thread thread = new Thread(temp);
			thread.start();
		}
	}

	// use cached thread pool
	public static void runInCachedThreadPool(List<Runnable> list) {
		ExecutorService execService = Executors.newCachedThreadPool();
		for (Runnable temp : list) {
			execService.execute(temp);
		}
	}

	// use limitedcached thread pool
	public static void runInLimitedThreadPool(List<Runnable> list, int threadCount) {
		ExecutorService execService = Executors.newFixedThreadPool(threadCount);
		for (Runnable temp : list) {
			execService.execute(temp);
		}
	}

	// single thread pool
	public static void runInSingleThread(List<Runnable> list) {
		ExecutorService execService = Executors.newSingleThreadExecutor();
		for (Runnable temp : list) {
			execService.execute(temp);
		}
	}

}
