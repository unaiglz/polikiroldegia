package zerrendak;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import kudeatzaileak.TarifaKudeatzailea;
import pojo.Tarifa;

@ManagedBean
@RequestScoped
public class TarifaZerrenda {
 
    ArrayList<Tarifa> zerrenda = new ArrayList<Tarifa>(); 
    private Tarifa selectedTarifa;  
    private Tarifa tar;  
    
    public TarifaZerrenda() {
        tar = new Tarifa();
        zerrenda = TarifaKudeatzailea.getInstantzia().tarifakLortu();
    }

    public Tarifa getSelectedTarifa() {
        return selectedTarifa;
    }

    public void setSelectedTarifa(Tarifa selectedTarifa) {
        this.selectedTarifa = selectedTarifa;
    }

    public Tarifa getTar() {
        return tar;
    }

    public void setTar(Tarifa tar) {
        this.tar = tar;
    }

    public ArrayList<Tarifa> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Tarifa> zerrenda) {
        this.zerrenda = zerrenda;
    }
    
    
    public void ezabatuTarifa(Tarifa inst) { 
        
        zerrenda.remove(inst); 
        TarifaKudeatzailea.getInstantzia().tarifaEzabatu(inst);
    }
   
    
    public void tarifaGorde() {
       
        TarifaKudeatzailea.getInstantzia().tarifaGorde(new Tarifa(tar.getMota(),tar.getPrezioa(),tar.getIraupena(),tar.getAlokairuMax(),tar.getKurtsoMax()));
        tar = new Tarifa();
         
    } 
}
