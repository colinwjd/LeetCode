/**
 * 
 */
package colin.leetcode;

import java.util.ArrayList;
import java.util.List;

import colin.leetcode.BSTIterator.TreeNode;

/**
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * For example: Given the following binary tree,
 *   1            <---
 * /   \
 * 2    3         <---
 * \     \
 *  5     4       <---
 * You should return [1, 3, 4].
 * @author Colin Wang Created on Apr 30, 2015
 */
public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();

        if(root == null) return res;
        // 找到每一层最右边的值
        visitLevel(root, 1, res);
        return res;
    }

    public void visitLevel(TreeNode root, int level, List<Integer> res){

        if(root == null) return;
        if(level > res.size()){
            res.add(root.val);    
        }

        visitLevel(root.right, level+1, res);
        visitLevel(root.left, level+1, res);
    }
}
