import java.util.HashMap;

import javax.lang.model.type.IntersectionType;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> chara = new HashMap<>();
        chara.put('I', 1);
        chara.put('V', 5);
        chara.put('X', 10);
        chara.put('L', 50);
        chara.put('C', 100);
        chara.put('D', 500);
        chara.put('M', 1000);

        int sum = 0; //定义总数
        for(int i = 0; i < s.length(); i++){
            if(i < s.length()-1 && chara.get(s.charAt(i)) < chara.get(s.charAt(i+1))){
                sum = sum - chara.get(s.charAt(i));
            }else{
                sum = sum + chara.get(s.charAt(i));
            }
            
        }
        return sum;
    }
}

