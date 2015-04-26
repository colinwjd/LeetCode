package colin.leetcode;

import colin.leetcode.BSTIterator.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
 * 
 * @author Colin Wang Created on Apr 26, 2015
 */
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		return treeDepth(root);
	}
	
	private int treeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int l = treeDepth(root.left);
		int r = treeDepth(root.right);
		return l < r ? r + 1 : l + 1;
	}
}
