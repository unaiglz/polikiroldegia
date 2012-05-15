/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import pojo.Alokairua;

/**
 *
 * @author unai
 */
public class AlokairuKudeatzailea {

    private static AlokairuKudeatzailea instantzia = new AlokairuKudeatzailea();

    private AlokairuKudeatzailea() {
    }

    public static AlokairuKudeatzailea getInstantzia() {
        return instantzia;
    }

    public ArrayList<Alokairua> alokairuakLortu() {
        return (ArrayList<Alokairua>) HibernateKud.getInstance().execHQL("from Alokairua");
    }

    public void alokairuaEzabatu(Alokairua alo) {
        HibernateKud.getInstance().ezabatu(alo);
    }

    public void alokairuaGorde(Alokairua alo) {
        HibernateKud.getInstance().gorde(alo);
        HibernateKud.getInstance().eguneratu(alo);
    }
    
    
}
