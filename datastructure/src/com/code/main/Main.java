package com.code.main;

import com.code.main.list.LinkedList;

public class Main {

	public static void main(String... strings) {

		LinkedList list = new LinkedList();

		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);

		list.reverseNode();
		list.printNode();
	}
}
