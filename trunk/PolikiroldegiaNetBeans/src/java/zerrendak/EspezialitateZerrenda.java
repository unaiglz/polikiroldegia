package zerrendak;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import kudeatzaileak.EspezialitateKudeatzailea;
import pojo.Espezialitatea;

@ManagedBean
@RequestScoped
public class EspezialitateZerrenda {

    ArrayList<Espezialitatea> zerrenda = new ArrayList<Espezialitatea>(); // Datu basean dauden espezialitateak gordeko dituen zerrenda
    private Espezialitatea selectedEspezialitatea; // tau erabiltzen dugunean, aukeratutako espezialitatearen instantzia gordeko duen atributua
    EspezialitateKudeatzailea ek = EspezialitateKudeatzailea.getInstantzia();
    private Espezialitatea esp; //Espezialitate berria sortzeko erabiliko den aldagaia
    String balioa;

    /**
     * Creates a new instance of BezeroZerrenda
     */
    public EspezialitateZerrenda() {
        esp = new Espezialitatea();
        zerrenda = EspezialitateKudeatzailea.getInstantzia().espezialitateakLortu();

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

    /*
     * Ez dabil
     */
    public void ezabatuEspezialitatea(Espezialitatea inst) {
        zerrenda.remove(inst);
        ek.espezialitateaEzabatu(inst);
    }

    // Espezialitate berri bat datu basean gordetzen du.
    public void gorde() {
        ek.espezialitateaGorde(new Espezialitatea(esp.getIzena(), esp.getEspezialitatea()));
        esp = new Espezialitatea();
    }

    public String getBalioa() {
        return balioa;
    }

    public void setBalioa(String balioa) {
        this.balioa = balioa;
    }

    public void eguneratu(ActionEvent actionEvent) {
        
    }
}
