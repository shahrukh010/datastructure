package com.code.main;

import java.util.Arrays;

import com.code.main.list.DoublyList;
import com.code.main.sorting.SortingAlgorithm;

public class Main {

	public static void main(String... strings) {

		/*
		 * LinkedList list = new LinkedList();
		 * 
		 * list.addNode(10); list.addNode(20); list.addNode(30); list.addNode(40);
		 * list.addNode(50); list.addNode(70);
		 * 
		 * // list.reverseNode(); // list.printNode(); int result =
		 * list.middleElement(); System.out.println(result);
		 * 
		 */

		SortingAlgorithm sort = new SortingAlgorithm();
//		int[] input = { 2, 10, 8, 7, 0 };
//		sort.bubbleSort(input);
//		System.out.println(java.util.Arrays.toString(input));
//		Integer[] numbers = { 5, 3, 1, 0, -1, 2, 5, 4, 4, 10, 8, 9 };
//		sort.bubbleSort.accept(numbers);
//		System.out.println(java.util.Arrays.toString(numbers));
//		

		int[] numbs = { 5, 3, 1, 0, -1, 2, 5, 4, 4, 10, 8, 9 };
//		sort.selection.accept(numbs);
//		System.out.println(java.util.Arrays.toString(numbs));

		sort.insertionSort(numbs);
		int[] input = { 5, 4, 3, 2, 0, 1 };
		sort.insertionSort(input);
		System.out.println(java.util.Arrays.toString(input));

		int[] num = { 11, 13, 7, 12, 16, 9, 24, 5, 10, 3, 3, 0 };
//		sort.quickSort(num, 0, 10);
//		System.out.println(Arrays.toString(num));
		sort.mergeSort(num, 0, num.length - 1);
		System.out.println(Arrays.toString(num));

		System.out.println("--------------------List====================");

//		CircularList circularList = new CircularList();
//		circularList.addNode(10);
//		circularList.addNode(20);
//		circularList.addNode(30);
//		circularList.addNode(40);
//		circularList.addNode(50);
//		circularList.printNode();

		DoublyList dll = new DoublyList();
		dll.addNode(10);
		dll.addNode(20);
		dll.addNode(30);
		dll.addNode(40);
		dll.addNode(50);

		dll.printNode();
		System.out.println("dll reverse order printing");
		dll.printNodeReverseOrder();

	}
}
