package models;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class Team {

    private int id;
    private String name;

    public Team(String name){
        this.name = name;
    }

    public Team(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }


    @Column(name = "name")
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }



}
