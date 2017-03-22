package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.StackList;

public class StackFIFO extends Stack {

	private final Stack temp = new Stack(new StackList());
	/*
	StackList jest lepszym rozwiązaniem ze względu na specyfikę usuwania elementów.
	Usunięcie elementu z przodu tablicy jest o wiele bardziej kosztowne niż z listy.
	 */

	public StackFIFO() {
		super();
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			push(temp.pop());
		
		return ret;
	}
}
