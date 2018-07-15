package db;

import models.Player;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

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


}
