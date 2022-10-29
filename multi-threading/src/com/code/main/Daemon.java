package com.code.main;

class DaemonWorker implements Runnable {

	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException ex) {
				ex.printStackTrace();

			}
		}

	}
}

class NormalWorker implements Runnable {

	@Override
	public void run() {

		for (int index = 0; index < 5; index++)
			System.out.println(Thread.currentThread().getName());

	}
}

public class Daemon {

	public static void main(String... strings) {

		DaemonWorker daemonWorker = new DaemonWorker();
		NormalWorker normalWorker = new NormalWorker();
		Thread daemonThread = new Thread(daemonWorker);
		Thread normalThread = new Thread(normalWorker);
		daemonThread.setDaemon(true);

		daemonThread.start();
		normalThread.start();
	}
}
