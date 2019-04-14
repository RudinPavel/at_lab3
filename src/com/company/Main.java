package com.company;



public class Main {

    public static void main(String[] args) {

        try {
            Parser p = new Parser();
            p.saveToListFromFile("DataUSACart.csv"); // записать в List значения из .csv
            System.out.println(p.returnStringRegionWithGreatestDifferenceAmongAllRegions()); // вывести регион с максимальным изм.
            System.out.println(p.returnStringRegionWithSmallestDifferenceAmongAllRegions()); // вывести регион с минимальным изменением
            System.out.println(p.returnRegionsWithGreatestDifference(5)); // вывести 5 регионов с максимальным изменением
            System.out.println(p.makeSimpleForcast()); // прогноз для КАЖДОГО региона
            System.out.println(p.getMyRegions().size()); // в программе хранится список Регионов
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("End with parse");
        }

        try {
            //System.out.println(Integer.MAX_VALUE); // 2 147 483 647
            CollectionComparator myComparator = new CollectionComparator();

            myComparator.createMyCollections();
            myComparator.createMyMaps();

            myComparator.fillCollections(Integer.MAX_VALUE/2222);
            // myComparator.fillMaps();

            myComparator.addToCollections("hello", Integer.MAX_VALUE/5555);
            myComparator.addToCollections(22, Integer.MAX_VALUE/5555);

            myComparator.deleteFromCollections(22);
            myComparator.deleteFromCollections(24);
            //myComparator.deleteFromCollections("hello"); // Рушится
            // myComparator.deleteFromMaps();


        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("End with compare");
        }

        try {
            MyTree myTree = new MyTree();

            MyNode myNode3 = new MyNode(7, "8", null, null);
            ;
            MyNode myNode4 = new MyNode(9, "10", null, null);
            ;

            MyNode myNode1 = new MyNode(3, "4", myNode3, myNode4);
            MyNode myNode2 = new MyNode(5, "6", null, null);
            MyNode myNode0 = new MyNode(1, "2", myNode1, myNode2);

            myTree.setRoot(myNode0);
            myTree.printTree(myTree.getRoot());
            System.out.println(myTree.countNodes(myTree.getRoot()) + " nodes in Tree");
            System.out.println(myTree.countLeaves(myTree.getRoot()) + " leaves in Tree");
            myTree.visitAll(myTree.getRoot());
            myTree.printVisitedTree(myTree.getRoot());
            myTree.removeVisitedFromAll(myTree.getRoot());
            myTree.printNotVisitedTree(myTree.getRoot());

            /*
            MyNode mock = new MyNode(-1, "-1", null, null);
            myTree.addNode(myTree.getRoot(), mock);
            myTree.addNode(myTree.getRoot(), mock);
            myTree.addNode(myTree.getRoot(), mock);
            myTree.addNode(myTree.getRoot(), mock);

            myTree.printTree(myTree.getRoot());
            */
            //System.out.println(mt.countLeaves(null));
            //m.setLeftChild(new MyNode());
            //System.out.println(m.isLeaf());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("End with tree");
        }
    }
}
