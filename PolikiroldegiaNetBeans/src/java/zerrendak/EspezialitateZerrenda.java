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
    
    private Espezialitatea esp; //Espezialitate berria sortzeko erabiliko den aldagaia
    

    public EspezialitateZerrenda() {
        esp = new Espezialitatea();
        zerrenda = EspezialitateKudeatzailea.getInstantzia().EspezialitateakLortu();
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
    public void ezabatuEspezialitatea(Espezialitatea inst) { 
        
        zerrenda.remove(inst); 
        EspezialitateKudeatzailea.getInstantzia().espezialitateaEzabatu(inst);
    }
   
    // Espezialitate berri bat datu basean gordetzen du.
    public void gorde() {
        EspezialitateKudeatzailea.getInstantzia().espezialitateaGorde(new Espezialitatea(esp.getIzena(), esp.getEspezialitatea()));
        esp = new Espezialitatea();
         
    } 
    
}
