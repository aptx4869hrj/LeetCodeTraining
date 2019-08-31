import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int sum = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0;i < nums.length; i++){
            int low = i+1;
            int high = nums.length-1;
            while (low < high){
                if(Math.abs((nums[i]+nums[low]+nums[high] - target)) < sum){
                    res = nums[i]+nums[low]+nums[high];
                    sum = Math.abs(res - target);
                }
                if(nums[i]+nums[low]+nums[high] - target > 0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return res;
    }
}

