package com.tree.nary.stack;

public interface Stackable<T> {

    public void push(T data);

    public T pop();

    public boolean isEmpty();

    public T peek();

    public int size();

    public boolean search(T data);

}
