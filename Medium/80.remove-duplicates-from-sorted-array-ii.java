/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        // 排序的数组
        for (int num : nums) {
            if(count < 2 || nums[count-2] > num){
                nums[count] = num;
                count++;
            }
        }
        return count;
    }
}

