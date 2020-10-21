package com.tree.nary.stack;

import java.util.LinkedList;

public class Stack<T> extends LinkedList<T> implements Stackable<T> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void push(T data) {
        add(data);
    }

    @Override
    public T pop() {
        return pollLast();
    }

    @Override
    public T peek() {
        return peekLast();
    }

    @Override
    public boolean search(T data) {
        return contains(data);
    }
}
