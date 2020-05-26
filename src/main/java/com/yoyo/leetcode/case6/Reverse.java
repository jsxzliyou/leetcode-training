package com.yoyo.leetcode.case6;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        StringBuffer result = new StringBuffer();
        List<StringBuffer> list = new ArrayList<>();
        for (int i = 0;i<Math.min(numRows,s.length());i++) {
            list.add(new StringBuffer());
        }

        int curRow = 0;
        boolean down = false;
        for (char site : s.toCharArray()) {
            list.get(curRow).append(site);
            //判断当前行与限定行的关系
            if (curRow == 0 || curRow == numRows - 1) {
                down = !down;
            }
            curRow = down ? curRow + 1 : curRow - 1;
        }
        for (StringBuffer temp : list) {
            result.append(temp);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Reverse rr = new Reverse();
        int numRows = 4;
        String s = "LEETCODEISHIRING";
        String result = rr.convert(s,numRows);
        System.out.println(result);
    }
}
