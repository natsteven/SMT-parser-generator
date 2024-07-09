package edu.boisestate.cs.utils;
import java.util.ArrayList;

public class NodeGraph {

    private ArrayList<Node> graph;
    private String alphabet;

    public NodeGraph(ArrayList<Node> graph, String alphabet) {
        this.graph = graph;
        this.alphabet = alphabet;
    }

    public ArrayList<Node> getNodeGraph() {
        return graph;
    }

    public String getAlphabet() {
        return alphabet;
    }
}
