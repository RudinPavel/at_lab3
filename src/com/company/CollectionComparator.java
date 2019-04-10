package com.company;

import java.util.Collection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionComparator {

    public static Random rnd = new Random();

    public static void main(String[] args) {
        // Бенчамарк по работе коллекций

        // Vector v = new Vector(); // почему так можно???
        // Stack s = new Stack();

        Vector<Integer> myStack = new Stack<>();
        Vector<Integer> myVector = new Vector<>();

        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();

        Set<Integer> myTreeSet = new TreeSet<>();
        Set<Integer> myHashSet = new HashSet<>();
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();

        Queue<Integer> myArrayDeque = new ArrayDeque<>();
        Queue<Integer> myPriorityQueue = new PriorityQueue<>();

        Map<Integer, Character> myHashMap = new HashMap<>();
        Map<Integer, Character> myTreeMap = new TreeMap<>();
        Map<Integer, Character> myLinkedHashMap = new LinkedHashMap<>();


        fillCollection(myVector);
        fillCollection(myStack);
        fillCollection(myArrayList);
        fillCollection(myLinkedList);
        fillCollection(myHashSet);
        fillCollection(myLinkedHashSet);
        fillCollection(myTreeSet);
        fillCollection(myArrayDeque);
        fillCollection(myPriorityQueue);

        fillMap(myHashMap);
        fillMap(myLinkedHashMap);
        fillMap(myTreeMap);

        addToCollection(myVector, 10);
        addToCollection(myStack, 10);
        addToCollection(myArrayList, 10);
        addToCollection(myLinkedList, 10);
        addToCollection(myHashSet, 10);
        addToCollection(myLinkedHashSet,10);
        addToCollection(myTreeSet, 10);
        addToCollection(myArrayDeque, 10);
        addToCollection(myPriorityQueue, 10);

        deleteFromCollection(myVector, 10);
        deleteFromCollection(myStack, 10);


        //Map(myHashMap);
        //fillMap(myLinkedHashMap);
        //fillMap(myTreeMap);

        /*
        System.out.println("Stack :");
        System.out.println(myStack);

        System.out.println("Vector :");
        System.out.println(myVector);

        System.out.println("Hash Set :");
        System.out.println(myHashSet);

        System.out.println("Tree Set :");
        System.out.println(myTreeSet);

        System.out.println("Linked Hash Set:");
        System.out.println(myLinkedHashSet);


        System.out.println("Array List :");
        System.out.println(myArrayList);

        System.out.println("Linked List :");
        System.out.println(myLinkedList);

        System.out.println("Array Queue :");
        System.out.println(myArrayDeque);

        System.out.println("Priority Queue:");
        System.out.println(myPriorityQueue);

        System.out.println("Hash Map :");
        System.out.println(myHashMap);

        System.out.println("Linked Hash Map :");
        System.out.println(myLinkedHashMap);

        System.out.println("My Tree Map:");
        System.out.println(myTreeMap);
        */
    }

    public static void addToCollection(Collection<Integer> c, int e){
        long start_ms = System.currentTimeMillis();
        c.add(e);
        System.out.println("Adding spent time  : " + (System.currentTimeMillis() - start_ms) +" ms");
    }

    public static void deleteFromCollection(Collection<Integer> c, int e){
        long start_ms = System.currentTimeMillis();
        c.remove(e);
        System.out.println("Delete spent time  : " + (System.currentTimeMillis() - start_ms) +" ms");
    }

    public static void fillCollection(Collection<Integer> c) {
        long start_ms = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            c.add(rnd.nextInt(100));
        System.out.println("Filling spent time  : " + (System.currentTimeMillis() - start_ms) +" ms");
    }

    public static void fillMap(Map<Integer, Character> m){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++)
            m.put(i, alphabet.charAt(i));
    }
}
/*
    public static void fillList(List<Integer> l){
        for (int i = 0; i < 1000; i++)
            l.add(rnd.nextInt(100));
    }

    public static void fillQueue(Queue<Integer> q){
        for (int i = 0; i < 1000; i++)
            q.add(rnd.nextInt(100));
    }

    public static void fillSet(Set<Integer> s){
        for (int i = 0; i < 1000; i++)
            s.add(rnd.nextInt(100));
    }

    public static void fillMap(List<Integer> l){

    }

    public static void fillVector(Vector<Integer> v){
        for (int i = 0; i < 1000; i++)
            v.add(rnd.nextInt(100));
    }

        fillVector(myVector);
        fillVector(myStack);

        fillSet(myTreeSet);
        fillSet(myHashSet);
        fillSet(myLinkedHashSet);

        fillList(myArrayList);
        fillList(myLinkedList);

        fillQueue(myArrayDeque);
        fillQueue(myPriorityQueue);
 */