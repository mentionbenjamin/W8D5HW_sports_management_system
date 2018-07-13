package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Team {

    private double budget;
    private List<Player> players;

    public Manager(String name, double salary, double budget){
        super(name, salary);
        this.budget = budget;
        this.players = new ArrayList<Player>();
    }

    public Manager(){}


    @Column(name = "budget")
    public double getBudget(){
        return this.budget;
    }
    public void setBudget(double budget){
        this.budget = budget;
    }


    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Player> getPlayers(){
        return this.players;
    }
    public void setPlayers(List<Player> players){
        this.players = players;
    }

}
