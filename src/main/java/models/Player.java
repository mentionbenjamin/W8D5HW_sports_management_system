package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends Team {

    private Manager manager;

    public Player(String name, double salary, Manager manager){
        super(name, salary);
        this.manager = manager;
    }

    public Player(){}


    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    private Manager getManager(){
        return this.manager;
    }
    private void setManager(Manager manager){
        this.manager = manager;
    }


}
