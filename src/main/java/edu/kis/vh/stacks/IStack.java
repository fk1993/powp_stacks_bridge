package edu.kis.vh.stacks;

public interface IStack {

	public int EMPTY = 0;
	/* Przeniesienie stałej do wspólnego interfejsu ułatwia zmianę zwracanej wartości. */

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
	
	/**
	 * @return element znajdujący się na szczycie stosu
	 */
	int top();

}
