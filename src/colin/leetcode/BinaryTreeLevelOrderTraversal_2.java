/**
 * 
 */
package colin.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import colin.leetcode.BSTIterator.TreeNode;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes'
 * values. (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * return its bottom-up level order traversal as:
 * [
 *  [15,7],
 *  [9,20],
 *  [3]
 * ]
 * @author Colin Wang Created on Apr 29, 2015
 */
public class BinaryTreeLevelOrderTraversal_2 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		Deque<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null)
					queue.offer(queue.peek().left);
				if (queue.peek().right != null)
					queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			result.add(0, subList);
		}
		return result;
	}
}
