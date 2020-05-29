package main.java.com.yoyo.leetcode.case232;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> inSt = null;
    Stack<Integer> outSt = null;

    /** Initialize your data structure here. */
    public MyQueue() {
        inSt = new Stack<>();
        outSt = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inSt.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!outSt.empty()) return outSt.pop();
        else {
            while (!inSt.empty()) {
                outSt.push(inSt.pop());
            }
            return outSt.pop();
        }
    }

    /** Get the front element. */
    public int peek() {
        if (!outSt.empty()) return outSt.peek();
        else {
            while (!inSt.empty()) {
                outSt.push(inSt.pop());
            }
            return outSt.peek();
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inSt.empty() && outSt.empty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
