import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // 定义输出结果
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if(len < 4)
            return result;
        
        // 对传入的数组进行排序
        Arrays.sort(nums);

        int minValue = nums[0] + nums[1] + nums[2] + nums[3];
        int maxValue = nums[len - 1] + nums[len - 2] + nums[len - 3] + nums[len - 4];
        if(maxValue < target || minValue > target){
            return result;
        }
        int left = 2;
        int right = len - 1;
        // 第一个固定的值
        int firstValue = 0;
        // 第二个固定的值
        int secondValue = 0;

        int fourNumSum = 0;
        for(int one = 0; one <= len - 4; one++){
            firstValue = nums[one];
            if(one > 0 && nums[one] == nums[one - 1]){
                continue;
            }
            for(int two = one + 1; two <= len - 3; two++){
                if(two > one + 1 && nums[two] == nums[two - 1]){
                    continue;
                }
                secondValue = nums[two];
                left = two + 1;
                right = len - 1;
                minValue = firstValue + secondValue + nums[two + 1] + nums[two + 2];
                maxValue = firstValue + secondValue + nums[len - 1] + nums[len - 2];
                if(maxValue < target || minValue > target){
                    left = right;
                }
                while(left < right){
                    fourNumSum = nums[left] + nums[right] + firstValue + secondValue;
                    if(fourNumSum > target){
                        right--;
                        while(right > left && nums[right] == nums[right + 1]){
                            right--;
                        }
                    }else if(fourNumSum < target){
                        left++;
                        while(right > left && nums[left] == nums[left - 1]){
                            left ++;
                        }
                    }else{
                        List<Integer> re = new ArrayList<>();
                        re.add(firstValue);
                        re.add(secondValue);
                        re.add(nums[left]);
                        re.add(nums[right]);
                        result.add(re);

                        left++;
                        right--;
                        while(right > left && nums[right] == nums[right + 1]){
                            right--;
                        }
                        while(right > left && nums[left] == nums[left - 1]){
                            left++;
                        }
                    }
                }
            }

        }
        return result;
    }
}

