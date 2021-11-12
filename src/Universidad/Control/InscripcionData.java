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
    
    public void guardarCursada(int idA, int idM){
        String sql="INSERT INTO inscripcion (idAlumno,idMateria) VALUES (?,?)";       
        try {
            PreparedStatement prepStat = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStat.setInt(1, idA);
            prepStat.setInt(2, idM);
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            prepStat.close();
        } catch (SQLException ex) {
            System.out.println("Error al Guardar" + ex);
            
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
    
    public List<Materia> obtenerMateriasInscriptas(int id){ // Mauri
        ArrayList<Materia> lm = new ArrayList<>();
        Materia m;
        String sql= ("SELECT m.idMateria, m.nombre, m.anio, m.activo FROM inscripcion AS c, materia as m WHERE c.idMateria = m.idMateria AND idAlumno=?");
        try {
            PreparedStatement ps= conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                m = new Materia();
                m.setIdMateria(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                m.setActivo(rs.getBoolean("activo"));
                lm.add(m);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion en metodo obtenerMateriasCursadas.");
        }
        return lm;
    }
    
    public float buscarNotaInscripcion(int idA ,int idM){
       int resul=0; 
       String sql="SELECT `nota` FROM `inscripcion` WHERE idAlumno=? and idMateria=?";     
        try {
            PreparedStatement ps= conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idA);
            ps.setInt(2, idM);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
            resul=rs.getInt("nota");}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al buscar nota Inscripcion.");
        }
        return resul;
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> li = new ArrayList<>();
        Inscripcion i;
        String sql="SELECT * FROM inscripcion";
        try {
            PreparedStatement ps= conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                i = new Inscripcion();
                Alumno a = buscarAlumno(rs.getInt("idAlumno"));
                Materia m = buscarMateria(rs.getInt("idMateria"));
                i.setAlumno(a);
                i.setMateria(m);
                i.setNota(rs.getInt("nota"));
                i.setIdInscripcion(rs.getInt("idInsc"));
                li.add(i);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al obtener Inscripciones.");
        }
        return li;
    
    }
    
    public void borrarInscripcionDeUnaMateria(int idA, int idM){
        String sql="DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";     
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idA);
            ps.setInt(2, idM);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion InscripcionData.");
        }
    }
    
    public List <Inscripcion> obtenerInscripcionxAlumno(int id){
        ArrayList <Inscripcion> li = new ArrayList<>();
        Inscripcion i;
        String sql="SELECT * FROM inscripcion WHERE idAlumno=?";
        try {
            PreparedStatement ps= conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                i = new Inscripcion();
                Alumno a = buscarAlumno(rs.getInt("idAlumno"));
                Materia m = buscarMateria(rs.getInt("idMateria"));
                i.setAlumno(a);
                i.setMateria(m);
                i.setNota(rs.getFloat("nota"));
                i.setIdInscripcion(rs.getInt("idInsc"));
                li.add(i);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al obtener Inscripcion por Alumno." + ex);
        }
        return li;
    }
    
    public void actualizarNotaInscripcion(int idA ,int idM, double nota){
        String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";     
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, nota);
            ps.setInt(2, idA);
            ps.setInt(3, idM);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion al actualizar Nota Inscripcion.");
        }
    }
}

