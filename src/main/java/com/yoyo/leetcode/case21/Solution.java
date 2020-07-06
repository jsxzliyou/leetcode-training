package main.java.com.yoyo.leetcode.case21;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode result = new ListNode();
        dummy.next = result;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode temp = null;
        while (t1 != null && t2 != null) {
            temp = new ListNode();

            if (t1.val < t2.val) {
                temp.val = t1.val;
                t1 = t1.next;
            } else {
                temp.val = t2.val;
                t2 = t2.next;
            }
            result.next = temp;
            result = result.next;
        }
        result.next = t1==null?t2:t1;
        return dummy.next.next;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l14 = new ListNode(4);

        l12.next = l14;
        l11.next = l12;

        ListNode l21 = new ListNode(1);
        ListNode l23 = new ListNode(3);
        ListNode l24 = new ListNode(4);

        l23.next = l24;
        l21.next = l23;
        new Solution().mergeTwoLists(l11,l21);
    }
}
