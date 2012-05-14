package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import pojo.Alokairua;



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
    
    public void espezialitateaEzabatu(Alokairua alo){
        
        HibernateKud.getInstance().ezabatu(alo);
    }
    
    public void AlokairuaGorde(Alokairua alo){
        HibernateKud.getInstance().gorde(alo);
    }
}
