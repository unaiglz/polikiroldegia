package zerrendak;

import java.util.ArrayList;
import kudeatzaileak.MonitoreKudeatzailea;
import pojo.Monitorea;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MonitoreZerrenda {
    ArrayList<Monitorea> zerrenda = new ArrayList<Monitorea>(); 
    private Monitorea selectedMonitorea; 
    
    private Monitorea moni;     
  
    
    public MonitoreZerrenda() {
        moni = new Monitorea();
        zerrenda = MonitoreKudeatzailea.getInstantzia().monitoreakLortu();
    }
    

    public ArrayList<Monitorea> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Monitorea> zerrenda) {
        this.zerrenda = zerrenda;
    }
  
    public Monitorea getSelectedMonitorea() {  
        return selectedMonitorea;  
    }  
    public void setSelectedMonitorea(Monitorea selectedMonitorea) {  
        this.selectedMonitorea = selectedMonitorea;  
    }

    public Monitorea getMoni() {
        return moni;
    }

    public void setMoni(Monitorea moni) {
        this.moni = moni;
    }
    
    public void ezabatuMonitorea() { 
        
        zerrenda.remove(selectedMonitorea); 
        MonitoreKudeatzailea.getInstantzia().espezialitateaEzabatu(selectedMonitorea);
    }
   
    
    public void monitoreaGorde() {
        MonitoreKudeatzailea.getInstantzia().monitoreaGorde(new Monitorea(moni.getId(),moni.getIzena(),moni.getAbizena()));
        moni = new Monitorea();
         
    } 
    
}
