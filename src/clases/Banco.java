
package clases;


public class Banco {
    
    private int idbanco;
    private String nombre;
    private String sucursal;
    private String direccion;
    private int opcion;

    public Banco(int idbanco, String nombre, String sucursal, String direccion) {
        this.idbanco = idbanco;
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public void setIdbanco(int idbanco) {
        this.idbanco = idbanco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getIdbanco() {
        return (this.idbanco);
    }

    public String getNombre() {
        return (this.nombre);
    }

    public String getSucursal() {
        return (this.sucursal);
    }

    public String getDireccion() {
        return (this.direccion);
    }

    public int getOpcion() {
        return opcion;
    }
    
}
