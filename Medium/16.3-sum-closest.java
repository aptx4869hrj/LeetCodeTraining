/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0]+nums[1]+nums[nums.length-1];
        int pre = nums[0]+nums[1]+nums[nums.length-1];

        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++){
            int low= i+1;
            int high= nums.length-1;
            while (low<high){
                int sum= nums[i]+nums[low]+nums[high];
                int temp=Math.abs(sum-target)<Math.abs(pre-target)?sum:pre;
                res=Math.abs(res-target)<Math.abs(temp-target)?res:temp;
                if (sum==target)
                    return target;
                else if(sum<target){
                    pre=sum;
                    low++;
                }
                else {
                    pre=sum;
                    high--;
                }
            }
        }
        return res;
    }
}

