package models;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "competitions")
public class Competition {

    private int id;
    private String title;
    private List<Team> teams;

    public Competition(String title){
        this.title = title;
        this.teams = new ArrayList<Team>();
    }

    public Competition(){}



    @Id
    @Column(name = "id")
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }



    @Column(name = "title")
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }



    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "teams_competitions",
                joinColumns = {@JoinColumn(name = "competition_id", nullable = false, updatable = false)},
                inverseJoinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)})
    public List<Team> getTeam() {
        return teams;
    }
    public void setTeam(List<Team> team) {
        this.teams = team;
    }



    public void addTeam(Team team) {
        this.teams.add(team);
    }
}
