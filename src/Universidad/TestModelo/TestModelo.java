package Universidad.TestModelo;

import Universidad.Control.*;
import Universidad.Modelo.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import Universidad.Modelo.*;
import java.time.LocalDate;

public class TestModelo {
    
    public static void main(String[] args) {
        
        try {
            Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
            
            AlumnoData alumnoData = new AlumnoData(conexion);
            Alumno alumno = new Alumno(1003, "Adriel Iván", "Gómez", LocalDate.of(1989,06,07), true);
            alumnoData.buscarAlumno(1);
            alumnoData.obtenerAlumnos();
            alumnoData.guardarAlumno(alumno);
            alumnoData.obtenerAlumnos();
            alumnoData.actualizarAlumno(alumno);
            
            MateriaData materiaData = new MateriaData(conexion);
            Materia materia = new Materia("Web", 1, true);
            materiaData.guardarMateria(materia);
            materia = new Materia("Matemática", 1, true);
            materiaData.guardarMateria(materia);
            materiaData.buscarMateria(1);
            materiaData.obtenerMaterias();
            materiaData.actualizarMateria(materia);
            materiaData.obtenerMaterias();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
