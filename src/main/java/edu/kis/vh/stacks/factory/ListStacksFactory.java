package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.*;
import edu.kis.vh.stacks.implementations.*;

public class ListStacksFactory implements StacksFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack(new StackList());
	}

	@Override
	public Stack getFalseStack() {
		return new Stack(new StackArray());
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
