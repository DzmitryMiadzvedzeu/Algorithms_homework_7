package com.telran.algorithms.hw.hw_7;

import java.util.EmptyStackException;
import java.util.Stack;

public class SpecialStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public SpecialStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        int top = stack.pop();

        if (top == minStack.peek()) {
            minStack.pop();
        }

        return top;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new EmptyStackException();
        }

        return minStack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
// не было возможности увидеть задачу из класса из-за закрытого доступа к
// репозиториям, поэтому написал код как знал,
// добавил эксцепшенны потому что мы их прошли))