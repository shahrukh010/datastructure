package com.code.main.list;

public class DoublyList {

	class Node {

		Node prev;
		int data;
		Node next;

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
			this.last = newNode;
		} else {

			this.last.next = newNode;
			newNode.prev = this.last;
			this.last = newNode;
		}
	}

	public void printNode() {

		Node currentNode = this.first;
		while (currentNode != null) {

			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public void printNodeReverseOrder() {

		Node currentNode = this.last;
		while (currentNode != null) {

			System.out.println(currentNode.data);
			currentNode = currentNode.prev;
		}
	}

}
