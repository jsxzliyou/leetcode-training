package com.yoyo.leetcode.case11;

public class MaxArea {

    public int maxArea(int[] height) {
        int result = 0;
        for (int x = 0;x < height.length;x++) {
            int x2 = x;
            while (x2 < height.length) {
                int minY = Math.min(height[x],height[x2]);
                int area = (x2 - x) * minY;
                result = Math.max(result,area);
                x2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MaxArea().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
