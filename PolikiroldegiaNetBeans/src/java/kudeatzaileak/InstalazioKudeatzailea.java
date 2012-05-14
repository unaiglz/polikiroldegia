package kudeatzaileak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import pojo.Instalazioa;

public class InstalazioKudeatzailea {
    private static InstalazioKudeatzailea instantzia = new InstalazioKudeatzailea();
    
    private InstalazioKudeatzailea() {
    }
       

    public static InstalazioKudeatzailea getInstantzia() {
        return instantzia;
    }
     

    public ArrayList<Instalazioa> instalazioakLortu() {
        return (ArrayList<Instalazioa>) HibernateKud.getInstance().execHQL("from Instalazioa");
    }
    
    public void instalazioaEzabatu(Instalazioa insta){
        
        HibernateKud.getInstance().ezabatu(insta);
    }
    
    public void instalazioaGorde(Instalazioa insta){
        HibernateKud.getInstance().gorde(insta);
    }

}
