package com.yoyo.leetcode.case3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {


    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int result = 0;
        int length = 0;
        Set<String> set = null;
        for (int i = 0;i<s.length();i++) {
            set = new HashSet<String>();
            char pre = s.charAt(i);
            set.add(String.valueOf(pre));
            for (int k = i + 1;k<s.length();k++) {
                char sub = s.charAt(k);
                String ssub = String.valueOf(sub);
                if (!set.contains(ssub)) {
                    set.add(ssub);
                } else {
                    length = k - i;
                    break;
                }
                if (k == s.length() - 1) {
                    length = s.length() - i;
                    break;
                }
            }
            result = length > result ? length : result;
        }
        return result;
    }

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();

        String caseStirng = " ";

        int site = ls.lengthOfLongestSubstring(caseStirng);
        System.out.println(site);
    }
}
