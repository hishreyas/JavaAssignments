package com.company.weekFive;

import java.util.Scanner;

class Continent{
    private String continent;
    public Continent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}

class Country extends Continent
{
    private String country;
    public Country(String continent,String country) {
        super(continent);
        this.country=country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

class State extends Country
{
    private String state;
    private String place;
    public State(String continent, String country,String state,String place) {
        super(continent, country);
        this.state=state;
        this.place=place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlace() {
        return place;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "State :" +state+ "\tPlace:" + place+ "\tCountry:"+getCountry()+"\tContinent:"+getContinent()+"";
    }
}

public class MultiLevel {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Continent Country State Place");
        State state=new State(sc.next(),sc.next(),sc.next(),sc.next());
        System.out.println(state);
    }
}
