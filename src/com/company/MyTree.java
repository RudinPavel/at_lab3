package com.company;

public class MyTree {

    public MyNode getRoot() {
        return root;
    }

    public void setRoot(MyNode root) {
        this.root = root;
    }

    private MyNode root;

    public int countLeaves(MyNode current){ // leaf, but leaves
        //if (countNodes(root) == 0 || root == null) return 0;
        if (current.isLeaf()){
            return 1;
        }
        return countLeaves(current.getLeftChild()) + countLeaves(current.getRightChild());
    }

    public void printTree(MyNode current){
        if (current == null){
            return;
        }
        current.printNode();
        printTree(current.getLeftChild());
        printTree(current.getRightChild());
    }

    public int countNodes(MyNode current){
        if (current == null){
            return 0;
        }
        return 1 + countNodes(current.getLeftChild()) + countNodes(current.getRightChild());
    }

    public void addNode(MyNode m){
        if (root == null)
            root = m;
        //else
    }

    public void visitAll(MyNode current){

    }

    public void removeVisitedFromAll(MyNode current){

    }
}
