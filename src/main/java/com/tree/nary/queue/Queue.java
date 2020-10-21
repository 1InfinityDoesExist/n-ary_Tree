package com.tree.nary.queue;

import java.util.LinkedList;

public class Queue<T> extends LinkedList<T> implements Queueable<T> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void enqueue(T data) {
        addLast(data);

    }

    @Override
    public T dequeue() {
        return pollFirst();
    }

    @Override
    public boolean search(T data) {
        return contains(data);
    }

}
