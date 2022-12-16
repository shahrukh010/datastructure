package com.code.main.tree;

class Node {

	protected Node left;
	private int data;
	protected Node right;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void printNode(Node currentNode) {

		if (currentNode != null) {
			System.out.println(currentNode.getData());
			printNode(currentNode.left);
			printNode(currentNode.right);
		}
	}
}

public class Tree {

	public static void main(String... strings) {

		Node node = new Node(10);
		node.left = new Node(4);
		node.left.left = new Node(3);
		node.right = new Node(11);
		node.right.right = new Node(15);
		
		node.printNode(node);
	}
}
