/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zerrendak;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import kudeatzaileak.EspezialitateKudeatzailea;
import pojo.Espezialitatea;

@ManagedBean
@RequestScoped
public class EspezialitateZerrenda{

    private Espezialitatea esp = new Espezialitatea();
    ArrayList<Espezialitatea> zerrenda = new ArrayList<Espezialitatea>();
    private Espezialitatea selectedEspezialitatea; 
    EspezialitateKudeatzailea ek = new EspezialitateKudeatzailea();
   
    /**
     * Creates a new instance of BezeroZerrenda
     */
    public EspezialitateZerrenda() {
        
        zerrenda = ek.EspezialitateakLortu();
        
    }
    

    public ArrayList<Espezialitatea> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Espezialitatea> zerrenda) {
        this.zerrenda = zerrenda;
    }

    public Espezialitatea getEsp() {
        return esp;
    }

    public void setEsp(Espezialitatea esp) {
        this.esp = esp;
        
    }
  
   
    public Espezialitatea getSelectedEspezialitatea() {  
        return selectedEspezialitatea;  
    }  
    public void setSelectedEspezialitatea(Espezialitatea selectedEspezialitatea) {  
        this.selectedEspezialitatea = selectedEspezialitatea;  
    }
    
    public void ezabatuEspezialitatea() {  
        zerrenda.remove(selectedEspezialitatea);        
    }
    
    public void reinit() {
        
        ek.espezialitateaGorde(esp);
        esp = new Espezialitatea();  
         
    } 
    
    
}
