package edu.kis.vh.stacks;

/**
 * Standardowa implementacja stosu.
 *
 */

public class Stack {

	private IStack array;

	public Stack(){
		array = new StackArray();
	}
	public Stack(StackArray array) {
		super();
		this.array = array;
	}

	public void push(int i) {
		array.push(i);
	}
	public boolean isEmpty() {
		return array.isEmpty();
	}
	public boolean isFull() {
		return array.isFull();
	}
	public int top() {
		return array.top();
	}
	public int pop() {
		return array.pop();
	}
}
