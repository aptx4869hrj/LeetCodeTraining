/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */
/* 插入排序解法
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m > nums1.length || n > nums2.length || m+n > nums1.length)
            return;
        if(n == 0){
            for(int k = m; k < nums1.length; k++){
                nums1[k] = 0;
            }
        }
        if(m == 0){
            for(int k = 0; k < n; k++){
                nums1[k] = nums2[k];
            }

            for(int k = n; k < nums1.length; k++){
                nums1[k] = 0;
            }
        }
        for(int i = 0; i < n ; i++){
            for(int j = m+i-1; j >= 0; j--){
                if(nums2[i] < nums1[j]){
                    nums1[j+1] = nums1[j];
                    nums1[j] = nums2[i];
                }else{
                    nums1[j+1] = nums2[i];
                    break;
                }
            }
        }
        if(m+n < nums1.length){
            for(int k = m+n; k < nums1.length; k++){
                nums1[k] = 0;
            }
        }
    }
}
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 作为整体的角标
        int index = m+n-1;
        m--;
        n--;
        // n要插进nums1数组中，因此将n作为临界条件
        while(n >= 0){
            nums1[index] = (m >= 0 && nums1[m] > nums2[n]) ? nums1[m--] : nums2[n--];
            index--;
        }
    }
}
