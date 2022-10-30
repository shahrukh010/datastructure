package com.code.main.sorting;

public class SortingAlgorithm {

	public void bubbleSort(int[] input) {

		for (int index = 0; index < input.length; index++) {

			for (int j = 0; j < input.length - index - 1; j++) {

				if (input[j] > input[j + 1]) {
					int tmp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = tmp;
				}
			}
		}
	}

	public java.util.function.Consumer<Integer[]> bubbleSort = (input) -> {

		for (int index = 0; index < input.length; index++) {

			for (int j = 0; j < input.length - index - 1; j++) {

				if (input[j] > input[j + 1]) {

					int tmp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = tmp;
				}
			}
		}
	};

	public java.util.function.Consumer<int[]> selection = (input) -> {

		for (int index = 0; index < input.length; index++) {

			int k = index;
			for (int j = index + 1; j < input.length; j++) {

				if (input[k] > input[j]) {

					k = j;
				}
			}
			int tmp = input[index];
			input[index] = input[k];
			input[k] = tmp;
		}
	};

	public void insertionSort(int[] input) {

		for (int index = 1; index < input.length; index++) {

			int tmpData = input[index];
			int j = index - 1;

			while (j > -1 && input[j] > tmpData) {

				input[j + 1] = input[j];
				j--;
			}
			input[j + 1] = tmpData;
		}

	}

	private void swap(int[] input, int first, int second) {

		int tmp = input[first];
		input[first] = input[second];
		input[second] = tmp;
	}

	public int partition(int[] input, int low, int high) {

		int pivot = input[0];
		int i = low;
		int j = high;

		while (i < j) {

			while (i < input.length - 1 && input[i] <= pivot)
				i++;
			while (j >= 0 && input[j] > pivot)
				j--;
			if (i < j)
				swap(input, i, j);
		}
		swap(input, pivot, j);
		return j;
	}

	public void quickSort(int[] input, int low, int high) {

		int pivot;

		if (low < high) {

			pivot = partition(input, low, high);
			quickSort(input, low, pivot);
			quickSort(input, pivot + 1, high);
		}
	}

	public void merge(int[] input, int low, int mid, int high) {

		int i = low;
		int j = mid + 1;
		int k = low;
		int[] newArray = new int[input.length];
		while (i <= mid && j <= high) {

			if (input[i] <= input[j])
				newArray[k++] = input[i++];
			else
				newArray[k++] = input[j++];

		}

		for (; i <= mid; i++)
			newArray[k++] = input[i];
		for (; j <= high; j++)
			newArray[k++] = input[j++];

		for (int index = low; index <= high; index++) {
			input[index] = newArray[index];
		}
	}

	public void mergeSort(int[] input, int low, int high) {

		if (low < high) {

			int mid = (low + (high - low) / 2);
			mergeSort(input, low, mid);
			mergeSort(input, mid + 1, high);
			merge(input, low, mid, high);
		}

	}

}
