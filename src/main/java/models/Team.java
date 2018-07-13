package models;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public abstract class Team {

    private int id;
    private String name;
    private double salary;

    public Team(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public Team(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }


    @Column(name = "name")
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    @Column(name = "salary")
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


}
