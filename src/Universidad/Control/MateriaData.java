package Universidad.Control;

import Universidad.Modelo.*;
import java.sql.*;
import java.util.*;

public class MateriaData {
    private Connection conexion;
    
    public MateriaData(Conexion conexion){
        try {
            this.conexion = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
    }
    
    public void guardarMateria(Materia materia){
        String comandoSql = "INSERT INTO materia (nombre, anio, activo) "
                + "VALUES (?,?,?)";
        
        PreparedStatement  prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql, Statement.RETURN_GENERATED_KEYS);
            
            prepStat.setString(1, materia.getNombre());
            prepStat.setInt(2, materia.getAnio());
            prepStat.setBoolean(3, materia.isActivo());
            
            prepStat.executeUpdate();
            
            ResultSet resultSet = prepStat.getGeneratedKeys();
            
            if (resultSet.next()){
                materia.setIdMateria(resultSet.getInt("idMateria"));
            }
            
            prepStat.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar");
        }
    }
    
    public void actualizarMateria(Materia materia){
        String comandoSql = "UPDATE materia "
                + "SET nombre=?, anio=?, activo=? WHERE idMateria=?";
        
        PreparedStatement prepStat;
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setString(1, materia.getNombre());
            prepStat.setInt(2, materia.getAnio());
            prepStat.setBoolean(3, materia.isActivo());
            
            prepStat.setInt(4, materia.getIdMateria());
            
            prepStat.executeUpdate();
            prepStat.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar");
        }
    }
    
    public Materia buscarMateria(int id){
        String comandoSql = "SELECT * FROM materia WHERE idMateria=?";
        Materia materia = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setInt(1, id);
            ResultSet resultSet = prepStat.executeQuery();
            
            if (resultSet.next()){
                materia = new Materia();
                
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnio(resultSet.getInt("anio"));
                materia.setActivo(resultSet.getBoolean("activo"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar");
        }
        
        return materia;
    }
    
    public List<Materia> obtenerMaterias(){
        String comandoSql = "SELECT * FROM materia";
        List<Materia> materias = new ArrayList<>();
        Materia materia = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            ResultSet resultSet = prepStat.executeQuery();
            
            while (resultSet.next()){
                materia = new Materia();
                
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnio(resultSet.getInt("anio"));
                materia.setActivo(resultSet.getBoolean("activo"));
                
                materias.add(materia);
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo obtener materias");
        }
        
        return materias;
    }
}
