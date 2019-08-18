/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */
/**
 * 动态规划解法
 */
//class Solution {
//    public int climbStairs(int n) {
//        if(n <= 2)
//            return n;
//        int[] fib = new int[n+1];
//       fib[0] = 0;
//        fib[1] = 1;
//        fib[2] = 2;
//       for(int i = 3; i <= n; i++){
//            fib[i] = fib[i-1] + fib[i-2];
//        }
//        return fib[n];
//    }
//}
/**
 * 递归方法，超时
 */
//class Solution {
//   public int climbStairs(int n) {
//        if(n == 0 || n == 1)
//            return 1;
//        else
//            return climbStairs(n-1) + climbStairs(n - 2);
//    }
//}
/**
 * 递推方法
 */
class Solution {
    public int climbStairs(int n) {
        int[] result = {0,1,2};
        if(n < 3)
            return result[n];
        for(int i = 3; i <= n ;i++){
            result[0] = result[1];
            result[1] = result[2];
            result[2] = result[0] + result[1];
        }
        return result[2];

    }
}
