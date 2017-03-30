package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

public class ListStacksFactory implements StacksFactory {

	@Override
	public IStack getStandardStack() {
		return new StackList();
	}

	@Override
	public IStack getFalseStack() {
		return new StackArray();
	}

	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
