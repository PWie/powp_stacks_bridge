package edu.kis.vh.stacks.list;

import static edu.kis.vh.stacks.Stack.EMPTY_STACK_INDICATOR;

public class StackList {

	private Node last;
	private int i;

	public void pushElement(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return last.getValue();
	}

	public int pop() {
		if (empty()) {
			return -1;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
