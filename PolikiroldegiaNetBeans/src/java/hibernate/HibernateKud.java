/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import hibernate.*;
import pojo.*;
import java.util.*;
import org.hibernate.*;

/**
 * Tengo que mirar para que sirve el saverorupdate y los demas metodos que tiene session
 * @author Unai
 */
public class HibernateKud {

    Session session = null;
    private static HibernateKud instance = new HibernateKud();

    private HibernateKud() {
        this.conOpen();
    }

    public static HibernateKud getInstance() {
        return instance;
    }

    private void conOpen() {
        this.session = HibernateUtil.getSessionFactory().openSession();
        /*.getCurrentSession();*/
    }

    public void conClose() {
        session.close();
    }

    public List execHQL(String HQL) {
        org.hibernate.Transaction tx = null;
        Query q = null;
        try {
            tx = session.beginTransaction();
            q = session.createQuery(HQL);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        return q.list();

    }

    /*
     * Este no se si funciona
     */
    public List execCriteria(String klasea) {
        org.hibernate.Transaction tx = null;
        Criteria crit = null;
        try {
            tx = session.beginTransaction();
            crit = session.createCriteria(klasea + ".class");
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        return crit.list();
    }

    public List execSQL(String query) {
        try {
            SQLQuery emaitza = session.createSQLQuery(query);
            return emaitza.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Metodo honi objektu baten instantzia pasatzean, datu basean gordetzen du.
     * 
     * @param o Gorde nahi duzun objektuaren instantzia
     * @return true: Dena ondo joan bada || false: errorerik egon bada
     */
    public boolean gorde(Object o) {
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
            return false;
        }
    }


    /*public void inprimatu() {
    org.hibernate.Transaction tx = null;
    try {
    tx = session.beginTransaction();
    Query q = session.createQuery("from Bezeroa"); // Esto devuelve una lista de todos los bezero
    session.save(b); // Esto guarda la tarifa en la base de datos
    a = q.list();
    tx.commit();
    } catch (Exception e) {
    e.printStackTrace();
    tx.rollback();
    }
    
    }*/
    public Session getSession() {
        return session;
    }
}
