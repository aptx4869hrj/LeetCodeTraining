/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result,p = new ListNode(0);//��������ֵֻ�����£����ܲ�ǰ������֣������Ҫp����¼��������ֵ
        result = p;
        int reNum = 0;

        while(l1 != null || l2 != null || reNum != 0){
            if(l1 != null){
                reNum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                reNum += l2.val;
                l2 = l2.next;
            }
            result.next = new ListNode(reNum%10);
            reNum = reNum/10;
            result = result.next;
        }
        return p.next;
    }
}

