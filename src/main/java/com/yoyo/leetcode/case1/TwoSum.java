package com.yoyo.leetcode.case1;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];//返回结果
        Set used = new HashSet();//记录被用过的值

        for (int i = 0; i < nums.length;i++) {
            //判断此数字是否被使用过
            if(used.contains(i)) {
                continue;
            }
            for (int k = i+1; k <nums.length;k++) {
                if (used.contains(k)) {
                    continue;
                }
                if (nums[i] + nums[k] == target) {
                    result[0] = i;
                    result[1] = k;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3,2,3};
        int target = 6;

        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(nums,target);
        System.out.println(result[0] + "," + result[1]);
    }
}
