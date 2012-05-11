package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import pojo.Monitorea;



public class MonitoreKudeatzailea {

    private static MonitoreKudeatzailea instantzia = new MonitoreKudeatzailea();
    
    private MonitoreKudeatzailea() {
    }
       

    public static MonitoreKudeatzailea getInstantzia() {
        return instantzia;
    }
     

    public ArrayList<Monitorea> monitoreakLortu() {
        return (ArrayList<Monitorea>) HibernateKud.getInstance().execHQL("from Monitorea");
    }
    
    public void espezialitateaEzabatu(Monitorea moni){
        
        HibernateKud.getInstance().ezabatu(moni);
    }
    
    public void monitoreaGorde(Monitorea moni){
        HibernateKud.getInstance().gorde(moni);
    }
}
