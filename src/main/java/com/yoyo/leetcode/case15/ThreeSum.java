package com.yoyo.leetcode.case15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0;i < len;i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = len -1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] i = new int[]{-1, 0, 1, 2, -1, -4};
        new ThreeSum().threeSum(i);
    }
}
