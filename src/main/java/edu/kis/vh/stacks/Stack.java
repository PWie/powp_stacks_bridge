package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.IStackMethod;
import edu.kis.vh.stacks.methods.StackList;

/**
 *
 * @author Patryk Wierzynski
 */
public class Stack {

	// 3.2.1 removed unused fields

	private IStackMethod stackItems;

	public Stack() {
		this(new StackList());
	}

	public Stack(IStackMethod stackItems) {
		this.stackItems = stackItems;
	}

	/**
	 *
	 * @return total items on stack
	 */
	public int getTotal() {
		return stackItems.getTotal();
	}
	
	/**
	 *
	 * @param i - element to be putted on stack
	 */
	public void push(int i) {
		stackItems.push(i);
	}

	/**
	 *
	 * @return true if isEmpty, false otherwise
	 */
	public boolean isEmpty() {
		return stackItems.isEmpty();
	}

	/**
	 *
	 * @return true if isFull, false otherwise
	 */
	public boolean isFull() {
		return stackItems.isFull();
	}

	/**
	 *
	 * @return element from top
	 */
	public int top() {
		return stackItems.top();
	}

	/**
	 *
	 * @return element removed from stack
	 */
	public int pop() {
		return stackItems.pop();
	}

}

/*
	Dzięku uzyciu interfejsu jako skladowej klasy mozemy w bardzo latwy sposob zmienic
	metode przchowywania stosu zmieniajac jedynie typ obiektu umieszonego w tym polu
 */

/*
	13. open declaration oraz kliklniecie myszka z ctr przenosi do deklaracji
	metody w interfejsie.
 */