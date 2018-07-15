package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends Employee {

    private Position position;
    private Manager manager;
    private Team team;


    public Player(String name, double salary, Position position, Manager manager, Team team) {
        super(name, salary);
        this.position = position;
        this.manager = manager;
        this.team = team;
    }

    public Player(){}



    @Column(name = "position")
    public Position getPosition(){
        return this.position;
    }
    public void setPosition(Position position){
        this.position = position;
    }



    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    private Manager getManager(){
        return this.manager;
    }
    private void setManager(Manager manager){
        this.manager = manager;
    }



    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team getTeam(){
        return this.team;
    }
    private void setTeam(Team team){
        this.team = team;
    }



}
