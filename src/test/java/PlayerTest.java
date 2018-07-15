import db.DBHelper;
import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlayerTest {

    Team codeClan;
    Team northCoders;
    Manager carter;
    Manager kloppo;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Competition championsLeague;
    Competition europaLeague;

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
        championsLeague = new Competition("Champions League");
        europaLeague = new Competition("Europa League");
    }


    @Test
    public void getName(){
        assertEquals("Jeremy", player1.getName());
    }
    @Test
    public void setName(){
        player1.setName("Dave");
        assertEquals("Dave", player1.getName());
    }



}
