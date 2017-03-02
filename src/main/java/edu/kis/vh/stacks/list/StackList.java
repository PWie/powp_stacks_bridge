package edu.kis.vh.stacks.list;

import static edu.kis.vh.stacks.Stack.EMPTY_STACK_INDICATOR;

public class StackList {

	Node last;
	int i;

	public void pushElement(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
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
		return last.value;
	}

	public int pop() {
		if (empty()) {
			return -1;
		}
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
