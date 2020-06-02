package main.java.com.yoyo.leetcode.case239;

import java.util.ArrayDeque;

public class DeQueueSolution {

    //初始化双端队列
    private ArrayDeque<Integer> queue = new ArrayDeque<>();
    int [] nums;

    public void clean_deque(int i, int k) {
        // remove indexes of elements not from sliding window
        if (!queue.isEmpty() && queue.getFirst() == i - k)
            queue.removeFirst();

        // remove from deq indexes of all elements
        // which are smaller than current element nums[i]
        while (!queue.isEmpty() && nums[i] > nums[queue.getLast()]){
            queue.removeLast();
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        // init deque and output
        this.nums = nums;
        int max_idx = 0;
        for (int i = 0; i < k; i++) {
            clean_deque(i, k);
            queue.addLast(i);
            // compute max in nums[:k]
            if (nums[i] > nums[max_idx]) max_idx = i;
        }
        int [] output = new int[n - k + 1];
        output[0] = nums[max_idx];

        // build output
        for (int i  = k; i < n; i++) {
            clean_deque(i, k);
            queue.addLast(i);
            output[i - k + 1] = nums[queue.getFirst()];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,-1,-3,5,3,6,7};
        int[] result = new DeQueueSolution().maxSlidingWindow(test,3);
        System.out.println(result);
    }
}
