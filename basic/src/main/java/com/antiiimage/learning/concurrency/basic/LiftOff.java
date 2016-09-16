package com.antiiimage.learning.concurrency.basic;

public class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {

	}

	public LiftOff(int count) {
		this.countDown = count;
	}

	public String getStatus() {
		return "##" + id + "##" + "   (" + (this.countDown > 0 ? this.countDown : "Liftoff!") + ")";
	}

	public void run() {
		while (this.countDown-- > 0) {
			System.out.println(this.getStatus());
			Thread.yield();
		}
	}

}
