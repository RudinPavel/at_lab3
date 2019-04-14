package com.company;

public class MyNode {

    private int key;
    private String value;

    public MyNode(int key, String value, MyNode leftChild, MyNode rightChild) {
        this.key = key;
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    private MyNode leftChild;
    private MyNode rightChild;

    private boolean isVisited = false;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MyNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MyNode leftChild) {
        this.leftChild = leftChild;
    }

    public MyNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(MyNode rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeaf(){
        return (leftChild == null && rightChild == null);
    }

    public void printNode(){
        System.out.println(this.key + " " + this.value);
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
