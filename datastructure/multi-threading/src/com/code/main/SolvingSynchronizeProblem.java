package com.code.main;

class AppService {

	private static int counter = 0;
	// create custom lock object
	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static void increment1() {
		synchronized (lock1) {
			counter++;
		}
	}

	public static void increment2() {
		synchronized (lock2) {
			counter++;
		}
	}

	public static int getCounter() {
		return counter;
	}

	public static void process() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int index = 0; index < 10000; index++)
					increment1();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int index = 0; index < 10000; index++)
					increment2();

			}
		});

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

public class SolvingSynchronizeProblem {

	public static void main(String... strings) {

		AppService appService = new AppService();
		AppService.process();
		System.out.println(AppService.getCounter());
	}

}
