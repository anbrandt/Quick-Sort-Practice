package com.andrzej;

/**
 * Created by andrzej on 23.05.17.
 */
public class ListItem {
	private ListItem previous;
	private Object data;

	public ListItem getPrevious() {
		return previous;
	}

	public Object getData() {
		return data;
	}


	public ListItem(ListItem previous, Object data) {
		this.previous = previous;
		this.data = data;
	}


	public static void main(String[] args) {
		ListItem l1 = new ListItem(null, "kota");
		ListItem l2 = new ListItem(l1, "ma");
		ListItem l3 = new ListItem(l2, "ala");

		ListItem current = l3;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getPrevious();
			}


	}
}
