package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private Manager manager;
    private Player player;

    public Team(String name) {
        this.name = name;
    }

    public Team() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager(){
        return this.manager;
    }
    public void setManager(Manager manager){
        this.manager = manager;
    }



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", nullable = false)
    public Player getPlayer(){
        return this.player;
    }
    public void setPlayer(Player player){
        this.player = player;
    }


}