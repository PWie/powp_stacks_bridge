package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {

	public static void main(String[] args) {

		System.out.println("DefaultStacksFactory:");
		testStacks(new DefaultStacksFactory());
		System.out.println("\nArrayStacksFactory:");
		testStacks(new ArrayStacksFactory());
		System.out.println("\nListStacksFactory:");
		testStacks(new ListStacksFactory());
		
	}

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = {factory.getStandardStack(), factory.getFalseStack(),	//spacja po {
			factory.getFIFOStack(), factory.getHanoiStack()}; //za duze wciecie

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println(); //za duze wciecie
		} //19-27 za duze wciecie
		
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected()); //za duze wciecie
	}
	
}
// IDE: Netbeans, alt+left/alt+right przesuwa kursor pomiedzy jego ostatnimi pozycjami