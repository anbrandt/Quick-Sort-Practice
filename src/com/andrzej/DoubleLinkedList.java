package com.andrzej;

/**
 * Created by andrzej on 23.05.17.
 */
public class DoubleLinkedList {


	private DoubleLinkedList previous;
	private DoubleLinkedList next;
	private Object data;


	public DoubleLinkedList(DoubleLinkedList previous, Object data) {
		this.previous = previous;
		this.data = data;
	}


	public DoubleLinkedList getPrevious() {
		return previous;
	}

	public DoubleLinkedList getNext() {
		return next;
	}

	public Object getData() {
		return data;
	}

	public void setPrevious(DoubleLinkedList previous) {
		this.previous = previous;
	}

	public void setNext(DoubleLinkedList next) {
		this.next = next;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static void main(String[] args) {
		DoubleLinkedList l1 = new DoubleLinkedList(null, "ala");
		DoubleLinkedList l2 = new DoubleLinkedList(l1, "kota");
		DoubleLinkedList l3 = new DoubleLinkedList(l2, "ma");
		DoubleLinkedList l4 = new DoubleLinkedList(l3, "ciocia");

		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(null);


		DoubleLinkedList current = l1;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}

	}

}
