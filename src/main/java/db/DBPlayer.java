package db;

import models.Player;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import java.util.List;

public class DBPlayer {


    private static Session session;


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


}
