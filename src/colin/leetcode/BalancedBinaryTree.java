/**
 * 
 */
package colin.leetcode;

import colin.leetcode.BSTIterator.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 * 
 * @author Colin Wang Created on Apr 26, 2015
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int leftDepth = treeDepth(root.left);
		int rigthDepth = treeDepth(root.right);
		int abs = Math.abs(leftDepth - rigthDepth);
		if (abs > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}

	private int treeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		return left > right ? left + 1 : right + 1;
	}
}
