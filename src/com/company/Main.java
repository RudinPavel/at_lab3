package com.company;


import java.util.Stack;

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
    }
}
