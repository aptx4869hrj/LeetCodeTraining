import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>();

        int i = 0;
        store.put(target - nums[i], i);
        i++;
        while (!store.containsKey(nums[i])) {
            store.put(target - nums[i], i);
            i++;
        }

        return new int[]{store.get(nums[i]), i};
    }
}

