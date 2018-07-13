import db.DBHelper;
import db.DBManager;
import models.Manager;
import models.Player;
import models.Team;

import java.util.List;

public class Runner {

    public static void main(String [] args){


        Team codeClan = new Team("CodeClan");

        Manager manager = new Manager("Coach Carter", 100000.00, codeClan);
        DBHelper.save(manager);

        Player player1 = new Player("Ben", 50000.00, manager, codeClan);
        DBHelper.save(player1);
        Player player2 = new Player("John", 60000.00, manager, codeClan);
        DBHelper.save(player2);
        Player player3 = new Player("Jarrod", 70000.00, manager, codeClan);
        DBHelper.save(player3);



        List<Player> players = DBHelper.getAll(Player.class);
        List<Team> teams = DBHelper.getAll(Team.class);




//        manager.addPlayers(player1);

//        List<Player> playersForManager = DBManager.getPlayersForManager(manager);


    }

}