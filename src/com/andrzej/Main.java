package com.andrzej;

public class Main {

    public static void main(String[] args) {

		int[] table1 = new int[] {1,44,32,21,6,8,12,33,44};
//		System.out.println(table1[3]);

		QuickSort qsort2 = new QuickSort();
		qsort2.sortTheTableFinalMethod(table1);
		for (int i = 0; i < table1.length ; i++) {
			System.out.println(table1[i]);
		}

	}


}
//wybieramy jeden element z tablicy dowolny
//dzielimy tablice na dwie grupy (najlepiej bez tworzenia nowych tablic)