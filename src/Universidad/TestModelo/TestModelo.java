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
            /* Chicos, ayudenme a ver un error medio raro, en la inscripción, el id de alumno y el id
            de materia se guardan con el mismo valor */
            
            Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
            Alumno alumno = new Alumno(6, 1006, "Gabriel", "Giménez", LocalDate.of(1989,06,07), true);
            Materia materia = new Materia(11, "Francés", 4, true);
            Inscripcion inscripcion = new Inscripcion(materia, alumno, 7);
            
            AlumnoData alumnoData = new AlumnoData(conexion);
            alumnoData.guardarAlumno(alumno);
            System.out.println(alumnoData.buscarAlumno(6));
            
            MateriaData materiaData = new MateriaData(conexion);
            materiaData.guardarMateria(materia);
            System.out.println(materiaData.buscarMateria(11));
            
            InscripcionData insDat = new InscripcionData(conexion);
            
<<<<<<< Updated upstream
            AlumnoData alumnoData = new AlumnoData(conexion);
            Alumno alumno = new Alumno(1003, "Adriel Iván", "Gómez", LocalDate.of(1989,06,07), true);
=======
            insDat.guardarCursada(inscripcion);
            
            
            //System.out.println(alumnoData.buscarAlumno(1));
            /*
>>>>>>> Stashed changes
            alumnoData.buscarAlumno(1);
            alumnoData.obtenerAlumnos();
            alumnoData.obtenerAlumnos();
            alumnoData.actualizarAlumno(alumno);
            
            Materia materia = new Materia("Web", 1, true);
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
