/**
 * 
 */
package colin.leetcode;

import colin.leetcode.BSTIterator.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 * @author Colin Wang Created on Apr 28, 2015
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if (left == null || right == null)
			return false;
		// 都不为null
		if (left.val == right.val) {
			return isSymmetric(left.left, right.right)
					&& isSymmetric(left.right, right.left);
		} else {
			return false;
		}
	}

}
