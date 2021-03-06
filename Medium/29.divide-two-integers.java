/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) 
            return Integer.MAX_VALUE;
        // 全部都转为负数进行求解
        if(dividend > 0 && divisor > 0) 
            return divideHelper(-dividend, -divisor);
        else if(dividend > 0) 
            return -divideHelper(-dividend,divisor);
        else if(divisor > 0) 
            return -divideHelper(dividend,-divisor);
        else 
            return divideHelper(dividend, divisor);
    }
    
    private int divideHelper(int dividend, int divisor){
        // 负数时，被除数要比除数小
        if(divisor < dividend) 
            return 0;
            
        int cur = 0, res = 0;
        while((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) 
            cur++;
        res = dividend - (divisor << cur-1);
        if(res > divisor) 
            return 1 << cur-1;
        return (1 << cur-1)+divide(res, divisor);
    }
}

