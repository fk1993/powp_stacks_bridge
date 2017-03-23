package edu.kis.vh.stacks;

public class StackArray implements IStack {

	private static final int EMPTY = -1;

	private static final int SIZE = 12;

	private final int[] ITEMS = new int[SIZE];	

	private int total = EMPTY;
	
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
			ITEMS[++total] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == SIZE - 1;
	}
	
	/**
	 * @return element znajdujący się na szczycie stosu
	 */
	public int top() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total];
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total--];
	}
}
