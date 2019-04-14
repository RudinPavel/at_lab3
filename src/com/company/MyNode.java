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

    public static void main(String[] args){
        MyTree mt = new MyTree();

        MyNode mn3 = new MyNode(7, "8", null, null);;
        MyNode mn4 = new MyNode(9, "10", null, null);;

        MyNode mn1 = new MyNode(3, "4", mn3, mn4);
        MyNode mn2 = new MyNode(5, "6", null, null);
        MyNode mn = new MyNode(1,"2", mn1, mn2);

        mt.setRoot(mn);
        mt.printTree(mt.getRoot());
        System.out.println(mt.countNodes(mt.getRoot()));
        System.out.println(mt.countLeaves(mt.getRoot()));
        //m.setLeftChild(new MyNode());
        //System.out.println(m.isLeaf());
    }
}
