package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.list.StackList;

public class StackListTest {

	@Test
	public void testPushElement() {
		StackList stackObj = new StackList();
		int testValue = 4;
		stackObj.pushElement(testValue);

		int result = stackObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testEmpty() {
		StackList stackObj = new StackList();
		boolean result = stackObj.empty();
		Assert.assertEquals(true, result);

		stackObj.pushElement(888);

		result = stackObj.empty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testFull() {
		StackList stackObj = new StackList();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.full();
			Assert.assertEquals(false, result);
			stackObj.pushElement(888);
		}

		boolean result = stackObj.full();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeek() {
		StackList stackObj = new StackList();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.peek();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.pushElement(testValue);

		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		StackList stackObj = new StackList();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.pushElement(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
}
