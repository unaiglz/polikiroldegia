package pojo;
// Generated 12-may-2012 18:09:50 by Hibernate Tools 3.2.1.GA

/**
 * Alokairua generated by hbm2java
 */
public class Alokairua implements java.io.Serializable {

    private Integer id;
    private Bezeroa bezeroa;
    private Instalazioa instalazioa;
    private String data;
    private String ordua;
    private String oharra;

    public Alokairua() {
    }

    public Alokairua(Bezeroa bezeroa, Instalazioa instalazioa, String data, String ordua) {
        this.bezeroa = bezeroa;
        this.instalazioa = instalazioa;
        this.data = data;
        this.ordua = ordua;
    }

    public Alokairua(Bezeroa bezeroa, Instalazioa instalazioa, String data, String ordua, String oharra) {
        this.bezeroa = bezeroa;
        this.instalazioa = instalazioa;
        this.data = data;
        this.ordua = ordua;
        this.oharra = oharra;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bezeroa getBezeroa() {
        return this.bezeroa;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrdua() {
        return this.ordua;
    }

    public void setOrdua(String ordua) {
        this.ordua = ordua;
    }

    public String getOharra() {
        return this.oharra;
    }

    public void setOharra(String oharra) {
        this.oharra = oharra;
    }

    public Instalazioa getInstalazioa() {
        return instalazioa;
    }

    public void setInstalazioa(Instalazioa instalazioa) {
        this.instalazioa = instalazioa;
    }
}
