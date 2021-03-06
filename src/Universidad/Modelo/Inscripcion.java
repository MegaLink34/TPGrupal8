package Universidad.Modelo;

public class Inscripcion {
    private int idInscripcion;
    private Materia materia;
    private Alumno alumno;
    private Usuario user;
    private double nota;
    private boolean activo;
    
    public Inscripcion(){}

    public Inscripcion(Materia materia, Alumno alumno) {
        this.materia = materia;
        this.alumno = alumno;
    }

    public Inscripcion(Materia materia, Alumno alumno, double nota, boolean activo) {
        this.materia = materia;
        this.alumno = alumno;
        this.nota = nota;
        this.activo = activo;
    }
    
    /* GETTERS */

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public Materia getMateria() {
        return materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Usuario getUser() {
        return user;
    }

    public double getNota() {
        return nota;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", materia=" + materia + ", alumno=" + alumno + ", nota=" + nota + ", activo=" + activo + '}';
    }
    
    /* SETTERS */

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Inscripcion(int idInscripcion, Materia materia, Alumno alumno, Usuario user, double nota, boolean activo) {
        this.idInscripcion = idInscripcion;
        this.materia = materia;
        this.alumno = alumno;
        this.user = user;
        this.nota = nota;
        this.activo = activo;
    }
}
