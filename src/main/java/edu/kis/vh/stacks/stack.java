package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class stack {

	StackList sarray = new StackList();

	public stack() {
		super();
	}

	public stack(StackList sarray) {
		super();
		this.sarray = sarray;
	}

	public void push(int i) {
		sarray.pushElement(i);
	}

	public boolean isEmpty() {
		return sarray.empty();
	}

	public boolean isFull() {
		return sarray.empty();
	}

	public int top() {
		return sarray.peek();
	}

	public int pop() {
		return sarray.pop();
	}

}
