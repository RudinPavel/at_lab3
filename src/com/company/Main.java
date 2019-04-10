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
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");
        }
    }
}
