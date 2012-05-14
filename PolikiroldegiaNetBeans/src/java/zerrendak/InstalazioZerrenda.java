package zerrendak;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import kudeatzaileak.InstalazioKudeatzailea;
import pojo.Instalazioa;


@ManagedBean
@RequestScoped
public class InstalazioZerrenda {
    
    ArrayList<Instalazioa> zerrenda = new ArrayList<Instalazioa>(); 
    private Instalazioa selectedInstalazioa; 
    
    private Instalazioa insta;     
  
    
    public InstalazioZerrenda() {
        insta = new Instalazioa();
        zerrenda = InstalazioKudeatzailea.getInstantzia().instalazioakLortu();
        System.out.println(zerrenda);
    }
    

    public ArrayList<Instalazioa> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Instalazioa> zerrenda) {
        this.zerrenda = zerrenda;
    }
  
    public Instalazioa getSelectedInstalazioa() {  
        return selectedInstalazioa;  
    }  
    public void setSelectedInstalazioa(Instalazioa selectedInstalazioa) {  
        this.selectedInstalazioa = selectedInstalazioa;  
    }

    public Instalazioa getInsta() {
        return insta;
    }

    public void setInsta(Instalazioa insta) {
        this.insta = insta;
    }
    
    public void ezabatuInstalazioa(Instalazioa i) { 
        
        zerrenda.remove(i); 
        InstalazioKudeatzailea.getInstantzia().instalazioaEzabatu(i);
    }
   
    
    public void instalazioaGorde() {
        InstalazioKudeatzailea.getInstantzia().instalazioaGorde(new Instalazioa(insta.getIzena(),insta.getDeskribapena()));
        insta = new Instalazioa();
         
    } 
    
}
