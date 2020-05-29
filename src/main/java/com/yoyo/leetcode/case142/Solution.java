package main.java.com.yoyo.leetcode.case142;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            ListNode temp = head.next;
            if (set.contains(head)) {
                return head;
            } else {
                set.add(head);
            }
            head = temp;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(3);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(0);
        ln.next.next.next = new ListNode(-4);
        ln.next.next.next.next = ln.next;
        System.out.println(new Solution().detectCycle(ln).val);
    }
}
