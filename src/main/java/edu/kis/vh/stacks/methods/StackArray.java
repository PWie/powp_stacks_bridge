package edu.kis.vh.stacks.methods;

/**
 *
 * @author Patryk Wierzynski
 */
public class StackArray implements IStackMethod {

	private static final int STACK_SIZE = 12;

	private final int[] items = new int[STACK_SIZE];

	private int total = EMPTY_STACK_INDICATOR;

	/**
	 *
	 * @return total items on stack
	 */
	@Override
	public int getTotal() {
		return total;
	}
	
	/**
	 *
	 * @param i - element to be putted on stack
	 */
	@Override
	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
	}

	/**
	 *
	 * @return true if isEmpty, false otherwise
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	/**
	 *
	 * @return true if isFull, false otherwise
	 */
	@Override
	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/**
	 *
	 * @return element from top
	 */
	@Override
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
	@Override
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total--];
	}

}