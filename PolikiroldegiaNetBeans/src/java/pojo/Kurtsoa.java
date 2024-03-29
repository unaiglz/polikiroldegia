package pojo;
// Generated 12-may-2012 18:09:50 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Kurtsoa generated by hbm2java
 */
public class Kurtsoa  implements java.io.Serializable {


     private Integer id;
     private Monitorea monitorea;
     private Espezialitatea espezialitatea;
     private String izena;
     private String deskribapena;
     private int bezMax;
     private String data;
     private Set<Ordutegia> ordutegias = new HashSet<Ordutegia>(0);
     private Set<Bezeroa> bezeroas = new HashSet<Bezeroa>(0);

    public Kurtsoa() {
       this.monitorea = null;
       this.espezialitatea = null;
       this.izena = " ";
       this.deskribapena = " ";
       this.bezMax = 0;
       this.data = null;
       this.ordutegias = null;
       this.bezeroas = null;
    }

	
    public Kurtsoa(Monitorea monitorea, Espezialitatea espezialitatea, String izena, String deskribapena, int bezMax, String data) {
        this.monitorea = monitorea;
        this.espezialitatea = espezialitatea;
        this.izena = izena;
        this.deskribapena = deskribapena;
        this.bezMax = bezMax;
        this.data = data;
    }
    public Kurtsoa(Monitorea monitorea, Espezialitatea espezialitatea, String izena, String deskribapena, int bezMax, String data, Set<Ordutegia> ordutegias, Set<Bezeroa> bezeroas) {
       this.monitorea = monitorea;
       this.espezialitatea = espezialitatea;
       this.izena = izena;
       this.deskribapena = deskribapena;
       this.bezMax = bezMax;
       this.data = data;
       this.ordutegias = ordutegias;
       this.bezeroas = bezeroas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        System.out.println(">>>>>>>>>>> Kurtso id=" + id);
        this.id = id;
    }
    public Monitorea getMonitorea() {
        return this.monitorea;
    }
    
    public void setMonitorea(Monitorea monitorea) {
        System.out.println(">>>>>>>>>>> Kurtso Monitorea=" + monitorea);
        this.monitorea = monitorea;
    }
    public Espezialitatea getEspezialitatea() {
        return this.espezialitatea;
    }
    
    public void setEspezialitatea(Espezialitatea espezialitatea) {
        System.out.println(">>>>>>>>>>> Kurtso Espezialitatea=" + espezialitatea);
        this.espezialitatea = espezialitatea;
    }
    public String getIzena() {
        return this.izena;
    }
    
    public void setIzena(String izena) {
        System.out.println(">>>>>>>>>>> Kurtso izena=" + izena);
        this.izena = izena;
    }
    public String getDeskribapena() {
        return this.deskribapena;
    }
    
    public void setDeskribapena(String deskribapena) {
        System.out.println(">>>>>>>>>>> Kurtso deskribapena=" + deskribapena);
        this.deskribapena = deskribapena;
    }
    public int getBezMax() {
        return this.bezMax;
    }
    
    public void setBezMax(int bezMax) {
        System.out.println(">>>>>>>>>>> Kurtso bezMax=" + bezMax);
        this.bezMax = bezMax;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        System.out.println(">>>>>>>>>>> Kurtso data=" + data);
        this.data = data;
    }
    public Set<Ordutegia> getOrdutegias() {
        return this.ordutegias;
    }
    
    public void setOrdutegias(Set<Ordutegia> ordutegias) {
        this.ordutegias = ordutegias;
    }
    public Set<Bezeroa> getBezeroas() {
        return this.bezeroas;
    }
    
    public void setBezeroas(Set<Bezeroa> bezeroas) {
        this.bezeroas = bezeroas;
    }




}


