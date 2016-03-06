package colin.leetcode;

import java.util.Stack;

/**
 * Invert a binary tree.
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *     to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * Created by colin on 3/6/16.
 */
public class InvertBinaryTree {

    /**
     * 递归方式反转二叉树
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        } else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    /**
     * 非递归方式反转二叉树
     * @param root
     * @return
     */
    public TreeNode invertTreeNR(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode top = stack.pop();
            if (top.right != null || top.left != null) {
                swapTwoLeaf(top);
                if (top.left != null) {
                    stack.push(top.left);
                }
                if (top.right != null) {
                    stack.push(top.right);
                }
            }
        }
        return root;
    }

    public void swapTwoLeaf(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
    }
}
