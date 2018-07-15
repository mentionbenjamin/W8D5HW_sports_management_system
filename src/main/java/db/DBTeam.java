package db;

import models.Competition;
import models.Team;

public class DBTeam {


    public static void addTeamToCompetition(Team team, Competition competition){
        team.addCompetition(competition);
        competition.addTeam(team);
        DBHelper.update(team);
    }

}
