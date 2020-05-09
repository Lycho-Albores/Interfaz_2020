
package clases;

import java.util.Date;


public class Movimiento {
    
    private int idmovimiento;
    private String folio;
    private int cuentadestino;
    private Date fecha;
    private String clavetipotransaccion;
    private String sucursal;
    private int numcuenta;
    private String referencia;
    private int opcion;

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public void setCuentadestino(int cuentadestino) {
        this.cuentadestino = cuentadestino;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setClavetipotransaccion(String clavetipotransaccion) {
        this.clavetipotransaccion = clavetipotransaccion;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getIdmovimiento() {
        return (this.idmovimiento);
    }

    public String getFolio() {
        return (this.folio);
    }

    public int getCuentadestino() {
        return (this.cuentadestino);
    }

    public Date getFecha() {
        return (this.fecha);
    }

    public String getClavetipotransaccion() {
        return (this.clavetipotransaccion);
    }

    public String getSucursal() {
        return (this.sucursal);
    }

    public int getNumcuenta() {
        return (this.numcuenta);
    }

    public String getReferencia() {
        return (this.referencia);
    }

    public int getOpcion() {
        return (this.opcion);
    }
    
}
