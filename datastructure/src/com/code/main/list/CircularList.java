package com.code.main.list;

public class CircularList {

	class Node {

		Node next;
		int data;

		public Node(int data) {

			this.data = data;
		}
	}

	private Node first;
	private Node last;

	public void addNode(int data) {

		Node newNode = new Node(data);
		if (this.first == null) {
			this.first = newNode;
			this.last = this.first;
			this.last.next = this.first;
		} else {

			this.last.next = newNode;
			this.last = newNode;
			this.last.next = this.first;
		}
	}

	public void printNode() {

		Node currentNode = this.first;
		do {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		} while (currentNode != this.first);
	}
}
