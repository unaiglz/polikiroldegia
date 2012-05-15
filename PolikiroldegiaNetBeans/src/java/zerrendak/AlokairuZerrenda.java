/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zerrendak;

import hibernate.HibernateKud;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import kudeatzaileak.AlokairuKudeatzailea;
import kudeatzaileak.ErabiltzaileKudeatzaile;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import pojo.Alokairua;
import pojo.Bezeroa;

/**
 *
 * @author unai
 */
@ManagedBean
@RequestScoped
public class AlokairuZerrenda {

    ArrayList<Alokairua> zerrenda = new ArrayList<Alokairua>(); // Datu basean dauden espezialitateak gordeko dituen zerrenda
    private Alokairua selectedAlokairua; // tau erabiltzen dugunean, aukeratutako espezialitatearen instantzia gordeko duen atributua
    AlokairuKudeatzailea ak = AlokairuKudeatzailea.getInstantzia();
    private Alokairua alo; //Espezialitate berria sortzeko erabiliko den aldagaia

    public AlokairuZerrenda() {
        alo = new Alokairua();
        zerrenda = ak.alokairuakLortu();
    }

    public Alokairua getAlo() {
        return alo;
    }

    public void setAlo(Alokairua alo) {
        this.alo = alo;
    }

    public Alokairua getSelectedAlokairua() {
        return selectedAlokairua;
    }

    public void setSelectedAlokairua(Alokairua selectedAlokairua) {
        this.selectedAlokairua = selectedAlokairua;
    }

    public ArrayList<Alokairua> getZerrenda() {
        return zerrenda;
    }

    public void setZerrenda(ArrayList<Alokairua> zerrenda) {
        this.zerrenda = zerrenda;
    }

    public void ezabatuAlokairua(Alokairua inst) {
        zerrenda.remove(inst);
        ak.alokairuaEzabatu(inst);
    }

    public void alokairuaGorde() {
        ak.alokairuaGorde(new Alokairua(alo.getBezeroId(), alo.getInstalazioa(), alo.getData(), alo.getOrdua(), alo.getOharra()));
        alo = new Alokairua();
    }

    
}
