/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */
import java.util.HashMap;
class Solution {
    public String convertToTitle(int n) {
        HashMap<Integer, Character> hashMap = new HashMap<>();
        for (int i = 0; i < 26;i++){
            hashMap.put(i,(char)('A'+i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n >= 0){
            n--;
            stringBuilder.append(hashMap.get(n%26));
            n = n/26;
            if (n == 0)
                break;
        }
        return stringBuilder.reverse().toString();
    }
}

