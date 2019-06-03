import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return Symmetric(root.left, root.right);
    }
    public boolean Symmetric(TreeNode left, TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return Symmetric(left.left, right.right) && Symmetric(left.right, right.left);
    }
}

