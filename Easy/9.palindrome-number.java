/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */
class Solution {
    public boolean isPalindrome(int x) {
        int mark = x;
        if(x < 0)
            return false;
        
        int result = 0;
        while(x != 0){
            result = result*10 + x%10;
            x = x/10;
        }

        if(result == mark){
            return true;
        }else{
            return false;
        }
    }
}

