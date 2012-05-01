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
import pojo.Bezeroa;


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
            return "administratzailea";
        } else {
            //context.addMessage(null, new FacesMessage("Unknown login, try again"));
            id = pasahitza = null;
            return "errorea";
        }
    }

    public String logOut() {
        //Sesio aldagaia kentzeko: 
        context.getExternalContext().invalidateSession();
        return "index";
    }


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

    public Bezeroa getUnekoa() {
        return unekoa;
    }
    
    public ArrayList<Bezeroa> bezeroakLortu(){
        
        return (ArrayList<Bezeroa>) HibernateKud.getInstance().execHQL("from Bezeroa");
        
    }
    
    
          
        
        
    
    
}
