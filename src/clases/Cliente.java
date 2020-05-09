
package clases;

import java.util.Date;


public class Cliente {
    
    private int idcliente;
    private int numcliente;
    private String nombre;
    private String apellidopat;
    private String apellidomat;
    private String rfc;
    private Date fechanac;
    private String domicilio;
    private String telefono;
    private String email;
    private float ingresomensual;
    private String tipopersona;
    private int opcion;

    public Cliente(int idcliente, int numcliente, String nombre, String apellidopat, String apellidomat, String rfc, Date fechanac, String domicilio, String telefono, String email, float ingresomensual, String tipopersona) {
        this.idcliente = idcliente;
        this.numcliente = numcliente;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.rfc = rfc;
        this.fechanac = fechanac;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.ingresomensual = ingresomensual;
        this.tipopersona = tipopersona;
    }

    public void setIdCliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public void setIdcliente(int numcliente) {
        this.numcliente = numcliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidopat(String apellidopat) {
        this.apellidopat = apellidopat;
    }

    public void setApellidomat(String apellidomat) {
        this.apellidomat = apellidomat;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIngresomensual(float ingresomensual) {
        this.ingresomensual = ingresomensual;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getIdCliente() {
        return (this.idcliente);
    }

    public int getNumCliente() {
        return (this.numcliente);
    }

    public String getNombre() {
        return (this.nombre);
    }

    public String getApellidopat() {
        return (this.apellidopat);
    }

    public String getApellidomat() {
        return (this.apellidomat);
    }

    public String getRfc() {
        return (this.rfc);
    }

    public Date getFechanac() {
        return (this.fechanac);
    }

    public String getDomicilio() {
        return (this.domicilio);
    }

    public String getTelefono() {
        return (this.telefono);
    }

    public String getEmail() {
        return (this.email);
    }

    public float getIngresomensual() {
        return (this.ingresomensual);
    }

    public String getTipopersona() {
        return (this.tipopersona);
    }

    public int getOpcion() {
        return (this.opcion);
    }
    
}
