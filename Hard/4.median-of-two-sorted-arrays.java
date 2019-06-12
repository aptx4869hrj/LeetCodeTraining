/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int[] result = new int[nums1.length + nums2.length];
        for (int num:nums1) {
            queue1.add(num);
        }
        for (int num:nums2) {
            queue2.add(num);
        }
        int count = 0;
        while (!queue1.isEmpty() && !queue2.isEmpty()){
            if (queue1.peek() < queue2.peek()){
                result[count] = queue1.poll();
            }else {
                result[count] = queue2.poll();
            }
            count++;
        }
        while (queue1.isEmpty() && !queue2.isEmpty()){
            result[count] = queue2.poll();
            count++;
        }
        while (!queue1.isEmpty() && queue2.isEmpty()){
            result[count] = queue1.poll();
            count++;
        }

        int length = result.length;
        if (length == 2){
            return ((double)result[0] + (double)result[1])/2;
        }
        if (length % 2 == 1){
            return (double)result[(length - 1)/2];
        }else
            return ((double)result[length/2] + (double)result[(length - 2)/2])/2;
    }
}


