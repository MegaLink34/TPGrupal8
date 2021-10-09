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
    
    public void actualizarAlumno(Alumno alumno) {
        String comandoSql = "UPDATE alumno " +
                "SET legajo=?,nombre=?,apellido=?,fechNac=?,activo=? WHERE idAlumno=?";
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setInt(1, alumno.getLegajo());
            prepStat.setString(2, alumno.getNombre());
            prepStat.setString(3, alumno.getApellido());
            prepStat.setDate(4, Date.valueOf(alumno.getFechaNac()));
            prepStat.setBoolean(5, alumno.isActivo());
            
            prepStat.setInt(6, alumno.getIdAlumno());
            
            prepStat.executeUpdate();
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar");
        }
    }
    
    public void modificarEstado(int id){ //////// MAURI MAKED THIS
        String sql="UPDATE `alumno` SET `activo`=? WHERE `idAlumno`=?";
        try {
            PreparedStatement prepStat = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Alumno a = this.buscarAlumno(id);
            prepStat.setBoolean(1, !a.isActivo());
            prepStat.setInt(2, id);
            prepStat.executeUpdate();
            prepStat.close();   
        } catch (SQLException ex) {
            System.out.println("Error de conexion en modificar Estado");
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
}
