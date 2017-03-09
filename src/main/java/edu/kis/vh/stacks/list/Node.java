package edu.kis.vh.stacks.list;

public class Node {

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
