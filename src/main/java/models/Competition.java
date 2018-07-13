package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "competitions")
public class Competition {

    private int id;
    private String title;
    private Team team;

    public Competition(int id, String title){
        this.id = id;
        this.title = title;
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

}
