package edu.kis.vh.stacks.methods;

/**
 * Created by Student on 16.03.2017.
 */
public interface IStackMethod {
	int EMPTY_STACK_INDICATOR = -1;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
}
