/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */
class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;
        for(String word: s.split(" ")) 
            count = word.length();
        return count;
    }
}

