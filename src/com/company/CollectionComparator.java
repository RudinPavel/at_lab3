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

    // Бенчамарк по работе коллекций

    private Vector<Object> myStack = new Stack<>();
    private Vector<Object> myVector = new Vector<>();

    private List<Object> myArrayList = new ArrayList<>();
    private List<Object> myLinkedList = new LinkedList<>();

    private Set<Object> myTreeSet = new TreeSet<>();
    private Set<Object> myHashSet = new HashSet<>();
    private Set<Object> myLinkedHashSet = new LinkedHashSet<>();

    private Queue<Object> myArrayDeque = new ArrayDeque<>();
    private Queue<Object> myPriorityQueue = new PriorityQueue<>();

    private Map<Object, Object> myHashMap = new HashMap<>();
    private Map<Object, Object> myTreeMap = new TreeMap<>();
    private Map<Object, Object> myLinkedHashMap = new LinkedHashMap<>();

    private List<Collection<Object>> myCollections = new ArrayList<>();
    private List<Map<Object, Object>> myMaps = new ArrayList<>();


    private Random rnd = new Random();

    public void createMyCollections(){

        myCollections.add(myStack);
        myCollections.add(myVector);

        myCollections.add(myArrayList);
        myCollections.add(myLinkedList);

        myCollections.add(myTreeSet);
        myCollections.add(myLinkedHashSet);
        myCollections.add(myHashSet);

        myCollections.add(myArrayDeque);
        myCollections.add(myPriorityQueue);
    }

    public void createMyMaps(){

        myMaps.add(myHashMap);
        myMaps.add(myTreeMap);
        myMaps.add(myLinkedHashMap);
    }

    public void fillCollections(int n) {

        for (int i = 0; i < myCollections.size(); i++){
            System.out.print( (i+1) + ". ");
            fillCollection(myCollections.get(i), rnd.nextInt(1000), n);
        }
        System.out.println("-----------------------");
    }

   /*
    public static void fillMap(Map<Object, Object> m){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++)
            m.put(i, alphabet.charAt(i));
    }
    */

    public void addToCollections(Object o, int n) {

        for (int i = 0; i < myCollections.size(); i++){
            System.out.print( (i+1) + ". ");
           addToCollection(myCollections.get(i), rnd.nextInt(1000), n);
        }
        System.out.println("-----------------------");
    }

    public void deleteFromCollections(Object o) {

        for (int i = 0; i < myCollections.size(); i++){
            System.out.print( (i+1) + ". ");
            deleteFromCollection(myCollections.get(i), o);
        }
        System.out.println("-----------------------");
    }

    private static String detectName(Collection<Object> o){
        String result = "unknown";

        if (o instanceof Stack) return  "stack";
        if (o instanceof Vector) return "vector";

        if (o instanceof ArrayList) return "array list";
        if (o instanceof LinkedList) return "linked list";

        if (o instanceof TreeSet) return "tree set";
        if (o instanceof LinkedHashSet) return "linked hash set";
        if (o instanceof HashSet) return "hash set";


        if (o instanceof ArrayDeque) return "array dequeue";
        if (o instanceof PriorityQueue) return "priority queue";
        return result;
    }

    private void addToCollection(Collection<Object> c, Object o, int n){
        long start_ms = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            c.add(o);
        System.out.println("Adding to " + detectName(c) + " spent time  : " + (System.currentTimeMillis() - start_ms) +" ms");
    }

    private void deleteFromCollection(Collection<Object> c, Object o){
        long start_ms = System.currentTimeMillis();
        c.remove(o);
        System.out.println("Delete from " + detectName(c) + " spent time  : " + (System.currentTimeMillis() - start_ms) +" ms");
    }

    private void fillCollection(Collection<Object> c, Object o, int n) {
        long start_ms = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            c.add(o);
        System.out.println("Filling " + detectName(c) + " spent time  : " + (System.currentTimeMillis() - start_ms) +" ms");
    }
}














/* неправильный подход, ТИПИЗИРОВАННЫЙ
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
        /*
        fillCollection(myVector);
        fillCollection(myStack);

        fillCollection(myArrayList);
        fillCollection(myLinkedList);

        fillCollection(myHashSet);
        fillCollection(myLinkedHashSet);
        fillCollection(myTreeSet);

        fillCollection(myArrayDeque);
        fillCollection(myPriorityQueue);
         */