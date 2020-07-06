package main.java.com.yoyo.leetcode.case19;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) return null;
        ListNode tmp = head;
        int i = 1;
        while (tmp.next != null) {
            i++;
            tmp = tmp.next;
        }
        //如果删除头元素
        if (i == n) {
            return head.next;
        }
        tmp = head;
        for (int k = 0;k<i-n;k++) {
            if (k == i-n-1) {
                if (tmp.next.next == null) {
                    tmp.next = null;
                    return head;
                } else {
                    tmp.next = tmp.next.next;
                    return head;
                }
            }
            tmp = tmp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l4.next=l5;
        l3.next=l4;
        l2.next=l3;
        l1.next=l2;
        new Solution().removeNthFromEnd(l1,2);
    }
}
