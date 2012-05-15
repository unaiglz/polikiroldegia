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

    /**
     * Creates a new instance of HibernateTest
     */
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
        Espezialitatea inst = new Espezialitatea("Esp10");
        if (HibernateKud.getInstance().gorde(inst) == true) {
            return "Test honetan honakoa probatu da: Espezialitate berri bat sortzea, eta hau datu basean sartzea";
        } else {
            return "Errorea exekuzioan";
        }

    }

    public Object test3() {
        a = (ArrayList) HibernateKud.getInstance().execSQL("SELECT * FROM Espezialitatea WHERE izena = 'Espezialitate3' ");
        Iterator it = a.listIterator();
        Object i = null;
        while (it.hasNext()) {
            i = it.next();
            return i.toString();
        }
        return i;
        /*
         * if (HibernateKud.getInstance().gorde(inst) == true) { return "Test
         * honetan honakoa probatu da: Espezialitate berri bat sortzea, eta hau
         * datu basean sartzea"; } else { return "Errorea exekuzioan"; }
         */

    }

    public String test4() {
//        Espezialitatea inst = new Espezialitatea("Esp10");
        a = (ArrayList) HibernateKud.getInstance().execHQL("from Espezialitatea where izena= 'wer'");
        Espezialitatea inst = a.get(0);
//        if (HibernateKud.getInstance().gorde(inst) == true) {
        if (HibernateKud.getInstance().ezabatu(inst) == true) {
            return "Guarda y elimina.";
        } else {
            return "No elimina.";
        }
//        } else {
//            return "No guarda.";
//        }
    }
}
