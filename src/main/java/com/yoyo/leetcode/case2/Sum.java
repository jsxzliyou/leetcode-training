package com.yoyo.leetcode.case2;

public class Sum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;

        //循环两个ListNode进行相加
        while(l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            int v1 = l1==null?0:l1.val;
            int v2 = l2==null?0:l2.val;
            sum = v1 + v2 + carry;
            ListNode sumNode = new ListNode(sum % 10);
            temp.next = sumNode;
            temp = sumNode;
            carry = sum >= 10 ? 1 : 0;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return  result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next.next = new ListNode(9);

        Sum sum = new Sum();
        ListNode result = sum.addTwoNumbers(l1,l2);
        System.out.println(result.val);
//        System.out.println(15%10);

    }
}
