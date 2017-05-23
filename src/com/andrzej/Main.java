package com.andrzej;

public class Main {

    public static void main(String[] args) {

		int[] table1 = new int[] {1,44,32,21,6,8,12,33,44};
		System.out.println("UNSORTED");
		printTableElements(table1);

		System.out.println("----------------");

		QuickSort qsort2 = new QuickSort();
		System.out.println("SORTED");
		qsort2.sortTheTableFinalMethod(table1);
		printTableElements(table1);

	}

	public static void printTableElements (int[] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
	}

}
//wybieramy jeden element z tablicy dowolny
//dzielimy tablice na dwie grupy (najlepiej bez tworzenia nowych tablic)