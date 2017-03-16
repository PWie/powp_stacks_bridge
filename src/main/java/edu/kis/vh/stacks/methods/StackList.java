package edu.kis.vh.stacks.methods;

public class StackList implements IStackMethod{

	private Node last;
	private int total = 0;

	@Override
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}

	@Override
	public int getTotal() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return total;
	}

}

class Node {

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

/*
	IDE: IntelliJ IDEA
	przy zmienianiu implementacji Stack na uzywanie StackList pomocne byly narzedzia
	takie jak refaktoryzacja, podpowiedzi IDE.
 */