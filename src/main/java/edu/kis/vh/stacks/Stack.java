package edu.kis.vh.stacks;

/**
 *
 * @author Patryk Wierzynski
 */
public class Stack {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;

	private StackArray stackArray;

	public Stack() {
		this(new StackArray());
	}

	public Stack(StackArray stackArray) {
		this.stackArray = stackArray;
	}

	/**
	 *
	 * @return total items on stack
	 */
	public int getTotal() {
		return stackArray.getTotal();
	}
	
	/**
	 *
	 * @param i - element to be putted on stack
	 */
	public void push(int i) {
		stackArray.push(i);
	}

	/**
	 *
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty() {
		return stackArray.getTotal() == EMPTY_STACK_INDICATOR;
	}

	/**
	 *
	 * @return true if full, false otherwise
	 */
	public boolean isFull() {
		return stackArray.getTotal() == STACK_SIZE - 1;
	}

	/**
	 *
	 * @return element from top
	 */
	public int top() {
		return stackArray.top();
	}

	/**
	 *
	 * @return element removed from stack
	 */
	public int pop() {
		return stackArray.pop();
	}

}
