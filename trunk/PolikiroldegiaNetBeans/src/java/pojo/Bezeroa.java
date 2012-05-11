package pojo;
// Generated 08-may-2012 17:22:28 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Bezeroa generated by hbm2java
 */
public class Bezeroa implements java.io.Serializable , Pertsona {

    private String id;
    private Tarifa tarifa;
    private String izena;
    private String abizena;
    private String emaila;
    private String pasahitza;
    private Date jaioData;
    private boolean aktibo;
    private int alokairuKop;
    private int kurtsoKop;
    private Date iraungitzeData;
    private Set<Alokairua> alokairuas = new HashSet<Alokairua>(0);
    private Set<Kurtsoa> kurtsoas = new HashSet<Kurtsoa>(0);

    public Bezeroa() {
    }

    public Bezeroa(String id, String izena, String pasahitza) {
        this.id = id;
        this.izena = izena;
        this.pasahitza = pasahitza;

    }

    public Bezeroa(String id, Tarifa tarifa, String izena, String emaila, String pasahitza, Date jaioData, boolean aktibo, int alokairuKop, int kurtsoKop, Date iraungitzeData) {
        this.id = id;
        this.tarifa = tarifa;
        this.izena = izena;
        this.emaila = emaila;
        this.pasahitza = pasahitza;
        this.jaioData = jaioData;
        this.aktibo = aktibo;
        this.alokairuKop = alokairuKop;
        this.kurtsoKop = kurtsoKop;
        this.iraungitzeData = iraungitzeData;
    }

    public Bezeroa(String id, Tarifa tarifa, String izena, String abizena, String emaila, String pasahitza, Date jaioData, boolean aktibo, int alokairuKop, int kurtsoKop, Date iraungitzeData, Set<Alokairua> alokairuas, Set<Kurtsoa> kurtsoas) {
        this.id = id;
        this.tarifa = tarifa;
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
        this.pasahitza = pasahitza;
        this.jaioData = jaioData;
        this.aktibo = aktibo;
        this.alokairuKop = alokairuKop;
        this.kurtsoKop = kurtsoKop;
        this.iraungitzeData = iraungitzeData;
        this.alokairuas = alokairuas;
        this.kurtsoas = kurtsoas;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tarifa getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
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

    public String getEmaila() {
        return this.emaila;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }

    public String getPasahitza() {
        return this.pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }

    public Date getJaioData() {
        return this.jaioData;
    }

    public void setJaioData(Date jaioData) {
        this.jaioData = jaioData;
    }

    public boolean isAktibo() {
        return this.aktibo;
    }

    public void setAktibo(boolean aktibo) {
        this.aktibo = aktibo;
    }

    public int getAlokairuKop() {
        return this.alokairuKop;
    }

    public void setAlokairuKop(int alokairuKop) {
        this.alokairuKop = alokairuKop;
    }

    public int getKurtsoKop() {
        return this.kurtsoKop;
    }

    public void setKurtsoKop(int kurtsoKop) {
        this.kurtsoKop = kurtsoKop;
    }

    public Date getIraungitzeData() {
        return this.iraungitzeData;
    }

    public void setIraungitzeData(Date iraungitzeData) {
        this.iraungitzeData = iraungitzeData;
    }

    public Set<Alokairua> getAlokairuas() {
        return this.alokairuas;
    }

    public void setAlokairuas(Set<Alokairua> alokairuas) {
        this.alokairuas = alokairuas;
    }

    public Set<Kurtsoa> getKurtsoas() {
        return this.kurtsoas;
    }

    public void setKurtsoas(Set<Kurtsoa> kurtsoas) {
        this.kurtsoas = kurtsoas;
    }
}
