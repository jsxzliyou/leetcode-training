package com.yoyo.leetcode.case9;

public class IsPalindrome {

    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        String value = String.valueOf(x);

        for (int i = 0;i<=value.length()/2;i++) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(10));

        System.out.println(12321%10000);
        System.out.println(12321/10000);
    }
}
