package com.antiiimage.learning.concurrency.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		int n = 5;
		List<Runnable> taskList = new ArrayList<Runnable>();
		while (n-- > 0) {
			taskList.add(new LiftOff());
		}

		// RunThreads.runInLimitedThreadPool(taskList, 2);
		RunThreads.runInSingleThread(taskList);

	}
}
