package pojo;
// Generated 12-may-2012 18:09:50 by Hibernate Tools 3.2.1.GA

/**
 * Alokairua generated by hbm2java
 */
public class Alokairua implements java.io.Serializable {

    private String bezeroId;
    private Instalazioa instalazioa;
    private String data;
    private String ordua;
    private String oharra;

    public Alokairua() {
    }

    public Alokairua(String bezeroId, Instalazioa instalazioa, String data, String ordua) {
        this.bezeroId = bezeroId;
        this.instalazioa = instalazioa;
        this.data = data;
        this.ordua = ordua;
    }

    public Alokairua(String bezeroId, Instalazioa instalazioa, String data, String ordua, String oharra) {
        this.bezeroId = bezeroId;
        this.instalazioa = instalazioa;
        this.data = data;
        this.ordua = ordua;
        this.oharra = oharra;
    }

    public String getBezeroId() {
        return this.bezeroId;
    }

    public void setBezeroId(String bezeroId) {
        this.bezeroId = bezeroId;
    }

    public Instalazioa getInstalazioa() {
        return this.instalazioa;
    }

    public void setInstalazioa(Instalazioa instalazioa) {
        this.instalazioa = instalazioa;
    }

    public String getOrdua() {
        return this.ordua;
    }

    public void setOrdua(String ordua) {
        this.ordua = ordua;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
        public String getOharra() {
        return this.oharra;
    }

    public void setOharra(String oharra) {
        this.oharra = oharra;
    }
}
