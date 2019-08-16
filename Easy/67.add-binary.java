/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int m = 0;
        for(int i = a.length()-1, j = b.length()-1; i >= 0||j >= 0; i--, j--){
            int sum = m;
            sum += (i >=0?a.charAt(i) - '0':0);
            sum += (j >=0?b.charAt(j) - '0':0);
            result.append(sum%2);
            m = sum/2;
        }
        result.append(m == 1 ? m : "");
        return result.reverse().toString();
    }
}

