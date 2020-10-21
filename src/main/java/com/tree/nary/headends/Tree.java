package com.tree.nary.headends;

import lombok.ToString;

@ToString
public class Tree<T> {

    private Node<T> root;

    public Tree(Node<T> root) {
        super();
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }


    /*
     * Check whether the tree is null or not
     */
    public boolean isEmpty() {
        return root == null;
    }


    /*
     * Check whether given data exist in tree or not
     */
    public boolean exist(T data) {
        return find(root, data);
    }

    private boolean find(Node<T> root, T data) {
        if (root == null) {
            return false;
        }
        if (root.getData().equals(data)) {
            return true;
        } else {
            for (Node<T> node : root.getChildren()) {
                find(node, data);
            }
        }
        return false;
    }

    /*
     * Find node of the given data
     */
    public Node<T> findNode(Node<T> root, T data) {
        if (root == null) {
            return null;
        }
        if (root.getData().equals(data)) {
            return root;
        } else {
            for (Node<T> node : root.getChildren()) {
                findNode(node, data);
            }
        }
        return null;
    }

}
