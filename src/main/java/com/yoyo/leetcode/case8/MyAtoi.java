package com.yoyo.leetcode.case8;

public class MyAtoi {

    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty() || ((!str.startsWith("-") && !str.startsWith("+")) && (str.charAt(0) > 57 || str.charAt(0) < 48)))
            return 0;
        StringBuffer value = new StringBuffer();
        if (str.startsWith("-") || str.startsWith("+")) {
            value.append(str.substring(0,1));
            str = str.substring(1);
        }
        for (char site : str.toCharArray()) {
            if (site >= 48 && site <= 57) {
                value.append(site);
            } else {
                break;
            }
        }
        if (value.toString().equals("-") || value.toString().equals("+")) {
            return 0;
        }
        try {
            return Integer.valueOf(value.toString());
        } catch (Exception e) {
           if (value.toString().startsWith("-")) {
               return Integer.MIN_VALUE;
           } else {
               return Integer.MAX_VALUE;
           }
        }
    }

    public static void main(String[] args) {
        System.out.println(new MyAtoi().myAtoi("+"));
//        String str = "a";
//        System.out.println(str.charAt(0) > 57 || str.charAt(0) < 48);
    }
}
