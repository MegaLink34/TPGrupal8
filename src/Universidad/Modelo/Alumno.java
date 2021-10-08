package Universidad.Modelo;

import java.time.LocalDate;

public class Alumno {
    
    private int idAlumno;
    private int legajo;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean activo;

    
    /* CONSTRUCTORES */
    
    public Alumno() {
    }

    public Alumno(int legajo, String nombre, String apellido, LocalDate fechaNac, boolean activo) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }
    
    /* GETTERS */

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", activo=" + activo + '}';
    }
    
    /* SETTERS */
    
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNacimiento) {
        this.fechaNac = fechaNacimiento;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
