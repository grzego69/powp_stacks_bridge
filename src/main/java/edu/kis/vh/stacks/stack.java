package edu.kis.vh.stacks;

import edu.kis.vh.interfaces.StackInterface;

public class stack implements StackInterface{

	StackInterface sarray;

	public stack() {
		super();
	}

	public stack(StackInterface sarray) {
		super();
		this.sarray = sarray;
	}

	public void push(int i) {
		sarray.push(i);
	}

	public boolean isEmpty() {
		return sarray.isEmpty();
	}

	public boolean isFull() {
		return sarray.isFull();
	}

	public int top() {
		return sarray.top();
	}

	public int pop() {
		return sarray.pop();
	}

}
