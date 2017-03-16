package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 *
 * @author Patryk Wierzynski
 */
public class Stack {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;

	private StackList stackList;

	public Stack() {
		this(new StackList());
	}

	public Stack(StackList stackList) {
		this.stackList = stackList;
	}

	/**
	 *
	 * @return total items on stack
	 */
	public int getTotal() {
		return stackList.getTotal();
	}
	
	/**
	 *
	 * @param i - element to be putted on stack
	 */
	public void push(int i) {
		stackList.pushElement(i);
	}

	/**
	 *
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty() {
		return stackList.empty();
	}

	/**
	 *
	 * @return true if full, false otherwise
	 */
	public boolean isFull() {
		return stackList.full();
	}

	/**
	 *
	 * @return element from top
	 */
	public int top() {
		return stackList.peek();
	}

	/**
	 *
	 * @return element removed from stack
	 */
	public int pop() {
		return stackList.pop();
	}

}
