package edu.kis.vh.stacks;

public class stack {

	StackArray sarray = new StackArray();

	public stack() {
		super();
	}

	public stack(StackArray sarray) {
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
