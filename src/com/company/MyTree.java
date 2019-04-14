package com.company;

import java.util.Random;

public class MyTree {

    private Random rnd = new Random();

    private MyNode root;

    public MyNode getRoot() {
        return root;
    }

    public void setRoot(MyNode root) {
        this.root = root;
    }

    public int countLeaves(MyNode current){ // one leaf, but leaves
        if (current == null)
            return 0;
        if (current.isLeaf())
            return 1;
        return countLeaves(current.getLeftChild()) + countLeaves(current.getRightChild());
    }

    public void printTree(MyNode current){
        if (current == null)
            return;
        current.printNode();
        printTree(current.getLeftChild());
        printTree(current.getRightChild());
    }

    public int countNodes(MyNode current){
        if (current == null)
          return 0;
        return 1 + countNodes(current.getLeftChild()) + countNodes(current.getRightChild());
    }

    public void addNode(MyNode current, MyNode newNode){
        if (current == null){
            current = newNode;
            return;
        }
        if (current.getLeftChild() == null){
            current.setLeftChild(newNode);
            System.out.println("Added to left child");
            return;
        }
        if(current.getRightChild() == null){
            current.setRightChild(newNode);
            System.out.println("Added to right child");
            return;
        }
        if (rnd.nextBoolean())
        {
            addNode(current.getLeftChild(), newNode);
        }
        else addNode(current.getRightChild(), newNode);
    }

    public void visitAll(MyNode current){
        if (current == null)
            return;
        current.setVisited(true);
        visitAll(current.getLeftChild());
        visitAll(current.getRightChild());

    }

    public void removeVisitedFromAll(MyNode current){
        if (current == null)
            return;
        current.setVisited(false);
        removeVisitedFromAll(current.getLeftChild());
        removeVisitedFromAll(current.getRightChild());
    }

    public void printVisitedTree(MyNode current){
        if (current == null)
            return;
        if (current.isVisited())
            current.printNode();
        printVisitedTree(current.getLeftChild());
        printVisitedTree(current.getRightChild());
    }

    public void printNotVisitedTree(MyNode current){
        if (current == null)
            return;
        if (!current.isVisited())
            current.printNode();
        printNotVisitedTree(current.getLeftChild());
        printNotVisitedTree(current.getRightChild());
    }
}
