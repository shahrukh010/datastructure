package com.code.main;

class Runner1 {

	public void prcess() {
		for (int index = 0; index < 5; index++)
			System.out.println("process1...." + index);
	}
}

class Runner2 {

	public void prcess() {
		for (int index = 0; index < 5; index++)
			System.out.println("process2...." + index);
	}
}

public class SequentialProcessing {

	public static void main(String... strings) {

		// sequential processing
		Runner1 runner1 = new Runner1();
		Runner2 runner2 = new Runner2();

		runner1.prcess();
		runner2.prcess();
	}
}
