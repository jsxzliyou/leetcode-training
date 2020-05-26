package com.yoyo.leetcode.case14;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        for (int i = 0;i<strs[0].length();i++) {
            char site = strs[0].charAt(i);
            for (int j = 1;j<strs.length;j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != site) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"aa","a"}));
    }
}
