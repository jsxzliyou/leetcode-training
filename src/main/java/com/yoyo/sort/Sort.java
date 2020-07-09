package main.java.com.yoyo.sort;

import java.util.Arrays;

public class Sort {

    // 普通冒泡排序，从后往前，依次将最小的数据往前挪
    private static void bubbleSort(int[] nums) {

        int length = nums.length;
        for (int i = 0;i < length;i++) {
            for (int k = length-1; k > i;k--) {
                if (nums[k]<nums[k-1]) {
                    int tmp = nums[k];
                    nums[k] = nums[k-1];
                    nums[k-1]=tmp;
                }
            }
        }
    }

    // 冒泡排序，将最大的往后排，并且优化如果某次没有数字移动，直接结束
    private static void bubbleSort2(int[] nums) {
        int length = nums.length;
        for (int i = 0;i < length;i++) {
            boolean move = false;
            for (int k = 0; k <length - i - 1;k++) {
                if (nums[k]>nums[k+1]) {
                    int tmp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1]=tmp;
                    move = true;
                }
            }
            if (!move) break;
        }
    }

    // 选择排序
    private static void selectSort(int[] nums) {
        int length = nums.length;
        for (int i = 0;i < length - 1;i++) {
            int index = i;
            for (int k = i+1;k<length;k++) {
                if (nums[i] > nums[k]) {
                    index = k;
                }
            }
            int tmp = nums[index];
            nums[index] = nums[i];
            nums[i] = tmp;
        }
    }

    public static void main(String[] args) {

        int[] nums = {8,3,2,56,3,98,1,10};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
