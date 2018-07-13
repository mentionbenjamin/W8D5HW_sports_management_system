package models;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    //    private Manager manager;


    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager(){}




//    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
//    public List<Player> getPlayers(){
//        return this.players;
//    }
//    public void setPlayers(List<Player> players){
//        this.players = players;
//    }

}
