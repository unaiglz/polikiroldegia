/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pojo.Espezialitatea;


@ManagedBean
@RequestScoped
public class EspezialitateKudeatzailea {

    /**
     * Creates a new instance of TarifaKudeatzailea
     */
    public EspezialitateKudeatzailea() {
    }

    public ArrayList<Espezialitatea> EspezialitateakLortu() {
        return (ArrayList<Espezialitatea>) HibernateKud.getInstance().execHQL("from Espezialitatea");
    }
}
