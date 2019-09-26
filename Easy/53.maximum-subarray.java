/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int curmax = 0;
        int result = nums[0];
        for(int i = 0; i < nums.length; i++){
            curmax = Math.max(nums[i], curmax + nums[i]);
            result = Math.max(curmax, result);
        }
        return result;
    }
}

