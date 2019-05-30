/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int n : nums)
            if (count == 0 || n > nums[count-1]){
                nums[count] = n;
                count++;
            }
        return count;
    }
}

