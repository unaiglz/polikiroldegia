package pojo;
// Generated 12-may-2012 18:09:50 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Monitorea  implements java.io.Serializable, Pertsona {


     private String id;
     private String izena;
     private String abizena;
     private Set<Kurtsoa> kurtsoas = new HashSet<Kurtsoa>(0);
     private Set<Espezialitatea> espezialitateas = new HashSet<Espezialitatea>(0);

    public Monitorea() {
    }

	
    public Monitorea(String id, String izena, String abizena) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
    }
    public Monitorea(String id, String izena, String abizena, Set<Kurtsoa> kurtsoas, Set<Espezialitatea> espezialitateas) {
       this.id = id;
       this.izena = izena;
       this.abizena = abizena;
       this.kurtsoas = kurtsoas;
       this.espezialitateas = espezialitateas;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getIzena() {
        return this.izena;
    }
    
    public void setIzena(String izena) {
        this.izena = izena;
    }
    public String getAbizena() {
        return this.abizena;
    }
    
    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }
    public Set<Kurtsoa> getKurtsoas() {
        return this.kurtsoas;
    }
    
    public void setKurtsoas(Set<Kurtsoa> kurtsoas) {
        this.kurtsoas = kurtsoas;
    }
    public Set<Espezialitatea> getEspezialitateas() {
        return this.espezialitateas;
    }
    
    public void setEspezialitateas(Set<Espezialitatea> espezialitateas) {
        this.espezialitateas = espezialitateas;
    }

    @Override
    public String toString() {
        return izena;
    }
    
    




}


