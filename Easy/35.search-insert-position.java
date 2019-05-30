/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)
            return 0;
        if(target > nums[len - 1])
            return len;
        
        for(int i = 0;i < len ;i++){
            if(target <= nums[i])
                return i;
        }
        return -1;
    }
}

