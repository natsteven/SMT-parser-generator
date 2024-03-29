package edu.boisestate.cs.utils;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class toNodeGraph { // could have done this without converting from jsonObjects to nodes but this seemed like a good idea.



    /**
     * Takes a JSONObject of a whole graph and returns a list of Nodes representing the same graph
     * @param jsonGraph - The full JSONObject generated from the graph's json file
     * @return - return a list of nodes representing the graph
     */
    public static ArrayList<Node> makeNodeGraph(JSONObject jsonGraph){
        ArrayList<Node> nodeGraph = new ArrayList<>();

        JSONArray vertices = jsonGraph.getJSONArray("vertices");

        for (int i = 0; i < vertices.length() ; i++){
            JSONObject vertex = vertices.getJSONObject(i);

            Node node = makeNode(vertex);

            nodeGraph.add(node);
        }
        // smtBuilder.printGraph(nodeGraph, "substring", "BEFORE PROCESS");
        processNodes(nodeGraph);
        // smtBuilder.printGraph(nodeGraph, "substring", "AFTER PROCESS");
        return nodeGraph;
    }

    /**
     * Generates a Node from a JSONObject that corresponds to a vertex in vertices of the JSON graph
     * @param vertex - the JSONObject representing a node of the graph to turned into a Node
     * @return - Returns a Node that represents a node of the graph
     */
    private static Node makeNode(JSONObject vertex){ //
        int id = vertex.getInt("id");
        String actualVal = vertex.getString("actualValue");
        String val = vertex.getString("value");
        // Boolean print = val.contains("substring") ? true : false;
        JSONArray incoming = vertex.getJSONArray("incomingEdges");
        ArrayList<Node> children = new ArrayList<>();
        // ArrayList<Integer> childrenPointers = new ArrayList<>();
        // if (print) System.out.println("Incoming edges: " + incoming.toString() + " for node " + id);
        for (int j = 0; j < incoming.length() ; j++){
            JSONObject source = incoming.getJSONObject(j);
            // if (print) System.out.println("Source Object: " + source.toString());
            int source_id = source.getInt("source");
            String type = source.getString("type");
            // if (print) System.out.println("Source: " + source_id + " Type: " + type);
            children.add(new Node(source_id, type)); //not sure if we really need type, would only be for ordering-> we do indeed need it for ordering
        }

        return new Node(id, val, actualVal, children);

    }

    /**
     * Nodes need to be processed because they contain skeletons of children and no parents when first parsed and made.
     * This goes through and adds the proper children Nodes to each Node, as well as setting the parent.
     * @param nodes - list of initial nodes to take and process into proper representations
     * @return - return an array list the more accuracately/correctly/fully represents the graph
     */
    private static void processNodes(ArrayList<Node> nodes){
        for (Node node : nodes){
            if (node.children != null){
                // if (node.val.contains("substring")) System.out.println("Node " + node.id + " OLD children: " + node.children.toString());
                ArrayList<Node> realChildren = new ArrayList<>();
                if (node.children.size() > 2) smtBuilder.printGraph(node.children, null, "BEFORE CHILDREN PROCESS");
                for (Node pseudo : node.children) {
                    Node real = getNode(pseudo.id, nodes);
                    real.parent = node;
                    real.paramType = pseudo.paramType;
                    realChildren.add(real);
                }
                node.children = realChildren;
                if (node.children.size() > 2) smtBuilder.printGraph(node.children, null, "AFTER CHILDREN PROCESS");
                // if (node.val.contains("substring")) System.out.println("Node " + node.id + " NEW children: " + node.children.toString());
            }
        }
    }
    
    /**
     * Simply returns the node from the node list that corresponds to the provided id
     * @param id - the id of the node to find
     * @param nodes - the list to search in
     * @return - the node that corresponds to that id in the provided list
     */
    private static Node getNode(int id, ArrayList<Node> nodes){
        Node ret = null;
        for (Node node : nodes) {
            if (node.id == id) ret = node;
        }
        return ret;

    }
    
}
