package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import pojo.Tarifa;

public class TarifaKudeatzailea {
 
    private static TarifaKudeatzailea instantzia = new TarifaKudeatzailea();
    
    private TarifaKudeatzailea() {
    }
       

    public static TarifaKudeatzailea getInstantzia() {
        return instantzia;
    }
     

    public ArrayList<Tarifa> tarifakLortu() {
        return (ArrayList<Tarifa>) HibernateKud.getInstance().execHQL("from Tarifa");
    }
    
    public void tarifaEzabatu(Tarifa tar){
        
        HibernateKud.getInstance().ezabatu(tar);
    }
    
    public void tarifaGorde(Tarifa tar){
        HibernateKud.getInstance().gorde(tar);
    }   
}