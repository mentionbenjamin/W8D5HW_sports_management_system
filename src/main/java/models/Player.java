package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

//    private Manager manager;
    private int id;
    private String name;
    private double salary;

    public Player(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Player(){}



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
    public void setSalary(int salary){
        this.salary = salary;
    }

//    @ManyToOne
//    @JoinColumn(name = "manager_id", nullable = false)
//    private Manager getManager(){
//        return this.manager;
//    }
//    private void setManager(Manager manager){
//        this.manager = manager;
//    }


}
