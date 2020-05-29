package main.java.com.yoyo.leetcode.case20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    private Map<Character,Character> map = null;

    public Solution(){
        map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length;i++) {

            //如果是闭括号，则与栈顶元素比较，如果是开括号则入栈
            if (map.containsKey(chars[i])) {
                char topEl = stack.empty() ? 'a' : stack.pop();
                if (topEl != map.get(chars[i])) return false;
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("]"));
    }
}
