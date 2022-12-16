package com.code.main;

import java.util.ArrayList;
import java.util.List;

class Processor {

	private List<Integer> list = new ArrayList<>();
	private static final int UPPER_LIMIT = 5;
	private static final int LOWER_LIMIT = 0;
	private Object lock = new Object();
	private int value = 0;

	public void producer() {

		synchronized (lock) {

			while (true) {

				if (list.size() == UPPER_LIMIT) {

					System.out.println("wait for remove item.");
					try {
						lock.wait();
					} catch (InterruptedException ex) {

						ex.printStackTrace();
					}
				} else {

					try {
						Thread.sleep(1000);
						System.out.println("adding value:" + value);
						list.add(value);
						value++;
						lock.notify();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}

			}
		}
	}

	public void consumer() throws InterruptedException {

		synchronized (lock) {

			while (true) {
				if (list.size() == LOWER_LIMIT) {

					System.out.println("wait for add iteam.");
					value = 0;
					lock.wait();
				} else {
					Thread.sleep(500);
					System.out.println("Removing: " + list.remove(list.size() - 1));
					lock.notify();
				}
			}
		}
	}

}

public class ProducerAndConsumer {

	public static void main(String... strings) {

		Processor processor = new Processor();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				processor.producer();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					processor.consumer();
				} catch (InterruptedException ex) {

					ex.printStackTrace();
				}

			}
		});

		thread1.start();
		thread2.start();
	}
}
