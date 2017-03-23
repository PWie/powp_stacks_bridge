package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.methods.IStackMethod;
import edu.kis.vh.stacks.methods.StackArray;
import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {

	@Test
	public void testPush() {
		Stack stackObj = new StackFIFO();
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new StackFIFO();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new StackFIFO(new StackArray());   // makes sense only for array implementation
		for (int i = 0; i < StackArray.STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(i);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new StackFIFO();

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
		Stack stackObj = new StackFIFO();
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
	public void testFIFO() {
		Stack stackObj = new StackFIFO();
		
		int testValue1 = 5;
		int testValue2 = 9;
		
		stackObj.push(testValue1);
		stackObj.push(testValue2);
		
		int result = stackObj.pop();
		
		Assert.assertEquals(testValue1, result);
	}
	
}
