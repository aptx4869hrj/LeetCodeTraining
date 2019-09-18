/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        TreeNode result = helper(nums, 0, nums.length-1);
        return result;
    }
    public TreeNode helper(int[] nums, int left, int right){
        if(left > right)
            return null;
        int mid = left + (right - left)/2;
        TreeNode res = new TreeNode(nums[mid]);
        res.left = helper(nums, left, mid-1);
        res.right = helper(nums, mid+1, right);
        return res;
    }
}

