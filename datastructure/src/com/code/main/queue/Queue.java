package com.code.main.queue;

import java.util.Arrays;

public class Queue {

	private static final int DEFAULT_CAPACITY = 10;
	private static int capacity = 0;
	private static int size = 0;
	private int[] queue;

	private int front = 0;
	private int rear = 1;

	public Queue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
	}

	public Queue() {

		queue = new int[DEFAULT_CAPACITY];
	}

	public boolean add(int data) throws QueueFullException {

		if (front == (rear) % queue.length) {

			throw new QueueFullException("queue is full");
		}
		int index = (rear % queue.length);
		queue[index] = data;
		rear++;
		return true;
	}

	public void remove() {

		if (front == rear) {

			System.out.println("queue is empty");
		}
		queue[front + 1] = 0;
		front++;
	}

	public static void main(String... strings) throws QueueFullException {

		Queue queue = new Queue();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.remove();
		queue.add(10);
		queue.add(11);
		System.out.println(Arrays.toString(queue.queue));
	}
}
