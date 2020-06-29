package main.java.com.yoyo.leetcode.case215;

import java.util.PriorityQueue;

public class PriorityQueueSolution {

    private PriorityQueue<Integer> queue = null;

    public int findKthLargest(int[] nums, int k) {

        queue = new PriorityQueue(k);

        for (int i=0;i<nums.length;i++) {
            if (i < k) {
                queue.add(nums[i]);
            } else {
                if (queue.peek() < nums[i]) {
                    queue.poll();
                    queue.add(nums[i]);
                }
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        System.out.println(new PriorityQueueSolution().findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
}
