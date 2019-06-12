/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();

    int i = 0;
    int j = 0;
    int maxLength = 0;

    while (i < s.length()) {
        if (!set.contains(s.charAt(i))) {
            set.add(s.charAt(i));
            i++;
            maxLength = Math.max(maxLength, set.size());
        } else {
            set.remove(s.charAt(j));
            j++;
        }
    }
    
    return maxLength;
    }
}

