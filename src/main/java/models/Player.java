package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends Employee {

    private Manager manager;
    private Team team;


    public Player(String name, double salary, Manager manager, Team team) {
        super(name, salary);
        this.manager = manager;
        this.team = team;
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



    @OneToOne(mappedBy = "player", fetch = FetchType.LAZY)
    public Team getTeam(){
        return this.team;
    }
    public void setTeam(Team team){
        this.team = team;
    }



}
