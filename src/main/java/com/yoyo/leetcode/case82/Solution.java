package main.java.com.yoyo.leetcode.case82;

import java.util.List;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;

        // 2.哑节点,快慢指针
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;

        while (fast != null)
        {
            if((fast.next != null && fast.val != fast.next.val) || fast.next == null)
            {
                if (slow.next == fast)
                {
                    slow = fast;
                }
                else
                {
                    slow.next = fast.next;
                }
            }
            fast = fast.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l2.next=l3;
        l1.next=l2;
        new Solution().deleteDuplicates(l1);

    }
}
