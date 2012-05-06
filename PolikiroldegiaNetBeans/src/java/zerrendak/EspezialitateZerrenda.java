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

    ArrayList<Espezialitatea> zerrenda = new ArrayList<Espezialitatea>(); // Datu basean dauden espezialitateak gordeko dituen zerrenda
    private Espezialitatea selectedEspezialitatea; // tau erabiltzen dugunean, aukeratutako espezialitatearen instantzia gordeko duen atributua
    
    EspezialitateKudeatzailea ek;
    private Espezialitatea esp ; //Espezialitate berria sortzeko erabiliko den aldagaia
    
    /**
     * Creates a new instance of BezeroZerrenda
     */
    
    public EspezialitateZerrenda() {
        esp = new Espezialitatea();
        ek = new EspezialitateKudeatzailea();
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
    
    public Espezialitatea getEsp() {
        return esp;
    }

    public void setEsp(Espezialitatea esp) {
        this.esp = esp;
        
    }
    
    /*Ez dabil*/
    public void ezabatuEspezialitatea() { 
        
        zerrenda.remove(selectedEspezialitatea); 
        ek.espezialitateaEzabatu(selectedEspezialitatea);
    }
   
    // Espezialitate berri bat datu basean gordetzen du.
    public void gorde() {
        
        ek.espezialitateaGorde(new Espezialitatea(esp.getIzena(), esp.getEspezialitatea()));
        esp = new Espezialitatea();
         
    } 
    
}
