package com.tree.nary.queue;

public interface Queueable<T> {

    public void enqueue(T data);

    public T dequeue();

    public boolean isEmpty();

    public int size();

    public boolean search(T data);
}
