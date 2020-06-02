package main.java.com.yoyo.leetcode.case242;

import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for (int i = 0;i < s1.length ;i++) {
            if (s1[i] != t1[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("abc","bca"));
    }
}
