package com.andrzej;

/**
 * Created by andrzej on 23.05.17.
 */
public class QuickSort {

	//USE IN DEBUGGER MODE TO SEE EACH STEP ON THE WAY
	private int[] table;
	private int length;

	public static void main(String[] args) {
		QuickSort qsort = new QuickSort();
		int[] table1 = new int[]{33, 322, 23, 244, 66, 8, 9, 0, 12102, 2212, 133, 4, 1, 2, -9};

		qsort.sortTheTableFinalMethod(table1);
		for (int i = 0; i < table1.length; i++) {
			System.out.println("Index is " + i + " and the value is " + table1[i]);
		}
	}


	//declaring in parameter two integers, that are incrementally going through the table indexes
	public void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;

		//setting the pivot in MIDDLE OF THE TABLE, important!
		int pivot;
		pivot = table[lowerIndex + ((higherIndex - lowerIndex) / 2)];


		//while loops within the while loops
		//idea is that each index in the table is compared to the pivotal value (set above), and then (in the if operator)
		//it executes the exchange numbers method, that takes two integers and swap them
		while (i <= j) {
			while (table[i] < pivot) {
				i++;
				//while loop is going through the index of the integers in the table
			}
			//I loop is going to RIGHT, and Y is going LEFT
			while (table[j] > pivot) {
				j--;
			}
			//if checks if the two i and j have crossed, if not they swap
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}

		//this is where the magic RECURSION happens - method calls themselve, by te smaller index
		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}

	}

	private void exchangeNumbers(int i, int j) {
		int temp = table[i];
		table[i] = table[j];
		table[j] = temp;
	}

	public void sortTheTableFinalMethod(int[] inputTable) {


		if (inputTable == null || inputTable.length == 0) {
			return;
		}
		this.table = inputTable;
		length = inputTable.length;

		//here we have an y - higher index is set to the highest index (and while the index is always counted from 0, we have
		//to make it -1
		quickSort(0, length - 1);

	}


}
