package models;

public class Player extends Team {

    private Manager manager;

    public Player(String name, double salary, Manager manager){
        super(name, salary);
        this.manager = manager;
    }

    private Manager getManager(){
        return this.manager;
    }
    private void setManager(Manager manager){
        this.manager = manager;
    }


}
