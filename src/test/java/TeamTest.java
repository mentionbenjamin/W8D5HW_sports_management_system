import db.DBHelper;
import models.Manager;
import models.Player;
import models.PositionType;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TeamTest {

    Team codeClan;
    Team northCoders;
    Manager carter;
    Manager kloppo;
    Player player1;
    Player player2;
    Player player3;
    Player player4;

    @Before
    public void setUp(){
        codeClan = new Team("Code Clan");
        northCoders = new Team("North Coders");
        carter = new Manager("Coach Carter", 125000.00, codeClan);
        kloppo = new Manager("Coach Kloppo", 150000.00, northCoders);
        player1 = new Player("Jeremy", 50000.00, 24, PositionType.STRIKER, carter, codeClan);
        player2 = new Player("Joe", 60000.00, 21, PositionType.ATTACKINGMIDFIELD, carter, codeClan);
        player3 = new Player("Jake", 95000.00, 28, PositionType.GOALKEEPER, kloppo, northCoders);
        player4 = new Player("Jamie", 75000.00, 32, PositionType.RIGHTBACK, kloppo, northCoders);
    }


    @Test
    public void getName(){
        assertEquals("Code Clan", codeClan.getName());
    }
    @Test
    public void setName(){
        codeClan.setName("James");
        assertEquals("James", codeClan.getName());
    }



}
