package edu.boisestate.cs.utils;

import java.util.ArrayList;
import java.util.HashMap;

/* 
    * Node class representing a node for the resulting data flow graph representation
    * This is essentially analogous to a given terminal and the incoming edges of children
    * and the parent are figured out based on the parse trees structure
    */   
    public class Node{ // arrtibutes could/should be private
        public Integer id;
        public String val;
        public Node parent;
        public String actualVal;
        public HashMap<Node, String> childrenType = new HashMap<>(); // children are a Node and source parameter type pair e.g. t, s1, s2
        public ArrayList<Node> children = new ArrayList<>();

        //constructor
        public Node(Integer id, String val, String actualVal, Node parent){
            this.id = id;
            this.val = val;
            this.parent = parent;
            this.actualVal = actualVal;
        }

        // // psuedo constructor as child place holder
        public Node(Integer source_id){
            this.id = source_id;
        }

        // pseudo constructor without parent
        public Node(Integer id, String val, String actualVal, HashMap<Node, String> childrenType, ArrayList<Node> children){
            this.id = id;
            this.val = val;
            this.actualVal = actualVal;
            this.childrenType = childrenType;
            this.children = children;
        }

        //This is not used anymore, but it creates a deep copy of the node with an id offset for it and its children
        // public Node(Node node, int offset){
        //     this.id = node.id + offset;
        //     this.val = node.val;
        //     this.actualVal = node.actualVal;
        //     ArrayList<Node> copyChildren = new ArrayList<>();
        //     for (Node childNode: node.children){
        //         Node copyChild = new Node(childNode, offset);
        //         copyChildren.add(copyChild);
        //     }
        //     this.children = copyChildren;
        // }

        //create a copy of a node
        public Node(Node node){
            this.id = node.id;
            this.val = node.val;
            this.actualVal = node.actualVal;
            this.children = node.children;
        }

        //adds a child node to the children map
//        public void addChildType(Node node, String type) {
//            childrenType.put(node, type);
//        }

        public void addChild(Node node) {
            children.add(node);
        }

        //setID, right now Node attributes are public but they probably shouldnt be 
        public void setID(int num){
            this.id = num;
        }

        @Override
        public String toString(){
            String cStr = "";
            for (Node child : children){
                cStr += " childid: " + child.id + " type: " + childrenType.get(child) + " val: " + child.val;
            }
            return "ID: " + id + " value: " + val + " Children: " + cStr; 
        }

    }
