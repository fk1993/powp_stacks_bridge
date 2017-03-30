package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements StacksFactory {

	@Override
	public IStack getStandardStack() {
		return new Stack();
	}

	@Override
	public IStack getFalseStack() {
		return new Stack();
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
