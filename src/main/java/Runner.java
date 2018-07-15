import db.*;
import javafx.geometry.Pos;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String [] args){

        // TEAMS
        Team codeClan = new Team("Code Clan", 10);
        DBHelper.save(codeClan);
        Team northCoders = new Team("North Coders", 15);
        DBHelper.save(northCoders);

        // MANAGERS
        Manager carter = new Manager("Coach Carter", 125000.00, codeClan);
        DBHelper.save(carter);
        Manager kloppo = new Manager("Coach Kloppo", 150000.00, northCoders);
        DBHelper.save(kloppo);

        // PLAYERS
        Player player1 = new Player("Jeremy", 50000.00, 24, PositionType.STRIKER, carter, codeClan, 8.6);
        DBHelper.save(player1);
        Player player2 = new Player("Joe", 60000.00, 21, PositionType.ATTACKINGMIDFIELD, carter, codeClan, 6.5);
        DBHelper.save(player2);
        Player player3 = new Player("Jake", 95000.00, 28, PositionType.GOALKEEPER, kloppo, northCoders, 7.9);
        DBHelper.save(player3);
        Player player4 = new Player("Jamie", 75000.00, 32, PositionType.RIGHTBACK, kloppo, northCoders, 6.2);
        DBHelper.save(player4);

        // COMPETITIONS
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
        List<Player> playersInAgeAscendingOrder = DBPlayer.orderByAge();


        // FIND PLAYERS AVERAGE AGE
        double averageAgePlayer = DBPlayer.getAverageAge();


        // GET PLAYERS FOR MANAGER
        List<Player> playersForManager = DBManager.getPlayersForManager(kloppo);




//        // GET PLAYERS MANAGER
//        Manager managerForPlayers = DBPlayer.getPlayersManager(player1);



    }

}