package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by Patryk Wierzyński
 */

public class ArrayStacksFactoryTest {

	private IStacksFactory factory;

	@Before
	public void setUp() {
		factory = new ArrayStacksFactory();
	}

	@Test
	public void getStandardStack() throws Exception {
		Stack result = factory.getStandardStack();
		assertThat(result, is(instanceOf(Stack.class)));
	}

	@Test
	public void getFalseStack() throws Exception {
		Stack result = factory.getFalseStack();
		assertThat(result, is(instanceOf(Stack.class)));
	}

	@Test
	public void getFIFOStack() throws Exception {
		Stack result = factory.getFIFOStack();
		assertThat(result, is(instanceOf(StackFIFO.class)));
	}

	@Test
	public void getHanoiStack() throws Exception {
		Stack result = factory.getHanoiStack();
		assertThat(result, is(instanceOf(StackHanoi.class)));
	}

}