
/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */
class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2)
            return 0;
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left < right){
            // 比较前一个值和当前值获得最大值
            result = Math.max(result, Math.min(height[left], height[right])*(right-left));
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return result;
    }
}

