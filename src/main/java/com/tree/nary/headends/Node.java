package com.tree.nary.headends;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T data;
    private List<Node<T>> children;

    public Node(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    // This does not copy the node children. Only value is copied
    public Node(Node<T> node) {
        this.data = node.getData();
        this.children = new ArrayList<>();
    }

    public void addChild(Node<T> child) {
        this.children.add(child);
    }

    // Remove all the children of this node.
    public void removeChildren() {
        this.children.clear();
    }

    public T getData() {
        return data;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }


}
