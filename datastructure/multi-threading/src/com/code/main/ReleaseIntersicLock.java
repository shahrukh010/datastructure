package com.code.main;

class App {

	public void producer() {

		synchronized (this) {
			try {

				System.out.println("producer..." + Thread.currentThread().getName());
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void consumer() {

		synchronized (this) {
			System.err.println("consumer..." + Thread.currentThread().getName());
			notify();
		}
	}

	public void process() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int index = 0; index < 5; index++) {
					try {

						producer();
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int index = 0; index < 5; index++) {
					try {
						consumer();
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}

public class ReleaseIntersicLock {

	public static void main(String... strings) {

		App app = new App();
		app.process();

	}
}
