/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    public static void backtrack(List<String> ans, String s, int left, int right, int max) {
        if (s.length() == max*2) {
            ans.add(s);
            return;
        }
        if(left < max)
            backtrack(ans, s+'(', left+1, right, max);
        if(right < left)
            backtrack(ans, s+')', left, right+1, max);
        return;
    }
}

