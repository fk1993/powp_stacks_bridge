package edu.kis.vh.stacks;

public class Stack {

	private static final int EMPTY = -1;

	private static final int SIZE = 12;

	private int[] ITEMS = new int[SIZE];	

	private int total = EMPTY;
	
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}
	
	public boolean isEmpty() {
		return total == EMPTY;
	}
	
	public boolean isFull() {
		return total == SIZE - 1;
	}
	
	public int top() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total];
	}
	
	public int pop() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total--];
	}
				
}
