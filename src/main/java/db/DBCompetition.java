package db;

import models.Competition;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCompetition {


    private static Session session;

    public static List<Team> getTeamsInCompetition(Competition competition) {
        List<Team> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.createAlias("competitions", "competition"); // FOR COMPETITION IN COMPETITION FIND ANY TEAMS.
            cr.add(Restrictions.eq("competition.id", competition.getId())); // USING THE ID OF THE COMPETITION INPUT TO SEARCH FOR
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }


}