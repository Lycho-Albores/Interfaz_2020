
package clases;


public class TipoTransaccion {
    
    private int idtipotransaccion;
    private String clavetipotransaccion;
    private String descripcion;
    private int opcion;

    public void setIdtipotransaccion(int idtipotransaccion) {
        this.idtipotransaccion = idtipotransaccion;
    }

    public void setClavetipotransaccion(String clavetipotransaccion) {
        this.clavetipotransaccion = clavetipotransaccion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getIdtipotransaccion() {
        return (this.idtipotransaccion);
    }

    public String getClavetipotransaccion() {
        return (this.clavetipotransaccion);
    }

    public String getDescripcion() {
        return (this.descripcion);
    }

    public int getOpcion() {
        return (this.opcion);
    }
    
}
