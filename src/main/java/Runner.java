import db.DBHelper;
import db.DBManager;
import models.Manager;
import models.Player;

import java.util.List;

public class Runner {

    public static void main(String [] args){


        Manager manager = new Manager("Coach Carter", 100000.00);
        DBHelper.save(manager);


        Player player1 = new Player("Ben", 50000.00, manager);
        DBHelper.save(player1);

        Player player2 = new Player("John", 60000.00, manager);
        DBHelper.save(player2);

        Player player3 = new Player("Jarrod", 70000.00, manager);
        DBHelper.save(player3);







//        manager.addPlayers(player1);
//
//        List<Player> playersForManager = DBManager.getPlayersForManager(manager);


    }

}