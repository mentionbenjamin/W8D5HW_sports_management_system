package models;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager {

    //    private Manager manager;
    private int id;
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Manager(){}



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



//    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
//    public List<Player> getPlayers(){
//        return this.players;
//    }
//    public void setPlayers(List<Player> players){
//        this.players = players;
//    }

}
