/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zerrendak;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pojo.Bezeroa;
import kudeatzaileak.ErabiltzaileKudeatzaile;


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
        
        ek.bezeroaGorde(new Bezeroa( bez.getId(),bez.getIzena(),bez.getPasahitza()));
        bez = new Bezeroa();
         
    } 
  
    


    
}
