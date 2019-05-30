/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        int minLen = strs[0].length();
        int minIndex = 0;
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < minLen){
                minLen = strs[i].length();
                minIndex = i;
            }
        }
        
        String sub = strs[minIndex];
        for(int j = 0; j < strs.length; j++){
            while(strs[j].indexOf(sub) != 0){
                sub = sub.substring(0, sub.length() - 1);
            }
        }

        return sub;
    }
}

