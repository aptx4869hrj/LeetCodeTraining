/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */
/**
 * e.g.[1,4,5,9,8,7,2]
 * 从后开始往前找，先找到第一个降序的数字，5
 * 然后重新开始从后往前找，找到第一个比5大的数字，7
 * 将5和7位置互换，得到[1,4,7,9,8,5,2]
 * 将7后面的数字进行反转，得到[1,4,7,2,5,8,9]
 * 即我们需要的答案
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int j;
        int count = 0;
        for(int i = nums.length-2; i >= 0; i-- ){
            if(nums[i] < nums[i+1]){
                count++;
                for(j = nums.length-1; j > i;j--){
                    if(nums[j] > nums[i]){
                        break;
                    }
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                reverse(nums, i+1, nums.length-1);
                return;
            }    
        }
        if(count == 0){
            reverse(nums, 0, nums.length-1);
            return;
        }
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

