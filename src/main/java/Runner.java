import db.*;
import javafx.geometry.Pos;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String [] args){


        Team codeClan = new Team("Code Clan");
        DBHelper.save(codeClan);
        Team northCoders = new Team("North Coders");
        DBHelper.save(northCoders);

        Manager carter = new Manager("Coach Carter", 125000.00, codeClan);
        DBHelper.save(carter);
        Manager kloppo = new Manager("Coach Kloppo", 150000.00, codeClan);
        DBHelper.save(kloppo);

        Player player1 = new Player("Jeremy", 50000.00, 24, PositionType.STRIKER, carter, codeClan);
        DBHelper.save(player1);
        Player player2 = new Player("Joe", 60000.00, 21, PositionType.ATTACKINGMIDFIELD, carter, codeClan);
        DBHelper.save(player2);
        Player player3 = new Player("Jake", 95000.00, 28, PositionType.GOALKEEPER, kloppo, northCoders);
        DBHelper.save(player3);
        Player player4 = new Player("Jamie", 75000.00, 32, PositionType.RIGHTBACK, kloppo, northCoders);
        DBHelper.save(player4);

        Competition championsLeague = new Competition("Champions League");
        DBHelper.save(championsLeague);
        Competition europaLeague = new Competition("Europa League");
        DBHelper.save(europaLeague);


        // --- FUNNER QUERIES BELOW --- //


        // FIND ALL
        List<Team> teams = DBHelper.getAll(Team.class);
        List<Player> players = DBHelper.getAll(Player.class);
        List<Manager> managers = DBHelper.getAll(Manager.class);
        List<Competition> competitions = DBHelper.getAll(Competition.class);

        // FIND BY ID
        Player foundPlayer = DBHelper.find(Player.class, player1.getId());

        // ADD TEAM TO SPECIFIC COMPETITION
        DBTeam.addTeamToCompetition(codeClan, championsLeague);
        DBTeam.addTeamToCompetition(northCoders, championsLeague);

        // FIND AND LIST ALL TEAMS IN SPECIFIC COMPETITION
        List<Team> foundTeamsInCompetition = DBCompetition.getTeamsInCompetition(championsLeague);

        // LIST PLAYERS IN AGE ASCENDING ORDER
        List<Player> playersByAgeAscending = DBPlayer.orderByAge();

        // FIND AVERAGE PLAYERS AGE
        double averageAgePlayer = DBPlayer.getAverageAge();


    }

}