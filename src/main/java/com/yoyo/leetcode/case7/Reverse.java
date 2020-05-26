package com.yoyo.leetcode.case7;

/**
 * 反转整数
 */
public class Reverse {

    public int reverse(int x) {
        if (x == 0) return 0;

        String s = String.valueOf(x);
        int len = s.length() - 1;
        StringBuffer sb = new StringBuffer();
        for (int i = len; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        String out = sb.toString();
        if(out.startsWith("0")) {
            out = out.substring(1,out.length());
        }
        if(out.endsWith("-")) {
            out =  out.substring(0,out.length()-1);
            out = "-" + out;
        }
        try {
            return Integer.valueOf(out);
        }catch(Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(new Reverse().reverse(1534236469));
//        String out = "123";
//        out.substring(0,3-1);
//        System.out.println(out);
    }
}
