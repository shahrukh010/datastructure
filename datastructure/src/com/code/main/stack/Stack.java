package com.code.main.stack;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class Stack {

	private static int capacity = 10;
	private int index = -1;
	private static int size = 0;
	private int[] stack;

	public Stack(int capacity) {

		capacity = capacity;
		stack = new int[capacity];
	}

	public Stack() {

		stack = new int[capacity];
	}

	public void push(int data) {

		stack[++index] = data;
		size++;
	}

	public boolean isEmpty() {

		return size == 0 ? true : false;
	}

	public int peek() throws EmptyStacException {

		if (isEmpty())
			throw new EmptyStacException("stack is empty");

		return stack[index];
	}

	public int pop() throws EmptyStacException {

		if (isEmpty())
			throw new EmptyStacException("stack is empty");

		int tmp = stack[index];
		stack[index] = 0;
		index--;
		size--;
		return tmp;
	}

	public static void main(String... strings) throws EmptyStacException {

		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

//		System.out.println(Arrays.toString(stack.stack));
		System.out.println(Arrays.toString(Arrays.copyOfRange(stack.stack, 0, size)));

		System.out.println(stack.peek());
		System.out.println(stack.size);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size);
//		System.out.println(Arrays.toString(Arrays.copyOfRange(stack.stack, 0, size)));
	}
}
