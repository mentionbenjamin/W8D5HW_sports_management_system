package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.swing.text.Position;

@Entity
@Table(name = "players")
public class Player extends Employee {

    private int age;
    private PositionType position;
    private Manager manager;
    private Team team;


    public Player(String name, double salary, int age, PositionType position, Manager manager, Team team) {
        super(name, salary);
        this.age = age;
        this.position = position;
        this.manager = manager;
        this.team = team;
    }

    public Player(){}




    @Column(name = "age")
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    @Column(name = "position")
    public PositionType getPosition() {
        return position;
    }
    public void setPosition(PositionType position) {
        this.position = position;
    }



    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager(){
        return this.manager;
    }
    public void setManager(Manager manager){
        this.manager = manager;
    }



    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam(){
        return this.team;
    }
    public void setTeam(Team team){
        this.team = team;
    }



}
