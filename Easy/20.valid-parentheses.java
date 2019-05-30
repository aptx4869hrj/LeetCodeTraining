/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character chara:s.toCharArray()) {
            if (chara == '(' || chara == '[' || chara == '{')
                stack.push(chara);
            else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    Character charPop = stack.pop();
                    if (charPop == '(' && chara != ')' || charPop == '[' && chara != ']' || charPop == '{' && chara != '}'){
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}

