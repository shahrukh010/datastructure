package com.code.main.stack;

import java.util.EmptyStackException;

public class LinkedListStack {

	class Stack {

		class Node {

			Node next;
			int data;

			public Node(int data) {
				this.data = data;
			}
		}

		private Node first = null;
		private int size = 0;

		public void push(int data) {

			Node newNode = new Node(data);

			if (this.first == null) {
				this.first = newNode;
				size++;
			} else {

				newNode.next = this.first;
				this.first = newNode;
				size++;
			}
		}

		public boolean isEmpty() {

			return size == 0 ? true : false;
		}

		public int peek() throws EmptyStacException {

			if (isEmpty()) {

				throw new EmptyStacException("stack is empty");
			}
			return this.first.data;

		}

		public int pop() throws EmptyStacException {
			if (isEmpty())
				throw new EmptyStacException("stack is empty");

			int tmp = this.first.data;
			this.first = this.first.next;
			size--;
			return tmp;
		}
	}

	public static void main(String... strings) throws EmptyStacException {

		LinkedListStack lstack = new LinkedListStack();
		Stack stack = lstack.new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
//		System.out.println(stack.peek());
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
