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


/**
 *
 * @author Iratxe
 */
@ManagedBean
@RequestScoped
public class BezeroZerrenda{

    ArrayList<Bezeroa> zerrenda = new ArrayList<Bezeroa>();
    private Bezeroa selectedBezeroa;  
   
    /**
     * Creates a new instance of BezeroZerrenda
     */
    public BezeroZerrenda() {
        
        ErabiltzaileKudeatzaile ek = new ErabiltzaileKudeatzaile();
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
  
    


    
}
