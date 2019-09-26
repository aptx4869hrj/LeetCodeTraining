/*
 * @lc app=leetcode id=109 lang=java
 *
 * [109] Convert Sorted List to Binary Search Tree
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        return toBST(head, null);
    }
    public static TreeNode toBST(ListNode head, ListNode tail){
        ListNode fast = head;
        ListNode slow = head;
        if(head == tail)
            return null;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode result = new TreeNode(slow.val);
        result.left = toBST(head, slow);
        result.right = toBST(slow.next, tail);
        return result;
    }
}

