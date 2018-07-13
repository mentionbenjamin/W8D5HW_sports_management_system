import db.DBHelper;
import models.Manager;
import models.Player;

public class Runner {

    public static void main(String [] args){

        Player player1 = new Player("Ben", 50000.00);
        DBHelper.save(player1);

        Player player2 = new Player("John", 60000.00);
        DBHelper.save(player2);

        Player player3 = new Player("Jarrod", 70000.00);
        DBHelper.save(player3);


        Manager manager = new Manager("Coach Carter", 100000.00);
        DBHelper.save(manager);

    }

}