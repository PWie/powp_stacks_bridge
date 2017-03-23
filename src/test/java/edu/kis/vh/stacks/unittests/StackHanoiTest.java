package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.methods.IStackMethod;
import edu.kis.vh.stacks.methods.StackArray;
import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {

	@Test
	public void testPush() {
		Stack stackObj = new StackHanoi();
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new StackHanoi();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new StackHanoi(new StackArray());  // makes sense only for array implementation
		for (int i = 0; i < StackArray.STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new StackHanoi();

		int result = stackObj.top();
		Assert.assertEquals(IStackMethod.EMPTY_STACK_INDICATOR, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new StackHanoi();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testHanoi() {
		Stack stackObj = new StackHanoi();
		
		int testValue1 = 13;
		int testValue2 = 9;
		int testValue3 = 5;
		
		stackObj.push(testValue2);
		stackObj.push(testValue3);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue3, result);
		
		stackObj.push(testValue1);
		
		result = stackObj.top();
		Assert.assertEquals(testValue3, result);
	}
	
}
