package main.java.com.yoyo.leetcode.case703;

import java.util.PriorityQueue;

public class KthLargest {

    private PriorityQueue<Integer> queue = null;

    private int length = 0;

    public KthLargest(int k, int[] nums) {
        length = k;
        queue = new PriorityQueue<>(k);

        for (int val: nums) {
            add(val);
        }
    }

    public int add(int val) {
        if (queue.size() < length) {
            queue.add(val);
        } else if (val > queue.peek()) {
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        KthLargest kl = new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(kl.add(3));
        System.out.println(kl.add(5));
        System.out.println(kl.add(10));
        System.out.println(kl.add(9));
        System.out.println(kl.add(4));
    }
}
