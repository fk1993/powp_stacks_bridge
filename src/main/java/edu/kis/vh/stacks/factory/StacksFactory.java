package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.*;

public interface StacksFactory {

	public Stack getStandardStack();

	public Stack getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
