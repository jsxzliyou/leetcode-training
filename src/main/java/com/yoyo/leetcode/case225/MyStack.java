package main.java.com.yoyo.leetcode.case225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> inQe = null;
    private Queue<Integer> outQe = null;
    private int top = 0;
    private int pre = 0;
    /** Initialize your data structure here. */
    public MyStack() {
        inQe = new LinkedList<>();
        outQe = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        inQe.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        while (!inQe.isEmpty()) {
            int poll = inQe.poll();
            if (poll == top) {
                top = pre;
                return poll;
            }
            pre = poll;
            outQe.add(poll);
        }
        while (!outQe.isEmpty()) {
            int poll = outQe.poll();
            if (poll == top ) {
                top = pre;
                return poll;
            }
            pre = poll;
            inQe.add(poll);
        }
        return top;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return inQe.isEmpty() && outQe.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.top);
        System.out.println(myStack.empty());
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
