/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojo.Administratzailea;
import pojo.Bezeroa;
import pojo.Pertsona;

/**
 *
 * @author Iratxe and Unai!
 */
@ManagedBean(name = "user")
@RequestScoped
public class ErabiltzaileKudeatzaile {

    String id;
    String pasahitza;
    Bezeroa unekoa;
    Session sesioa;
    FacesContext context;

    public ErabiltzaileKudeatzaile() {
        sesioa = HibernateKud.getInstance().getSession();
        FacesContext context = FacesContext.getCurrentInstance();
    }

    public String login() {
        unekoa = bilatuBezeroa();
        if (unekoa != null) {
            // Ondo eginda
            // Devuelve una redirección
            if (isAdmin()) {
                //Esta tuneado para que entre siempre por aqui
                return "administratzailea";
            } else if (unekoa.isAktibo()) {
                return "bezeroa";
            } else {
                id = pasahitza = null;
                return "errorea";
            }

        } else {
            //context.addMessage(null, new FacesMessage("Unknown login, try again"));
            id = pasahitza = null;
            return "errorea";
        }
//        unekoa = isAdmin();
//        if (unekoa != null) {
//            return "adminstratzailea";
//        } else {
//            Bezeroa inst = bilatuBezeroa();
//            if (inst != null) {
//                if (inst.isAktibo()) {
//                    unekoa = inst;
//                    return "bezeroa";
//                }
//            }
//            id = pasahitza = null;
//            return "errorea";
//        }
    }

    public String izenaEman() {
        return "izenaEman";
    }
    public String logOut() {
        //Sesio aldagaia kentzeko:
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index";
    }

    private Boolean isAdmin() {
//        org.hibernate.Transaction tx = null;
//        ArrayList lista = new ArrayList();
//        try {
//            tx = sesioa.beginTransaction();
//            Criteria crit = sesioa.createCriteria(Administratzailea.class).add(Restrictions.and(Restrictions.eq("izena", id), Restrictions.eq("pasahitza", pasahitza)));
//            tx.commit();
//            lista = (ArrayList) crit.list();
//            if (lista.size() == 1) {
//                return (Administratzailea) lista.get(0);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            tx.rollback();
//        }
//        return null;
        return true;
    }

    /*
     *  Esto no es correcto: Proyecto fututo, moverlo a HibernateKud, que es el que se deberia de encargar de las conexiones
     */
    public Bezeroa bilatuBezeroa() {
        org.hibernate.Transaction tx = null;
        ArrayList lista = new ArrayList();
        try {
            tx = sesioa.beginTransaction();
            Criteria crit = sesioa.createCriteria(Bezeroa.class).add(Restrictions.and(Restrictions.eq("id", id), Restrictions.eq("pasahitza", pasahitza)));
            tx.commit();
            lista = (ArrayList) crit.list();
            if (lista.size() == 1) {
                return (Bezeroa) lista.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        return null;
    }

    public boolean isLoggedIn() {
        return unekoa != null;
    }

    public boolean isNotLoggedIn() {
        return unekoa == null;
    }

    public static void main(String[] args) {
        Object h = FacesContext.getCurrentInstance().getExternalContext().getSession(true);

    }

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

    public Pertsona getUnekoa() {
        return unekoa;
    }

    public String getUnekoIzena() {
        return unekoa.getIzena();
    }

    public ArrayList<Bezeroa> bezeroakLortu() {

        return (ArrayList<Bezeroa>) HibernateKud.getInstance().execHQL("from Bezeroa");

    }

    public void bezeroaGorde(Bezeroa bez) {
        HibernateKud.getInstance().gorde(bez);
        HibernateKud.getInstance().eguneratu(bez);
    }

    public void ezabatuBezeroa(Bezeroa inst) {
        HibernateKud.getInstance().ezabatu(inst);
    }
}
