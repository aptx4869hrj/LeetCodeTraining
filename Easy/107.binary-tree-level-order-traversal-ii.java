/*import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;*/

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null)
            return result;
        // 定义一个队列用来存储每一层的节点
        Queue<TreeNode> temp = new LinkedList<TreeNode>();
        temp.add(root);
        while(!temp.isEmpty()){
            List<Integer> breath = new LinkedList<Integer>();
            int nums = temp.size();
            for(int i = 0; i < nums; i++){
                if(temp.peek().left != null)
                    temp.add(temp.peek().left);
                if(temp.peek().right != null)
                    temp.add(temp.peek().right);
                breath.add(temp.remove().val);
            }
            // 从头插进去
            result.add(0, breath);
        }
        return result;
    }
}

