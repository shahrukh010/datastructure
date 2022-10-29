package com.code.main;

class Worker {

	private static int counter = 0;

	public static synchronized void increment() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void process() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int index = 0; index < 10000; index++)
					increment();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int index = 0; index < 10000; index++)
					increment();
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

public class Synchronization {
	/*
	 * private static int counter = 0;
	 * 
	 * public void process() {
	 * 
	 * Thread thread1 = new Thread(new Runnable() {
	 * 
	 * @Override public void run() {
	 * 
	 * for (int index = 0; index < 100; index++) counter++; } });
	 * 
	 * Thread thread2 = new Thread(new Runnable() {
	 * 
	 * @Override public void run() {
	 * 
	 * for (int index = 0; index < 100; index++) counter++; } });
	 * 
	 * thread1.start(); thread2.start(); try { thread1.join(); thread2.join(); }
	 * catch (InterruptedException ex) { ex.printStackTrace(); } //
	 * System.out.print("counter value:" + counter);
	 * 
	 * }
	 */

	public static void main(String... strings) {

		Synchronization synchronization = new Synchronization();
		// synchronization.process();
		// dont' print before join because of main thread get may be first priority and
		// you will get unexpected output
//		System.err.println(counter);

		Worker worker = new Worker();
		worker.process();
		System.err.println(worker.getCounter());
	}

}
