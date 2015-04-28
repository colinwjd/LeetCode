/**
 * 
 */
package colin.leetcode;

import colin.leetcode.BSTIterator.TreeNode;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
 * 
 * @author Colin Wang Created on Apr 28, 2015
 */
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		} else if (p == null && q != null) {
			return false;
		} else if (p != null && q == null) {
			return false;
		} else {
			if (p.val == q.val) {
				boolean leftIsSame = isSameTree(p.left, q.left);
				boolean rightIsSame = isSameTree(p.right, q.right);
				return leftIsSame && rightIsSame;
			} else {
				return false;
			}
		}

	}
}
