
package clases;


public class Usuario {
    
    private int idusuario;
    private String nombreusuario;
    private String contrasenia;
    private int opcion;

    public Usuario() {
        
    }

    public Usuario(int idusuario, String nombreusuario, String contrasenia) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.contrasenia = contrasenia;
    }

    public void setIdUsuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setNombreUsuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getIdUsuario() {
        return (this.idusuario);
    }

    public String getNombreUsuario() {
        return (this.nombreusuario);
    }

    public String getContrasenia() {
        return (this.contrasenia);
    }

    public int getOpcion() {
        return (this.opcion);
    }
    
}
