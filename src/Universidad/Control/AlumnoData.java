package Universidad.Control;

import Universidad.Modelo.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnoData {
    private Connection conexion;

    public AlumnoData(Conexion conexion) {
        
        try {
            this.conexion = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
        
    }
    
    public void guardarAlumno(Alumno alumno){
        String comandoSql = "INSERT INTO alumno (legajo, nombre, apellido, "
                + "fechNac, activo) VALUES (?,?,?,?,?)";
        
        PreparedStatement prepStat;
        System.out.println("guardar alumno: " + alumno);
        try {
            prepStat = conexion.prepareStatement(comandoSql, Statement.RETURN_GENERATED_KEYS);
            
            prepStat.setInt(1, alumno.getLegajo());
            prepStat.setString(2, alumno.getNombre());
            prepStat.setString(3, alumno.getApellido());
            prepStat.setDate(4, Date.valueOf(alumno.getFechaNac()));
            prepStat.setBoolean(5, alumno.isActivo());
            
            prepStat.executeUpdate();
            ResultSet resultSet = prepStat.getGeneratedKeys(); //recupero el Id
            
            if (resultSet.next()){
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
            }
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar");
        }
    }
    
    public void activarAlumno(int id){
        String comandoSql = "UPDATE alumno activo=? WHERE idAlumno=?";
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setBoolean(1, true);
            
            prepStat.setInt(2, id);
            
            prepStat.executeUpdate();
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al activar");
        }
    }
    
    public void desactivarAlumno(int id){
        String comandoSql = "UPDATE alumno activo=? WHERE idAlumno=?";
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setBoolean(1, false);
            
            prepStat.setInt(2, id);
            
            prepStat.executeUpdate();
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al desactivar");
        }
    }
    
    public void actualizarAlumno(Alumno alumno) {
        String comandoSql = "UPDATE alumno " +
                "SET legajo=?,nombre=?,apellido=?,fechNac=?, activo=? WHERE idAlumno=?";
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setInt(1, alumno.getLegajo());
            prepStat.setString(2, alumno.getNombre());
            prepStat.setString(3, alumno.getApellido());
            prepStat.setDate(4, Date.valueOf(alumno.getFechaNac()));
            if(alumno.isActivo()){
                prepStat.setInt(5, 1);
            }else{
                prepStat.setInt(5, 0);
            }
            prepStat.setInt(6, alumno.getIdAlumno());
            
            System.out.println("prerp act alumno: " + prepStat);
            prepStat.executeUpdate();
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar");
        }
    }
    
    public Alumno buscarAlumno(int id){
        String comandoSql = "SELECT * FROM alumno WHERE idAlumno=?";
        Alumno alumno = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setInt(1, id);
            ResultSet resultSet = prepStat.executeQuery();
            
            if (resultSet.next()){
                alumno = new Alumno();
                
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setLegajo(resultSet.getInt("legajo"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setFechaNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar");
        }
        
        return alumno;
    }
    
    public List<Alumno> obtenerAlumnos(){
        String comandoSql = "SELECT * FROM alumno";
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            ResultSet resultSet = prepStat.executeQuery();
            
            while (resultSet.next()){
                
                alumno = new Alumno();
                
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setLegajo(resultSet.getInt("legajo"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setFechaNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));
                
                alumnos.add(alumno);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar");
        }
        
        return alumnos;
    }
    
    public List<Alumno> obtenerAlumnosActivos(){
        String comandoSql = "SELECT * FROM alumno WHERE activo=true";
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            ResultSet resultSet = prepStat.executeQuery();
            
            while (resultSet.next()){
                
                alumno = new Alumno();
                
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setLegajo(resultSet.getInt("legajo"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setFechaNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));
                
                alumnos.add(alumno);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar");
        }
        
        return alumnos;
    }
    
    public void borrarAlumno(int id){
        String comandoSql = "DELETE * FROM alumno WHERE idAlumno=?";
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setInt(1, id);
            
            prepStat.executeUpdate();
            
            prepStat.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar Alumno");
        }
    }
}
