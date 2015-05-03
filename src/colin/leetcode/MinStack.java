package colin.leetcode;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. pop() -- Removes the element on top of
 * the stack. top() -- Get the top element. getMin() -- Retrieve the minimum
 * element in the stack.
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 19, 2015
 */
public class MinStack {
	private Node top;
	private Stack<Integer> minStack = new Stack<>();

	class Node {
		int x;
		Node next;

		Node(int x) {
			this.x = x;
		}
	}

	public void push(int x) {
		if (top == null)
			minStack.push(x);
		else if (x <= minStack.peek())
			minStack.push(x);

		Node temp = new Node(x);
		temp.next = top;
		top = temp;
	}

	public void pop() {
		if (top == null) {
			return;
		}
		if (top.x == minStack.peek())
			minStack.pop();
		top = top.next;
	}

	public int top() {
		return top.x;
	}

	public int getMin() {
		return minStack.peek();
	}
}
