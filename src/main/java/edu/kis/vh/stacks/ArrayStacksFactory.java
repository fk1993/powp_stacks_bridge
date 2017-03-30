package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.implementations.*;

public class ArrayStacksFactory implements StacksFactory {

	@Override
	public IStack getStandardStack() {
		return new StackArray();
	}

	@Override
	public IStack getFalseStack() {
		return new StackList();
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
