package pojo;
// Generated 24-abr-2012 12:01:44 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Tarifa generated by hbm2java
 */
public class Tarifa  implements java.io.Serializable {


     private Integer id;
     private String mota;
     private float prezioa;
     private int iraupena;
     private int alokairuMax;
     private int kurtsoMax;
     private Set<Bezeroa> bezeroas = new HashSet<Bezeroa>(0);

    public Tarifa() {
    }

	
    public Tarifa(String mota, float prezioa, int iraupena, int alokairuMax, int kurtsoMax) {
        this.mota = mota;
        this.prezioa = prezioa;
        this.iraupena = iraupena;
        this.alokairuMax = alokairuMax;
        this.kurtsoMax = kurtsoMax;
    }
    public Tarifa(String mota, float prezioa, int iraupena, int alokairuMax, int kurtsoMax, Set<Bezeroa> bezeroas) {
       this.mota = mota;
       this.prezioa = prezioa;
       this.iraupena = iraupena;
       this.alokairuMax = alokairuMax;
       this.kurtsoMax = kurtsoMax;
       this.bezeroas = bezeroas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMota() {
        return this.mota;
    }
    
    public void setMota(String mota) {
        this.mota = mota;
    }
    public float getPrezioa() {
        return this.prezioa;
    }
    
    public void setPrezioa(float prezioa) {
        this.prezioa = prezioa;
    }
    public int getIraupena() {
        return this.iraupena;
    }
    
    public void setIraupena(int iraupena) {
        this.iraupena = iraupena;
    }
    public int getAlokairuMax() {
        return this.alokairuMax;
    }
    
    public void setAlokairuMax(int alokairuMax) {
        this.alokairuMax = alokairuMax;
    }
    public int getKurtsoMax() {
        return this.kurtsoMax;
    }
    
    public void setKurtsoMax(int kurtsoMax) {
        this.kurtsoMax = kurtsoMax;
    }
    public Set<Bezeroa> getBezeroas() {
        return this.bezeroas;
    }
    
    public void setBezeroas(Set<Bezeroa> bezeroas) {
        this.bezeroas = bezeroas;
    }




}


