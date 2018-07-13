import db.DBHelper;
import models.Player;
import models.Team;

public class Runner {

    public static void main(String [] args){

        Player player1 = new Player("Ben", 50000.00);
        DBHelper.save(player1);

    }

}