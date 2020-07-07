package main.java.com.yoyo.leetcode.case61;

public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;

        /*
         * 应该先将链表闭合成环然后再在合适的位置将链表断开即可
         * 1、循环链表记录链表的长度
         * 2、将表尾的next赋值为head
         */
        ListNode origin = head;
        int length = 1;
        for (;length<Integer.MAX_VALUE;length++) {
            if (origin.next != null) {
                origin = origin.next;
            }else{
                origin.next = head;
                break;
            }
        }
        ListNode newHead = head;
        ListNode result = null;
        for (int i = 0;i<length-k%length-1;i++) {
            newHead = newHead.next;
        }
        result = newHead.next;
        newHead.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l2.next=l3;
        l1.next=l2;
        new Solution().rotateRight(l1,4);

    }
}
