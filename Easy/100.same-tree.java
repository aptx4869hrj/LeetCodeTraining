/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null && q != null || q == null && p != null)
            return false;
        if(p.val != q.val)
            return false;   
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

