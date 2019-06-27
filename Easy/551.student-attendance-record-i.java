/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */
class Solution {
    public boolean checkRecord(String s) {
        int count_A = 0;
        int count_L = 0;
        for (Character var : s.toCharArray()) {
            if(var == 'A')
                count_A++;
            if(var == 'L')
                count_L++;
            else
                count_L = 0;
            if(count_A > 1 || count_L > 2)
                return false;
        }
        
        return true;
    }
}

