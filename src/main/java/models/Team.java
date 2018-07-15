package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private int points;
    private Manager manager;
    private List<Player> players;
    private List<Competition> competitions;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
        this.competitions = new ArrayList<Competition>();
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



    @Column(name = "points")
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }



    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    public List<Player> getPlayers(){
        return this.players;
    }
    public void setPlayers(List<Player> players){
        this.players = players;
    }



    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "teams_competitions",
                joinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)},
                inverseJoinColumns = {@JoinColumn(name = "competition_id", nullable = false, updatable = false)})
    public List<Competition> getCompetitions() {
        return competitions;
    }
    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }



    public void addCompetition(Competition competition) {
        this.competitions.add(competition);
    }
}