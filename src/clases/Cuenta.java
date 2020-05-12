
package clases;

import java.util.Date;


public class Cuenta {
    
    private int idcuenta;
    private int numcuenta;
    private Date fechaapertura;
    private int numtarjeta;
    private float saldoinicial;
    private String referencia;
    private int idcliente;
    private String clavetipocuenta;
    private String idusuario;

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setFechaapertura(Date fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public void setNumtarjeta(int numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public void setSaldoinicial(float saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public void setClavetipocuenta(String clavetipocuenta) {
        this.clavetipocuenta = clavetipocuenta;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdcuenta() {
        return (this.idcuenta);
    }

    public int getNumcuenta() {
        return (this.numcuenta);
    }

    public Date getFechaapertura() {
        return (this.fechaapertura);
    }

    public int getNumtarjeta() {
        return (this.numtarjeta);
    }

    public float getSaldoinicial() {
        return (this.saldoinicial);
    }

    public String getReferencia() {
        return (this.referencia);
    }

    public int getIdcliente() {
        return (this.idcliente);
    }

    public String getClavetipocuenta() {
        return (this.clavetipocuenta);
    }

    public String getIdusuario() {
        return (this.idusuario);
    }
    
}
