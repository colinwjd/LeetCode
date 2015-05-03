package colin.leetcode;

import java.util.Stack;

/**
 * Definition for binary tree 
 * public class TreeNode { 
 *     int val; 
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *         val = x;
 *     }
 * } 
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext())
 *     v[f()] = i.next();
 */
public class BSTIterator {
	Stack<TreeNode> stack;
	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		pushLeft(root);
	}
	
	// 在最左侧路径上的节点依次入栈
	private void pushLeft(TreeNode root) {
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}
	
	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode root = stack.pop();
		if (root.right != null)
			pushLeft(root.right);
		return root.val;
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
