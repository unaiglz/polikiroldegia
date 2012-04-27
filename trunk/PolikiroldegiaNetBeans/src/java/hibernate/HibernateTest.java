/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pojo.Espezialitatea;

/**
 *
 * @author unai
 */
@ManagedBean
@RequestScoped
public class HibernateTest {

    ArrayList<Espezialitatea> a = new ArrayList<Espezialitatea>();
    public Espezialitatea balioa;

    /** Creates a new instance of HibernateTest */
    public HibernateTest() {
        test();
    }

    public Espezialitatea test() {
        a = (ArrayList) HibernateKud.getInstance().execHQL("from Espezialitatea");
        Iterator it = a.listIterator();
        while (it.hasNext()) {
            balioa = (Espezialitatea) it.next();
        }
        return balioa;
    }

   public String test2() {
        Espezialitatea inst = new Espezialitatea("Espezialitate4");
         if (HibernateKud.getInstance().gorde(inst)==true) {
            return "Test honetan honakoa probatu da: Espezialitate berri bat sortzea, eta hau datu basean sartzea";
        } else {
            return "Errorea exekuzioan";
        }

    }
}
