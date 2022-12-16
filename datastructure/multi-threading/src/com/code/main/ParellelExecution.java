package com.code.main;

class RunnerOne extends Thread {

	public void run() {

		for (int index = 0; index < 5; index++)
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
	}

}

class RunnerTwo implements Runnable {

	public void run() {

		for (int index = 0; index < 5; index++)
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
	}
}

public class ParellelExecution {

	public static void main(String... strings) {

		RunnerOne one = new RunnerOne();
		Thread thread1 = new Thread(one);
		RunnerTwo two = new RunnerTwo();
		Thread thread2 = new Thread(two);

		thread1.start();
		thread2.start();

	}

}
