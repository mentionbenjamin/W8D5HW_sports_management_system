import db.DBHelper;
import db.DBManager;
import models.Manager;
import models.Player;
import models.Team;

import java.util.List;

public class Runner {

    public static void main(String [] args){


        Team codeClan = new Team("CodeClan");
        DBHelper.save(codeClan);
        Team northCoders = new Team("North Coders");
        DBHelper.save(northCoders);


        Manager carter = new Manager("Coach Carter", 125000.00, codeClan);
        DBHelper.save(carter);
        Manager kloppo = new Manager("Coach Kloppo", 150000.00, codeClan);
        DBHelper.save(kloppo);


        Player player1 = new Player("Ben", 50000.00, carter, codeClan);
        DBHelper.save(player1);
        Player player2 = new Player("John", 60000.00, carter, codeClan);
        DBHelper.save(player2);
        Player player3 = new Player("Jarrod", 70000.00, kloppo, northCoders);
        DBHelper.save(player3);
        Player player4 = new Player("Jarrod", 70000.00, kloppo, northCoders);
        DBHelper.save(player4);


        List<Team> teams = DBHelper.getAll(Team.class);
        List<Player> players = DBHelper.getAll(Player.class);
        List<Manager> managers = DBHelper.getAll(Manager.class);




//        manager.addPlayers(player1);

//        List<Player> playersForManager = DBManager.getPlayersForManager(manager);


    }

}