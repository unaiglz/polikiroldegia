package zerrendak;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pojo.Bezeroa;
import kudeatzaileak.ErabiltzaileKudeatzaile;
import pojo.Tarifa;


@ManagedBean
@RequestScoped
public class BezeroZerrenda{

    ArrayList<Bezeroa> zerrenda = new ArrayList<Bezeroa>();
    private Bezeroa selectedBezeroa; 
    
    private Bezeroa bez;
    ErabiltzaileKudeatzaile ek;
   
    /**
     * Creates a new instance of BezeroZerrenda
     */
    public BezeroZerrenda() {
        
        bez = new Bezeroa();
        ek = new ErabiltzaileKudeatzaile();
        zerrenda = ek.bezeroakLortu();
        
    }
    

    public ArrayList<Bezeroa> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Bezeroa> zerrenda) {
        this.zerrenda = zerrenda;
    }
  
   
    public Bezeroa getSelectedBezeroa() {  
        return selectedBezeroa;  
    }  
    
    public void setSelectedBezeroa(Bezeroa selectedBezeroa) {  
        this.selectedBezeroa = selectedBezeroa;  
    }

    public Bezeroa getBez() {
        return bez;
    }

    public void setBez(Bezeroa bez) {
        this.bez = bez;
    }
    
     public void bezeroaGorde() {
         
        System.out.println("ErabiltzaileZerrenda");
//        ek.bezeroaGorde(new Bezeroa( bez.getId(), bez.getTarifa(),bez.getIzena(), bez.getEmaila(),bez.getPasahitza(), bez.getJaioData(), bez.isAktibo(),bez.getAlokairuKop(),bez.getKurtsoKop(),bez.getIraungitzeData()));
//        ek.bezeroaGorde(new Bezeroa( bez.getId(), tarifa,bez.getIzena(), bez.getEmaila(),"1111", bez.getJaioData(), bez.isAktibo(),bez.getAlokairuKop(),bez.getKurtsoKop(),bez.getIraungitzeData()));
        bez = new Bezeroa();
         
    } 
  
    


    
}
