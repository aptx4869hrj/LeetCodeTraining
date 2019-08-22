import java.util.HashSet;

/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
 * 不是有序的链表也适用
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        HashSet<Integer> hashSet = new HashSet<>();
        while(head != null){
            if(hashSet.contains(head.val)){
                head = head.next;
                continue;
            }else{
                hashSet.add(head.val);
                temp.next = new ListNode(head.val);
                temp = temp.next;
                head = head.next;
            }
        }
        return result.next;
    }
}

