package zerrendak;

import java.util.ArrayList;
import kudeatzaileak.AlokairuKudeatzailea;
import pojo.Alokairua;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AlokairuZerrenda {
    ArrayList<Alokairua> zerrenda = new ArrayList<Alokairua>(); 
    private Alokairua selectedAlokairua; 
    
    private Alokairua alo;     
  
    
    public AlokairuZerrenda() {
        alo = new Alokairua();
        zerrenda = AlokairuKudeatzailea.getInstantzia().alokairuakLortu();
    }
    

    public ArrayList<Alokairua> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Alokairua> zerrenda) {
        this.zerrenda = zerrenda;
    }
  
    public Alokairua getSelectedAlokairua() {  
        return selectedAlokairua;  
    }  
    public void setSelectedAlokairua(Alokairua selectedAlokairua) {  
        this.selectedAlokairua = selectedAlokairua;  
    }

    public Alokairua getAlo() {
        return alo;
    }

    public void setAlo(Alokairua alo) {
        this.alo = alo;
    }
    
    
    
    /*Ez dabil*/
    public void ezabatuAlokairua() { 
        
        zerrenda.remove(selectedAlokairua); 
        AlokairuKudeatzailea.getInstantzia().espezialitateaEzabatu(selectedAlokairua);
    }
   
    
    public void alokairuaGorde() {
        AlokairuKudeatzailea.getInstantzia().AlokairuaGorde(new Alokairua(alo.getBezeroId(),alo.getInstalazioa(),alo.getDataOrdua()));
        alo = new Alokairua();
         
    } 
    
}
