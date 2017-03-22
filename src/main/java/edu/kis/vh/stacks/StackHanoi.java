package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.IStackMethod;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
	}

	public StackHanoi(IStackMethod stackItems) {
		super(stackItems);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
