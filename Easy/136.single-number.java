import java.util.HashSet;
import java.util.Iterator;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */
class Solution {
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

