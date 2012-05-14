package kontrola;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;  
import java.util.List;  
import javax.annotation.PostConstruct;
/**
 *
 * @author Iratxe
 */
@ManagedBean
@RequestScoped
public class irudiBean {
    
    private List<String> irudiak;

    public irudiBean() {
        irudiak = new ArrayList<String>();  
  
        for(int i=1;i<=6;i++) {  
            irudiak.add("aur" + i + ".jpg");  
        } 
    }
  
    public List<String> getIrudiak() {  
        return irudiak;  
    }

    public void setIrudiak(List<String> irudiak) {
        this.irudiak = irudiak;
    }
    
}
