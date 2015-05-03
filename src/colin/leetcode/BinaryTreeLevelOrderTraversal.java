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
 * Given a binary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * return its level order traversal as:
 *  [
 *   [3],
 *   [9,20],
 *   [15,7]
 *  ]
 * @author Colin Wang Created on Apr 26, 2015
 */
public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
        	return result;
        List<Integer> level = new ArrayList<>();
        TreeNode levelLast = root;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	level.add(node.val);
        	if (node.left != null)
        		queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
			if (node == levelLast) {
				result.add(level);
				level = new ArrayList<>();
				levelLast = queue.peekLast();
			}
        }
        return result;
    }

}
