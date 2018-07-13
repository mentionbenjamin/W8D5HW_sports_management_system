package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private List<Player> players;

    public Manager(String name, double salary) {
        super(name, salary);
        this.players = new ArrayList<Player>();
    }

    public Manager(){}


    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Player> getPlayers(){
        return this.players;
    }
    public void setPlayers(List<Player> players){
        this.players = players;
    }


}
