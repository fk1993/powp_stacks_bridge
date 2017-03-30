package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.*;
import edu.kis.vh.stacks.factory.*;

class StacksDemo {

	private static final int RANGE = 20;

	public static void main(String[] args) {
		DefaultStacksFactory defaultFactory = new DefaultStacksFactory();
		ArrayStacksFactory arrayFactory = new ArrayStacksFactory();
		ListStacksFactory listFactory = new ListStacksFactory();
		
		testStacks(defaultFactory);
		testStacks(arrayFactory);
		testStacks(listFactory);
	}

	private static void testStacks(StacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < stacks.length - 1; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[stacks.length - 1].push(rn.nextInt(RANGE));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[stacks.length - 1]).reportRejected());
	}

}