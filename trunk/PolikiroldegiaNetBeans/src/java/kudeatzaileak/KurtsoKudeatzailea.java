package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import pojo.Kurtsoa;


public class KurtsoKudeatzailea {
    private static KurtsoKudeatzailea instantzia = new KurtsoKudeatzailea();
    
    private KurtsoKudeatzailea() {
    }
       

    public static KurtsoKudeatzailea getInstantzia() {
        return instantzia;
    }
     

    public ArrayList<Kurtsoa> kurtsoakLortu() {
        return (ArrayList<Kurtsoa>) HibernateKud.getInstance().execHQL("from Kurtsoa");
    }
    
    public void kurtsoaEzabatu(Kurtsoa insta){
        
        HibernateKud.getInstance().ezabatu(insta);
    }
    
    public void kurtsoaGorde(Kurtsoa insta){
        HibernateKud.getInstance().gorde(insta);
    }
 
}
