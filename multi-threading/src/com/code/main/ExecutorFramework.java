package com.code.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExecutorWorker implements Runnable {

	private int id;

	public ExecutorWorker(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		System.out.println("Task with id: " + id + " and Task with thread id: " + Thread.currentThread().getId());
		long duration = (long) Math.random() * 5;
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}

class Task implements Runnable {

	private int id;

	public Task(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		System.err.println("Task with id :" + id + " is in work - thread id: " + Thread.currentThread().getName());
		long duration = (long) Math.random() * 5;
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

public class ExecutorFramework {
	public static void main(String... strings) {
//		ExecutorService executor = Executors.newSingleThreadExecutor();
//		for (int index = 0; index < 5; index++) {
//
//			executor.execute(new Task(index));
//		}
//		executor.shutdown();

		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int index = 0; index < 10; index++)
			executor.execute(new ExecutorWorker(index));
		executor.shutdown();
	}
}
