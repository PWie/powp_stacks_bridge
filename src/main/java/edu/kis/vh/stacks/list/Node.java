package edu.kis.vh.stacks.list;

public class Node {

	private int value;
	private Node prev;
	private Node next;
	
	/* po dokonanej enkapsulacju powyższych pól, w miejscach gdzie
	byly one uzywane automatycznie zostaly wstawione wywolania 
	odpowiednich metod (get/set) w zależności od kontekstu */
	
	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public Node getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int i) {
		value = i;
	}

}
