package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player extends Team {

    private Manager manager;

    public Player(String name, double salary, Manager manager){
        super(name, salary);
        this.manager = manager;
    }

    public Player(){}


    @Column(name = "manager")
    private Manager getManager(){
        return this.manager;
    }
    private void setManager(Manager manager){
        this.manager = manager;
    }


}
