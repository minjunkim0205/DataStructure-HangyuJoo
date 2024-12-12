package linkedstack;

class CharNode {
	char data;
	CharNode link;
}

public class LinkedStack {
	private CharNode top;

	public boolean isEmpty() {
		return (top == null);
	}

	public void push(char x) {
		CharNode newNode = new CharNode();
		newNode.data = x;
		newNode.link = top;
		top = newNode;
	}

	public char pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty. Cannot pop.");
		}
		char data = top.data;
		top = top.link;
		return data;
	}

	public void remove() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty. Cannot remove.");
		}
		top = top.link;
	}

	public char peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty. Cannot peek.");
		}
		return top.data;
	}
}