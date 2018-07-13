package models;

public abstract class Team {

    private String name;
    private double salary;

    public Team(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

}
