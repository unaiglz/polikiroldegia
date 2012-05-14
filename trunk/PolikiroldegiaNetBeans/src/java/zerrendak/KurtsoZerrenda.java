package zerrendak;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import kudeatzaileak.KurtsoKudeatzailea;
import pojo.Kurtsoa;

@ManagedBean
@RequestScoped
public class KurtsoZerrenda {

    ArrayList<Kurtsoa> zerrenda = new ArrayList<Kurtsoa>(); 
    private Kurtsoa selectedKurtsoa; 
    
    private Kurtsoa kur;     
  
    
    public KurtsoZerrenda() {
        kur = new Kurtsoa();
        zerrenda = KurtsoKudeatzailea.getInstantzia().kurtsoakLortu();
        System.out.println(zerrenda);
    }
    

    public ArrayList<Kurtsoa> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Kurtsoa> zerrenda) {
        this.zerrenda = zerrenda;
    }
  
    public Kurtsoa getSelectedKurtsoa() {  
        return selectedKurtsoa;  
    }  
    public void setSelectedKurtsoa(Kurtsoa selectedKurtsoa) {  
        this.selectedKurtsoa = selectedKurtsoa;  
    }

    public Kurtsoa getKur() {
        return kur;
    }

    public void seKur(Kurtsoa kur) {
        this.kur = kur;
    }
    
    public void ezabatuKurtsoa(Kurtsoa k) { 
        
        zerrenda.remove(k); 
        KurtsoKudeatzailea.getInstantzia().kurtsoaEzabatu(k);
    }
   
    
    public void kurtsoaGorde() {
        System.out.println("Kurtsoa gorden sartu da" + kur.toString());
        KurtsoKudeatzailea.getInstantzia().kurtsoaGorde(new Kurtsoa(kur.getMonitorea(),kur.getEspezialitatea(),kur.getIzena(),kur.getDeskribapena(),kur.getBezMax(),new Date(2018, 8, 17)));
        kur = new Kurtsoa();     
    } 
    
     
}
