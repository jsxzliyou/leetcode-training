package main.java.com.yoyo.leetcode.case26;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int pre = nums[0];
        int newLen = 1;
        for (int i = 1;i<nums.length;i++) {
            if (nums[i] != pre) {
                pre = nums[i];
                nums[newLen] = nums[i];
                newLen++;
            }
        }
        return newLen;
    }

    public static void main(String[] args) {
        new Solution().removeDuplicates(new int[]{});
    }
}
