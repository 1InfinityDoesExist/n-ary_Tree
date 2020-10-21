package com.tree.nary.graph.unweightedgraph;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Graph<T> {

    private GNode<T> src;

    public Graph(GNode<T> src) {
        this.src = src;
    }
}
