/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */
class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        int pre = 0;
        int tail = s.length - 1;

        while(pre < tail){
            Character temp = s[pre];
            s[pre] = s[tail];
            s[tail] = temp;
            pre ++ ;
            tail --;
        }
    }
}

