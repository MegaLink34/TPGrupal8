/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.Control;

import Universidad.Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InscripcionData {
    
    private Connection conexion; 
    private Conexion conex;
    
    public InscripcionData(Conexion con){
        try {
            this.conex =  con;
            this.conexion =  con.getConexion();
        }catch (SQLException ex) {
            System.out.println("Error de conexion.");
        }
    }
    
    public void guardarCursada(Inscripcion c){
        String sql="INSERT INTO inscripcion (idAlumno,idMateria,nota) VALUES (?,?,?)";       
        try {
            PreparedStatement prepStat = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStat.setInt(1, c.getAlumno().getIdAlumno());
            prepStat.setInt(2, c.getMateria().getIdMateria());
            prepStat.setDouble(3, c.getNota());
            prepStat.executeUpdate();
            ResultSet rs = prepStat.getGeneratedKeys();
            if(rs.next()){
                c.setIdInscripcion(rs.getInt(1));
                System.out.println("Inscripcion exitosa");
            }
            prepStat.close();
        } catch (SQLException ex) {
            System.out.println("Error al Guardar");
        }  
    }
    
    public Inscripcion buscarInscripcion(int id){
        String comandoSql="SELECT inscripcion.id, alumno.apellido, alumno.nombre, "
                + "materia.nombre, inscripcion.nota "
                + "FROM inscripcion, alumno, materia WHERE inscripcion.idAlumno = alumno.idAlumno"
                + "AND inscripcion.idMateria = materia.idMateria AND idInscripcion=?";
        Inscripcion inscripcion = new Inscripcion();
        Alumno alumno;
        Materia materia;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            prepStat.setInt(1, id);

            ResultSet rs = prepStat.executeQuery();
            
               if(rs.next()) {
                   inscripcion = new Inscripcion();
                   
                   alumno = buscarAlumno(rs.getInt("idAlumno"));
                   materia = buscarMateria(rs.getInt("idMateria"));
                   inscripcion.setAlumno(alumno);
                   inscripcion.setMateria(materia);
                   inscripcion.setNota(rs.getDouble("nota"));
               }
               
               prepStat.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return inscripcion;
    }
    
    public List<Inscripcion> obtenerInscripcionesMateria(int id){
        ArrayList<Inscripcion> listaMaterias = new ArrayList<>();
        String comandoSql = "SELECT * FROM inscripcion,alumno,materia WHERE "
                + "inscripcion.idAlumno=alumno.idAlumno and "
                + "inscripcion.idMateria=materia.idMateria and materia.idMateria = ?";
        Inscripcion inscripcion;
        Alumno alumno;
        Materia materia;
        
            try {
               PreparedStatement ps = conexion.prepareStatement(comandoSql);

               ps.setInt(1, id);

               ResultSet rs = ps.executeQuery();

               while (rs.next()) {
                   inscripcion = new Inscripcion();
                   alumno = buscarAlumno(rs.getInt("idAlumno"));
                   materia = buscarMateria(rs.getInt("idMateria"));
                   inscripcion.setAlumno(alumno);
                   inscripcion.setMateria(materia);
                   inscripcion.setNota(rs.getDouble("nota"));

                   listaMaterias.add(inscripcion);
               }
               
               ps.close();

           } catch (SQLException ex) {
               System.out.println("Error en buscar");
           }

        return listaMaterias;
    }
    
    public List<Inscripcion> obtenerInscripcionesMateriaActivas(int id){
        ArrayList<Inscripcion> listaMaterias = new ArrayList<>();
        String comandoSql = "SELECT * FROM inscripcion,alumno,materia WHERE "
                + "inscripcion.idAlumno=alumno.idAlumno and "
                + "inscripcion.idMateria=materia.idMateria AND activo = true and materia.idMateria = ?";
        Inscripcion inscripcion;
        Alumno alumno;
        Materia materia;
        
            try {
               PreparedStatement ps = conexion.prepareStatement(comandoSql);

               ps.setInt(1, id);

               ResultSet rs = ps.executeQuery();

               while (rs.next()) {
                   inscripcion = new Inscripcion();
                   alumno = buscarAlumno(rs.getInt("idAlumno"));
                   materia = buscarMateria(rs.getInt("idMateria"));
                   inscripcion.setAlumno(alumno);
                   inscripcion.setMateria(materia);
                   inscripcion.setNota(rs.getDouble("nota"));

                   listaMaterias.add(inscripcion);
               }
               
               ps.close();

           } catch (SQLException ex) {
               System.out.println("Error en buscar");
           }

        return listaMaterias;
    }
    
    public List<Inscripcion> obtenerInscripcionesAlumnos(int id){
        ArrayList<Inscripcion> listaMaterias = new ArrayList<>();
        String comandoSql = "SELECT * FROM inscripcion,alumno,materia WHERE "
                + "inscripcion.idAlumno=alumno.idAlumno and "
                + "inscripcion.idMateria=materia.idMateria and alumno.idAlumno = ?";
        Inscripcion inscripcion;
        Alumno alumno;
        Materia materia;
        
            try {
               PreparedStatement ps = conexion.prepareStatement(comandoSql);

               ps.setInt(1, id);

               ResultSet rs = ps.executeQuery();

               while (rs.next()) {
                   inscripcion = new Inscripcion();
                   alumno = buscarAlumno(rs.getInt("idAlumno"));
                   materia = buscarMateria(rs.getInt("idMateria"));
                   inscripcion.setAlumno(alumno);
                   inscripcion.setMateria(materia);
                   inscripcion.setNota(rs.getDouble("nota"));

                   listaMaterias.add(inscripcion);
               }
               
               ps.close();

           } catch (SQLException ex) {
               System.out.println("Error en buscar");
           }

        return listaMaterias;
    }
    
    public List<Inscripcion> obtenerInscripcionesAlumnosActivos(int id){
        ArrayList<Inscripcion> listaMaterias = new ArrayList<>();
        String comandoSql = "SELECT * FROM inscripcion,alumno,materia WHERE "
                + "inscripcion.idAlumno=alumno.idAlumno and "
                + "inscripcion.idMateria=materia.idMateria AND activo = true and alumno.idAlumno = ?";
        Inscripcion inscripcion;
        Alumno alumno;
        Materia materia;
        
            try {
               PreparedStatement ps = conexion.prepareStatement(comandoSql);

               ps.setInt(1, id);

               ResultSet rs = ps.executeQuery();

               while (rs.next()) {
                   inscripcion = new Inscripcion();
                   alumno = buscarAlumno(rs.getInt("idAlumno"));
                   materia = buscarMateria(rs.getInt("idMateria"));
                   inscripcion.setAlumno(alumno);
                   inscripcion.setMateria(materia);
                   inscripcion.setNota(rs.getDouble("nota"));

                   listaMaterias.add(inscripcion);
               }
               
               ps.close();

           } catch (SQLException ex) {
               System.out.println("Error en buscar");
           }

        return listaMaterias;
    }

    public Alumno buscarAlumno(int id) {
        AlumnoData ad = new AlumnoData(conex);

        return ad.buscarAlumno(id);
    }

    public Materia buscarMateria(int id) {
        MateriaData ad = new MateriaData(conex);

        return ad.buscarMateria(id);
    }
}
