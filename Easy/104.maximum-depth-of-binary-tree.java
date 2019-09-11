/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
/* BFS方法
class Solution {
    public int maxDepth(TreeNode root) {
        int result = 0;
        if(root == null){
            return result;
        }
        Queue<TreeNode> node = new LinkedList<TreeNode>();
        node.add(root);
        while(!node.isEmpty()){
            int size = node.size();
            for(int i = 0; i < size; i++){
                if(node.peek().left != null)
                    node.add(node.peek().left);
                if(node.peek().right != null)
                    node.add(node.peek().right);
                node.poll();
            }
            result++;
        }
        return result;
    }
}
*/

/**
 * 递归方法
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftMax = (root.left == null) ? 0 : maxDepth(root.left);
        int rightMax = (root.right == null) ? 0 : maxDepth(root.right);
        return Math.max(leftMax, rightMax) + 1;
    }
}
