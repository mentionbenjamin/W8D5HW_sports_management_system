package models;

public class Manager extends Team {

    private double budget;

    public Manager(String name, double salary, double budget){
        super(name, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
    public void setBudget(double budget){
        this.budget = budget;
    }

}
