package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.Stack;

public class StackList extends Stack {

	private static final int EMPTY = -1;
	private Node last;
	int i;

	/*
	 * Refactor -> Change method signature
	 */
	
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	public int peek() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

class Node {

	private int value;
	private Node prev;
	private Node next;
	//3.1.8. bezpośrednie odwołania do atrybutów zostały zastąpione getterami i setterami

	public Node(int i) {
		value = i;
	}

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

}
//Alt+Arrow Left/Alt+Arrow Right - Go to previous / go to next Editor Window
