package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
    /*
    * Как вариант - в прилагаемом файле посчитайте изменения численности населения,
    * выделите топ 5 регионов и с учетом среднего ежегодного изменения сделайте прогноз
    * */
    private List<Region> myRegions = new ArrayList<>();

    public List<Region> getMyRegions() {
        return myRegions;
    }

    public void setMyRegions(List<Region> myRegions) {
        this.myRegions = myRegions;
    }

    public static String testConnection(String path) throws IOException {
        String result = "";
        File myFile = new File(path);
        Scanner cin = new Scanner(myFile);
        while (cin.hasNext()){
            System.out.println(cin.nextLine());
        }
        return result;
    }

    public void saveToListFromFile(String path) throws IOException{
        File myFile = new File(path);
        Scanner cin = new Scanner(myFile);
        cin.nextLine(); // ignore first row
        while (cin.hasNext()){
            String current = cin.nextLine();
            Region myRegion = createConcreteRegion(current);
            myRegions.add(myRegion);
        }
    }

    private static Region createConcreteRegion(String current){
        String[] fields = current.split(",");
        String name = fields[0] + fields[1];
        String sublevel = fields[2];
        String id = fields[3];
        int population2013 = Integer.parseInt(fields[4]);
        int population2014 = Integer.parseInt(fields[5]);
        int population2015 = Integer.parseInt(fields[6]);
        int population2016 = Integer.parseInt(fields[7]);
        Region myRegion = new Region(name,sublevel,id,population2013,population2014,population2015,population2016);
        return myRegion;
    }

    public String returnStringRegionWithGreatestDifferenceAmongAllRegions(){
        Region myRegion = findRegionWithGreatestDifferenceAmongAllRegions();
        return myRegion.getName() + " " + myRegion.getStatus() + " " +
                (myRegion.getPopulation2016() - myRegion.getPopulation2013());
    }

   public String returnStringRegionWithSmallestDifferenceAmongAllRegions(){
        Region myRegion = findRegionWithSmallestDifferenceAmongAllRegions();
        return myRegion.getName() + " " + myRegion.getStatus() + " " +
                (myRegion.getPopulation2016() - myRegion.getPopulation2013());
    }

    private Region findRegionWithGreatestDifferenceAmongAllRegions(){
        if (myRegions.isEmpty()) return null;

        Region top = myRegions.get(0);

        int difference = top.getPopulation2016() - top.getPopulation2013();


        for (int i = 1; i < myRegions.size(); i++){
            int nextDifference = myRegions.get(i).getPopulation2016() -
                    myRegions.get(i).getPopulation2013();

         if (Math.abs(nextDifference) > Math.abs(difference)){
             difference = nextDifference;
             top = myRegions.get(i);
            }
        }
        return top;
    }

    private Region findRegionWithSmallestDifferenceAmongAllRegions(){
        if (myRegions.isEmpty()) return null;

        Region top = myRegions.get(0);

        int difference = top.getPopulation2016() - top.getPopulation2013();


        for (int i = 1; i < myRegions.size(); i++){
            int nextDifference = myRegions.get(i).getPopulation2016() -
                    myRegions.get(i).getPopulation2013();

            if (Math.abs(nextDifference) < Math.abs(difference)){
                difference = nextDifference;
                top = myRegions.get(i);
            }
        }
        return top;
    }

    public String returnRegionsWithGreatestDifference(int n){
        List<Region> myRegions = findRegionsWithGreatestDifference(n);
        String result = "";
        for (int i = 0; i < myRegions.size(); i++){
            Region mr = myRegions.get(i);
            result += (i+1) + ". " + mr.getName() + " " + mr.getStatus()+ " " + (mr.getPopulation2016() -
                    mr.getPopulation2013()) + '\n';
        }
        return result;
    }


    private List<Region> findRegionsWithGreatestDifference(int n){
        if (myRegions.isEmpty()) return null;

        List<Region> result = new ArrayList<>();
        Region current;

        for (int j = 0; j < n; j++) {
            current = myRegions.get(0);
            for (int i = 1; i < myRegions.size(); i++) {
                if (result.contains(myRegions.get(i))) continue;
                if (Math.abs(current.getPopulation2016() - current.getPopulation2013()) <
                        Math.abs(myRegions.get(i).getPopulation2016() -
                                myRegions.get(i).getPopulation2013()))
                    current = myRegions.get(i);
            }
            result.add(current);
        }
        return result;
    }


    public String makeSimpleForcast(){
        String result = "";
        for (int i = 0; i < myRegions.size(); i++)
        {
            Region r = myRegions.get(i);
            result += (i+1) + ". ";
            if (r.getPopulation2016() - r.getPopulation2013() > 0)
                result += "increase ";
            else result += "decrease ";
            result += r.toString() + "\n";
        }
        return result;
    }
}
