package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.IStacksFactory;

public class DefaultStacksFactory implements IStacksFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack();
	}
	
	// TODO: implement FalseStack
	@Override
	public Stack getFalseStack() {
		return new Stack();
	}

	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
