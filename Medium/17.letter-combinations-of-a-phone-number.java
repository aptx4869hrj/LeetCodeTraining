import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
/**
 * 队列迭代
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits.isEmpty())
            return result;
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for(int i= 0; i < digits.length(); i++){
            int num = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String pre = result.remove();
                for (char ch : map[num].toCharArray()) {
                    result.add(pre + ch);
                }
            }
        }
        return result;
    }
}

