/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojo.Bezeroa;

/**
 *
 * @author Iratxe
 */
@ManagedBean
@RequestScoped
public class ErabiltzaileKudeatzaile {

    Session sesioa;
    String id;
    String pasahitza;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasahitza() {
        return pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }

    public ErabiltzaileKudeatzaile() {
        sesioa = HibernateKud.getInstance().getSession();
    }

    public String login() {
        org.hibernate.Transaction tx = null;
        ArrayList lista = new ArrayList();
        try {
            tx = sesioa.beginTransaction();
            Criteria crit = sesioa.createCriteria(Bezeroa.class).add(Restrictions.and(Restrictions.eq("id", id), Restrictions.eq("pasahitza", pasahitza)));
            tx.commit();
            lista = (ArrayList) crit.list();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }

        if (lista.size() == 1) {
            //ONDO
            return "administratzailea";
        } else {
            //Txarto
            return "errorea";
        }

    }
}
