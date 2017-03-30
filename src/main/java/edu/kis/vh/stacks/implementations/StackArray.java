package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {

	private static final int SIZE = 12;

	private final int[] ITEMS = new int[SIZE];	

	private int total = IStack.EMPTY;
	
	/**
	 * @return liczba elementów na stosie
	 */
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[total++] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == IStack.EMPTY;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == SIZE;
	}
	
	
	public int top() {
		if (isEmpty())
			return IStack.EMPTY;
		return ITEMS[total - 1];
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return IStack.EMPTY;
		return ITEMS[--total];
	}
}
