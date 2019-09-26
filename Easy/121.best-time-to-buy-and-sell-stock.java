/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */
/*
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int result = 0;
        int first = prices[0];
        int max = first;
        for(int i = 0; i < prices.length-1; i++){
            first = prices[i];
            max = first;
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] > max){
                    max = prices[j];
                }
            }
            result = Math.max(result, max-first);
        }
        return result;
    }
}
*/

class Solution{
    public int maxProfit(int[] prices){
        int max = 0;
        int curmax = 0;
        for (int i = 1; i < prices.length; i++){
            curmax = Math.max(0, curmax += prices[i] - prices[i-1]);
            max = Math.max(max, curmax);
        }
        return max;
    }
}

