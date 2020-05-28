package main.java.com.yoyo.leetcode.case24;

import java.util.List;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        //定义返回结果
        ListNode result = new ListNode(-1);
        result.next = head;
        //记录前继节点
        ListNode pre = result;
        while (head != null && head.next != null) {

            ListNode left = head;
            ListNode right = head.next;

            pre.next = right;
            left.next = right.next;
            right.next = left;
            //移动指针
            pre = left;
            head = left.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);

        ListNode result = new SwapPairs().swapPairs(ln);
    }
}
