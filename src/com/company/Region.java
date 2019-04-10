package com.company;

public class Region {

    private String name;
    private String sublevel;
    private String id;
    private int population2013;
    private int population2014;
    private int population2015;
    private int population2016;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSublevel() {
        return sublevel;
    }

    public void setSublevel(String sublevel) {
        this.sublevel = sublevel;
    }

    public int getPopulation2013() {
        return population2013;
    }

    public void setPopulation2013(int population2013) {
        this.population2013 = population2013;
    }

    public int getPopulation2014() {
        return population2014;
    }

    public void setPopulation2014(int population2014) {
        this.population2014 = population2014;
    }

    public int getPopulation2015() {
        return population2015;
    }

    public void setPopulation2015(int population2015) {
        this.population2015 = population2015;
    }

    public int getPopulation2016() {
        return population2016;
    }

    public void setPopulation2016(int population2016) {
        this.population2016 = population2016;
    }

    public Region(String name, String sublevel, String id, int population2013,
                  int population2014, int population2015, int population2016) {
        this.name = name;
        this.sublevel = sublevel;
        this.id = id;
        this.population2013 = population2013;
        this.population2014 = population2014;
        this.population2015 = population2015;
        this.population2016 = population2016;
        if (population2016 - population2013 > 0)
        this.status = "increase";
        else this.status = "decrease";
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", sublevel='" + sublevel + '\'' +
                ", population2013=" + population2013 +
                ", population2014=" + population2014 +
                ", population2015=" + population2015 +
                ", population2016=" + population2016 +
                '}';
    }
}
