package main.java.com.yoyo.leetcode.case141;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasCycle {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            ListNode temp = head.next;
            head.next = null;
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = temp;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(3);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(0);
        ln.next.next.next = new ListNode(-4);
        ln.next.next.next.next = ln.next;
        System.out.println(new HasCycle().hasCycle(ln));
    }
}
