import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
/**
 * 1、先将数组排序
 * 2、从左到右依次从数组中取一个数
 * 3、从这个定数开始，再取头尾两个数，三个数相加与0相比
 * 4、若>0，则最右边的数左移，反之左边的数右移，直到三个数相加为0
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i = 0; i < nums.length-2;i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                int left = i+1;
                int right = nums.length - 1;
                while(left < right){
                    if(nums[i]+nums[left]+nums[right]==0){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left+1])
                            left++;
                        while(left < right && nums[right] == nums[right-1])
                            right--;
                        left++;
                        right--;
                    }else if(nums[i]+nums[left]+nums[right]<0){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
            
        }
        return result;
    }
}

