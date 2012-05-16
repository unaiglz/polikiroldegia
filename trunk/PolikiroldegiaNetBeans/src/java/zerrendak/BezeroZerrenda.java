package zerrendak;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import pojo.Bezeroa;
import kudeatzaileak.ErabiltzaileKudeatzaile;
import pojo.Tarifa;

@ManagedBean
@RequestScoped
public class BezeroZerrenda {

    ArrayList<Bezeroa> zerrenda = new ArrayList<Bezeroa>();
    private Bezeroa selectedBezeroa;
    private Bezeroa bez;
    ErabiltzaileKudeatzaile ek;
    private boolean value;
    private boolean erakutsi;

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
        System.out.println("BezeroZerrenda > Bezeroa : " + bez);
        ek.bezeroaGorde(new Bezeroa(bez.getId(), bez.getTarifa(), bez.getIzena(), bez.getAbizena(), bez.getEmaila(), bez.getPasahitza(), bez.getJaioData(), kalkulatuIraupena()));
        bez = new Bezeroa();
    }
    
    

    public void ezabatuBezeroa(Bezeroa inst) {
        zerrenda.remove(inst);
        ek.ezabatuBezeroa(inst);
    }

    public void izenaEman() {
        if (value) {
            ek.bezeroaGorde(new Bezeroa(bez.getId(), bez.getTarifa(), bez.getIzena(), bez.getAbizena(), bez.getEmaila(), bez.getPasahitza(), bez.getJaioData(), "2025-12-31"));
            bez = new Bezeroa();
        } else {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Errorea", "Pribatutasun baldintzak onartu");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    /*
     * Metodo para calcular la iraungitze data partiendo del dia de hoy
     */
    public String lortuIraungitzea(String data, Tarifa tar) {
        System.out.println("Sortutako data :" + data);
        String urte = data.substring(0, 3);
        int urtea = Integer.parseInt(urte) + tar.getIraupena();
        urte = urtea + data.substring(4);
        System.out.println("Iraungitzea:" + urte);
        return urtea + data.substring(4);

    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean isErakutsi() {
        return erakutsi;
    }

    public void setErakutsi(boolean erakutsi) {
        this.erakutsi = erakutsi;
    }

    private String kalkulatuIraupena() {
        //Hurrengo inplementazioetan modulu hau gehituko da
        return "2015-12-31";
    }
}
