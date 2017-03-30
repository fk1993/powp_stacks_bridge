package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.*;

public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackArray array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	private final StackList temp = new StackList();
	/* StackList jest lepszym wyborem, ponieważ lista lepiej się nadaje 
	 * do implementacji mechanizmu FIFO niż tablica. */
	
	@Override
	public int pop() {
		while (!isEmpty())
		
			temp.push(super.pop());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
	
			push(temp.pop());
		
		return ret;
	}
}
