package com.code.main.list;

public class LinkedList {

	class Node {

		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node first = null;
	private Node last = null;

	public int getData() {
		return this.first.data;
	}

	public int getLast() {

		return this.last.data;
	}

	public void addNode(int data) {

		Node newNode = new Node(data);
		if (this.first == null) {
			this.first = newNode;
			this.last = this.first;
		} else {
			this.last.next = newNode;
			this.last = newNode;
		}
	}

	public void printNode() {
		Node currentNode = first;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public void reverseNode() {

		Node r = null;
		Node q = null;
		Node p = first;

		while (p != null) {
			r = q;
			q = p;
			p = p.next;
			q.next = r;
		}
		this.first = q;
	}

	public int middleElement() {

		Node slow = this.first;
		Node fast = this.first;
		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

}
