/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int num : nums) {
            if(num != val){
                nums[count] = num;
                count++;
            }
        }
        return count;
    }
}

