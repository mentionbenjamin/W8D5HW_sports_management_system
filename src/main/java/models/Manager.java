package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "managers")
public class Manager extends Team {

    private double budget;

    public Manager(String name, double salary, double budget){
        super(name, salary);
        this.budget = budget;
    }

    public Manager(){}


    @Column(name = "budget")
    public double getBudget(){
        return this.budget;
    }
    public void setBudget(double budget){
        this.budget = budget;
    }

}
