package main.java.com.yoyo.leetcode.case239;

import java.util.*;

/**
 * 使用优先队列解决问题
 */
public class PriorityQueueSolution {

    private PriorityQueue<Integer> queue = null;

    public int[] maxSlidingWindow(int[] nums, int k) {

        //初始化优先队列，默认优先队列是按自然规则排序，修改为倒序
        queue = new PriorityQueue<>(k,(a,b)->b-a);

        int[] result = new int[nums.length - k + 1];
        int site = 0;
        for (int i = 0;i<nums.length;i++) {
            if (i < (k -1)){
                queue.add(nums[i]);
                continue;
            }
            if (i == (k - 1)) {
                queue.add(nums[i]);
                result[site] = queue.peek();
                site++;
                continue;
            }
            //依次往后滑动窗口
            queue.remove(nums[Math.abs(k-i)]);
            queue.add(nums[i]);
            result[site] = queue.peek();
            site++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,-1,-3,5,3,6,7};
        int[] result = new PriorityQueueSolution().maxSlidingWindow(test,3);
        System.out.println(result);
    }
}
