package com.yoyo.leetcode.case4;

public class FindMedian {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //初始化两个数组中位数
        double result = 0;
        if (nums1 == null) {
            nums1 = new int[]{};
        }
        if (nums2 == null) {
            nums2 = new int[]{};
        }
        int[] nn = new int[nums1.length + nums2.length];

        if (nums1.length == 0) {
            return midvar(nums2);
        }
        if (nums2.length == 0) {
            return midvar(nums1);
        }

        int i = 0,j = 0,t = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                int left = i++;
                nn[t++] = nums1[left];
                if (left == nums1.length) {
                    i--;
                }
            } else {
                int right = j++;
                nn[t++] = nums2[right];
                if (right == nums2.length) {
                    j--;
                }
            }
        }
        while (i < nums1.length) {
            nn[t++] = nums1[i++];
        }
        while (j < nums2.length) {
            nn[t++] = nums2[j++];
        }

        //判断是奇数还是偶数
        result = midvar(nn);
        return result;
    }

    private double midvar(int[] nums) {
        int ls = nums.length;
        double ma = 0;
        int midsite = Math.round(ls / 2) - 1;
        if ((ls & 1) == 1 ) {
            //奇数
            ma = nums[midsite + 1];
        } else {
            //偶数
            ma = (nums[midsite] + nums[midsite +1]) / 2.0;
//            ma = (float) (Math.round((nums[midsite] + nums[midsite +1])*100000/2)/100000.0);
        }
        return ma;
    }

    public static void main(String[] args) {
        FindMedian fm = new FindMedian();
        int[] n1 = {100000};
        int[] n2 = {100001};
        System.out.println(fm.findMedianSortedArrays(n1,n2));
    }
}
