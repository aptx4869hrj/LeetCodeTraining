/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0)
            return head;
        ListNode pre = head;
        int len = 0;
        while(pre != null){
            len++;
            pre = pre.next;
        }
        // 长度为1， 再删除一个则链表为空
        if(len == 1 && n == 1)
            return null;
        
        int num = len - n;
        if(num == 0){
            return head.next;
        }

        pre = head;
        while(--num > 0){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
*/
/* 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode h = head;
        int len = 0;
        while(h != null){
            len++;
            h = h.next;
        }

        len = len - n;
        h = pre;
        while(len > 0){
            h = h.next;
            len--;
        }
        h.next = h.next.next;
        return pre.next;
    }
}
*/
// 只需要一次遍历
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode first = pre;
        ListNode second = pre;
        for(int i = 0; i < n+1; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return pre.next;
    }
}
