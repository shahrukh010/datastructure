package com.code.main;

public class ParellelExecuteTask {

	public static void main(String... strings) {

		Thread thread1 = new Thread(new Runnable() {

			public void run() {

				for (int index = 0; index < 5; index++)
					try {
						Thread.sleep(500);
						System.out.println(Thread.currentThread().getName());
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {

				for (int index = 0; index < 5; index++)

					try {
						Thread.sleep(2000);
						System.out.println(Thread.currentThread().getName());
					} catch (InterruptedException ex) {

						ex.printStackTrace();
					}
			}

		});

		// non sequential execution because we are using threading.
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("main thread");
	}
}
