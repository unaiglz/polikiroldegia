package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import pojo.Espezialitatea;


public class EspezialitateKudeatzailea {

    private static EspezialitateKudeatzailea instantzia = new EspezialitateKudeatzailea();
   
    private EspezialitateKudeatzailea() {
    }

    public static EspezialitateKudeatzailea getInstantzia() {
        return instantzia;
    }
    
   

    public ArrayList<Espezialitatea> EspezialitateakLortu() {
        return (ArrayList<Espezialitatea>) HibernateKud.getInstance().execHQL("from Espezialitatea");
    }
    
    public void espezialitateaEzabatu(Espezialitatea esp){
        
        HibernateKud.getInstance().ezabatu(esp);
    }
    
    public void espezialitateaGorde(Espezialitatea esp){
        HibernateKud.getInstance().gorde(esp);
    }
}
