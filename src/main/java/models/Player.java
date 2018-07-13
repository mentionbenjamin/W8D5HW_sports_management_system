package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends Employee {

//    private Manager manager;


    public Player(String name, double salary) {
        super(name, salary);
    }

    public Player(){}



//    @ManyToOne
//    @JoinColumn(name = "manager_id", nullable = false)
//    private Manager getManager(){
//        return this.manager;
//    }
//    private void setManager(Manager manager){
//        this.manager = manager;
//    }


}
