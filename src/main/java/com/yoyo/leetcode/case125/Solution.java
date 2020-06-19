package main.java.com.yoyo.leetcode.case125;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;

        s = s.toLowerCase();
        char[] testString = s.toCharArray();
        boolean r = true;
        int i = 0;
        int j = s.length()-1;
        while (j>i || j-i>1) {
            //如果左右两个指针的值不符合这个规则则移动指针
            if (!Character.isLetterOrDigit(testString[i])) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(testString[j])) {
                j--;
                continue;
            }
            if (testString[i] != testString[j]) {
                r = false;
                break;
            }
            i++;
            j--;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
