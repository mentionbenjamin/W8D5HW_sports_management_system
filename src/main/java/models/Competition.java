package models;

public class Competition {

    private String title;
    private Team team;

    public Competition(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

}
