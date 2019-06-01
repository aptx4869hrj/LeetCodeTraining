import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */
/**
 * set去重方法
 * class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : nums) {
            if(!result.add(num))
                result.remove(num);
        }
        Iterator<Integer> it = result.iterator();
        return it.next();
    }
}
 */
/***

/**
 * class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
 */
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>();
        int resultNum = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(result.containsKey(num)){
                result.remove(num);
            }else{
                result.put(num, i);
            }
        }
        for (int res : result.keySet()) {
            resultNum = res;
        }
        return resultNum;
    }
}

