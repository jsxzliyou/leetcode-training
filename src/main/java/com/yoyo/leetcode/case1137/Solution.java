package main.java.com.yoyo.leetcode.case1137;

public class Solution {

    //记录是否计算过
    private int[] nums = new int[38];

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (n == 3) return 2;

        if (nums[n] != 0) {
            return nums[n];
        }
        nums[n] = tribonacci(n-3) + tribonacci(n-1) + tribonacci(n-2);
        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().tribonacci(25));
    }
}
