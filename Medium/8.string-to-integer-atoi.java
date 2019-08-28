/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */
class Solution {
    public int myAtoi(String str) {
        if(str.isEmpty())
            return 0;
        int i = 0; //建立角标
        int sign = 1; //判断符号
        int result = 0; //返回值
        while(str.charAt(i) == ' ')
            i++;
        if(str.charAt(i) == '-' || str.charAt(i) == '+'){
            sign = str.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i< str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE && str.charAt(i) > '7')){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + str.charAt(i)-'0';
            i++;
        }
        return sign * result;
    }
}

