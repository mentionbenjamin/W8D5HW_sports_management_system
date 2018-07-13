package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private List<Player> players;
    private Team team;

    public Manager(String name, double salary, Team team) {
        super(name, salary);
        this.players = new ArrayList<Player>();
        this.team = team;
    }

    public Manager(){}



    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Player> getPlayers(){
        return this.players;
    }
    public void setPlayers(List<Player> players){
        this.players = players;
    }



//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "manager_id", nullable = false)
//

    @OneToOne
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam(){
        return this.team;
    }
    public void setTeam(Team team){
        this.team = team;
    }


//    public void addPlayers(Player Player){
//        this.players.add(player);
//    }


}
