/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import hibernate.*;
import pojo.*;
import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.*;

/**
 *
 * @author unai
 */
@ManagedBean
@RequestScoped
public class HibernateTest {
    Session session = null;
    List a = null;
    Espezialitatea b;

    public HibernateTest(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.b = new Espezialitatea("Mota2");
        inprimatu();
    }
    
     public void inprimatu() {
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
        
    }

    public List getA() {
        return a;
    }

    
}
