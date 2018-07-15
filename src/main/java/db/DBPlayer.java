package db;

import models.Manager;
import models.Player;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBPlayer {


    private static Session session;
    private static Transaction transaction;


    public static List<Player> orderByAge(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Player> players = null;
        try {
            Criteria cr = session.createCriteria(Player.class);
            cr.addOrder(Order.asc("age"));
            players = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return players;
    }



    public static Double getAverageAge(){
        session = HibernateUtil.getSessionFactory().openSession();
        Double average = null;
        try {
            transaction = session.beginTransaction();
            Criteria cr = session.createCriteria(Player.class);
            cr.setProjection(Projections.avg("age"));
            average = (Double)cr.uniqueResult();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return average;
    }



//    public static Manager getPlayersManager(Player player){
//        session = HibernateUtil.getSessionFactory().openSession();
//        Manager manager = null;
//        try {
//            transaction = session.beginTransaction();
//            Criteria cr = session.createCriteria(Manager.class);
//            cr.add(Restrictions.eq("team", player.getTeam()));
//            manager = (Manager)cr.uniqueResult();
//        } catch (HibernateException e) {
//            transaction.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return manager;
//    }


}
