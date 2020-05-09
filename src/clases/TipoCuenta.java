
package clases;


public class TipoCuenta {
    
    private int idtipocuenta;
    private String clavetipocuenta;
    private String descripcion;
    private int opcion;

    public void setIdtipocuenta(int idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }

    public void setClavetipocuenta(String clavetipocuenta) {
        this.clavetipocuenta = clavetipocuenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getIdtipocuenta() {
        return (this.idtipocuenta);
    }

    public String getClavetipocuenta() {
        return (this.clavetipocuenta);
    }

    public String getDescripcion() {
        return (this.descripcion);
    }

    public int getOpcion() {
        return (this.opcion);
    }
    
}
