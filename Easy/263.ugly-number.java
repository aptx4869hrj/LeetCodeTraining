/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */
class Solution {
    public boolean isUgly(int num) {
        if(num == 0)
            return false;
        for(int i = 2; i <= 5 && num > 0; i++){
            while(num%i == 0)
                num = num / i;
        }
        return num == 1;
    }
}

/**
 * 以下方法可以实现，不过容易造成运行超时
 * class Solution {
    public boolean isUgly(int num) {
        if(num == 0)
            return false;

        while(num%2 == 0)
            num = num / 2;
        while(num%3 == 0)
            num = num / 3;
        while(num%5 == 0)
            num = num / 5;

        return num == 1;
    }
}
 */

