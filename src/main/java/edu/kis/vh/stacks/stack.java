package edu.kis.vh.stacks;

/**
 * Standardowa implementacja stosu.
 *
 */

public class Stack {

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

	/**
	 * @param i - element dodawany do stosu
	 */
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}
	
	/**
	 * @return true, jeśli stos jest pusty
	 */
	public boolean isEmpty() {
		return total == EMPTY;
	}
	
	/**
	 * @return true, jeśli stos jest pełny
	 */
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
	
	/**
	 * @return element usunięty ze stosu
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total--];
	}
				
}
