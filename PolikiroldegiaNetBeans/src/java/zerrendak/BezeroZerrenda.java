/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zerrendak;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pojo.Bezeroa;

/**
 *
 * @author Iratxe
 */
@ManagedBean
@RequestScoped
public class BezeroZerrenda {

    ArrayList<Bezeroa> zerrenda;
    /**
     * Creates a new instance of BezeroZerrenda
     */
    public BezeroZerrenda() {
        zerrenda = new ArrayList<Bezeroa>();
        
    }
    public BezeroZerrenda(ArrayList<Bezeroa> zerrenda) {
        this.zerrenda = zerrenda;
        
    }
    
    public String getIzena(){
        return "Iratxe" ;
    }

    @Override
    public String toString() {
        return "BezeroZerrenda{" + "zerrenda=" + zerrenda + '}';
    }
    
}
