/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) 
            return head;

        // 获取链表长度
        int len = 1;
        ListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
            len++;
        }
    
        // 如果k等于链表长度，即原链表旋转一圈，位置不变
        k = k % len;
        if(k == 0) 
            return head;

        ListNode newTail = head;
        for(int i = 0; i < len - k - 1; i++) {
            newTail = newTail.next;
        }
    
        // 将两部分结合起来
        ListNode newHead = newTail.next;   
        newTail.next = null;
        tail.next = head;
    
        return newHead;
    }
}

