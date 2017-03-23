package edu.kis.vh.stacks;

public interface IStack {

	/**
	 * @param i - element dodawany do stosu
	 */
	void push(int i);

	/**
	 * @return true, jeśli stos jest pusty
	 */
	boolean isEmpty();

	/**
	 * @return true, jeśli stos jest pełny
	 */
	boolean isFull();

	/**
	 * @return element usunięty ze stosu
	 */
	int pop();
	
	int top();

}
