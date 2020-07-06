package main.java.com.yoyo.leetcode.case19;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = new ListNode(0);
        first.next = head;

        int length = 1;
        ListNode tmp = head;
        while (tmp.next != null) {
            length++;
            tmp = tmp.next;
        }
        length-=n;
        tmp = first;
        while (length > 0) {
            tmp = tmp.next;
            length--;
        }
        tmp.next = tmp.next.next;
        return first.next;
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
