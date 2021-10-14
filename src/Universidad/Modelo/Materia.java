package Universidad.Modelo;


public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;
    private boolean activo;
    
    public Materia(){}
    
    public Materia(int id, String nombre, int anio, boolean activo) {
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
        this.idMateria = id;
    }

    public Materia(String nombre, int anio, boolean activo) {
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }
    
    /* GETTERS */

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anio=" + anio + ", activo=" + activo + '}';
    }
    
    /* SETTERS */

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
