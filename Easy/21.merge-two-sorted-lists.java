/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 * 
 */
class Solution<ListNode> {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode result = new ListNode(0);
        ListNode pre = result;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
                pre = pre.next;
            }else{
                pre.next = l2;
                l2 = l2.next;
                pre = pre.next;
            }
        }
         if(l1 == null)
             pre.next = l2;
         else
             pre.next = l1;

        return result.next;
    }
}

