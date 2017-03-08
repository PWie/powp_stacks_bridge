package edu.kis.vh.stacks;

public class Stack {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;
	
	private final int[] items = new int[STACK_SIZE];

	private int total = EMPTY_STACK_INDICATOR;

	public int getTotal() {
		return total;
	}
	
	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total];
	}

	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total--];
	}

}
