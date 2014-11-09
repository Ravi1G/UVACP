package templates;

import java.io.*;
import java.util.*;

/**
 * Created by RaviG on 11/8/2014.
 */
class Graph {

    Node[] nodes;
    ArrayList<Node>[] adj ;
    int N,E;

    Graph(int n) {
        N = n;
        nodes = new Node[N];
        adj = new ArrayList[N];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(i);
            adj[i] = new ArrayList<Node>();
        }
    }



}

class Node{
    int id;
    boolean vis;
    int pi;
    int deg;

    Node(int id) {
        this.id = id;
    }
}
