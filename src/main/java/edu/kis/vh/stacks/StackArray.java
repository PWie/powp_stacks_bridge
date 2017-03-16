package edu.kis.vh.stacks;

/**
 *
 * @author Patryk Wierzynski
 */
public class StackArray {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;
	
	private final int[] items = new int[STACK_SIZE];

	private int total = EMPTY_STACK_INDICATOR;

	/**
	 *
	 * @return total items on stack
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 *
	 * @param i - element to be putted on stack
	 */
	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
	}

	/**
	 *
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	/**
	 *
	 * @return true if full, false otherwise
	 */
	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/**
	 *
	 * @return element from top
	 */
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total];
	}

	/**
	 *
	 * @return element removed from stack
	 */
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total--];
	}

}
