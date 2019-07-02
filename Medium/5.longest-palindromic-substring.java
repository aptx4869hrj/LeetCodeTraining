/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */
class Solution {
    private int Left, Right;
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            // 奇数情况
            spread(s,i,i);
            // 偶数情况
            spread(s,i,i+1);
        }
        return s.substring(Left, Left + Right);
    }   
    public void spread(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        // 跳出while循环时，回文串的开头和结尾游标分别被-1和+1
        // 因此计算长度的补回：len=(k-1)-(j+1)+1=k-j-1
        if(Right < r-l-1){
            Left = l+1;
            Right = r-l-1;
        }
    }
}

