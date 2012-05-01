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

    ArrayList<Espezialitatea> zerrenda = new ArrayList<Espezialitatea>();
    private Espezialitatea selectedEspezialitatea;  
   
    /**
     * Creates a new instance of BezeroZerrenda
     */
    public EspezialitateZerrenda() {
        
        EspezialitateKudeatzailea ek = new EspezialitateKudeatzailea();
        zerrenda = ek.EspezialitateakLortu();
        
    }
    

    public ArrayList<Espezialitatea> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Espezialitatea> zerrenda) {
        this.zerrenda = zerrenda;
    }
  
   
    public Espezialitatea getSelectedEspezialitatea() {  
        return selectedEspezialitatea;  
    }  
    public void setSelectedEspezialitatea(Espezialitatea selectedEspezialitatea) {  
        this.selectedEspezialitatea = selectedEspezialitatea;  
    }  
    
}
