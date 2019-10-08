/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findIndex(nums, target);
        if(start == nums.length || nums[start] != target)
            return new int[]{-1, -1};
        int end = findIndex(nums, target+1) - 1;
        return new int[]{start, end};
    }
    public static int findIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}

