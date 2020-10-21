package com.tree.nary.graph.unweightedgraph;

import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GNode<T> {
    private T data;
    private List<GNode<T>> vertices;

    public GNode(T data) {
        this.data = data;
        this.vertices = new LinkedList<>();
    }

    /*
     * Copies only the value / data not the vertices
     */
    public GNode(GNode<T> gNode) {
        this.data = gNode.getData();
    }

    public void addVertex(GNode<T> gNode) {
        this.vertices.add(gNode);
    }

    /*
     * Removes all the connections with adjacent vertex.
     */
    public void removeVertices() {
        this.vertices.clear();
    }
}
