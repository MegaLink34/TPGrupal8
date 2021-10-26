
package Universidad.Modelo;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String passwordUsuario;
    private int rolUsuario;
    private boolean activo;
    
    public Usuario() {
    }

    public Usuario(String nombreUsuario, String passwordUsuario, int rolUsuario, boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.rolUsuario = rolUsuario;
        this.activo = activo;
    }
    
    public Usuario(int id, String nombreUsuario, String passwordUsuario, int rolUsuario, boolean activo) {
        this.idUsuario = id;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.rolUsuario = rolUsuario;
        this.activo = activo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public int getRolUsuario() {
        return rolUsuario;
    }
    
    public boolean isActivoUsuario() {
        return activo;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", passwordUsuario=" + passwordUsuario + ", rolUsuario=" + rolUsuario + ", activo=" + activo + '}';
    }
        
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public void setRolUsuario(int rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    
    public void setActivoUsuario(boolean activo) {
        this.activo = activo;
    }
}
