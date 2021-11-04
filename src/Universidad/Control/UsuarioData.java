
package Universidad.Control;

import Universidad.Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioData {
    private Connection conexion;

    public UsuarioData(Conexion conexion) {
        
        try {
            this.conexion = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexión UsuarioData");
        }

    }
    
    public void guardarUsuario(Usuario usuario){
        String comandoSql = "INSERT INTO usuario (nombreUsuario, passwordUsuario, rolUsuario, activo) VALUES (?,?,?,?)";
        
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql, Statement.RETURN_GENERATED_KEYS);
            
            prepStat.setString(1, usuario.getNombreUsuario());
            prepStat.setString(2, usuario.getPasswordUsuario());
            prepStat.setInt(3, usuario.getRolUsuario());
            prepStat.setBoolean(4, usuario.isActivoUsuario());
            
            prepStat.executeUpdate();
            ResultSet resultSet = prepStat.getGeneratedKeys();

            if (resultSet.next()){
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
            }
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar" + ex);
        }
    }
    
    public void activarUsuario(int id){
        String comandoSql = "UPDATE alumno activo=? WHERE idAlumno=?";
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setBoolean(1, true);
            
            prepStat.setInt(2, id);
            
            prepStat.executeUpdate();
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al activar usuario");
        }
    }
    
    public void desactivarUsuario(int id){
        String comandoSql = "UPDATE alumno activo=? WHERE idAlumno=?";
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setBoolean(1, false);
            
            prepStat.setInt(2, id);
            
            prepStat.executeUpdate();
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al desactivar usuario");
        }
    }
    
    public void actualizarUsuario(Usuario usuario) {
        String comandoSql = "UPDATE usuario " +
                "SET nombreUsuario=?, passwordUsuario=?, rolUsuario=?, activo=? WHERE idUsuario=?";
        PreparedStatement prepStat;
        
        try {
            prepStat = conexion.prepareStatement(comandoSql);
            
            
            prepStat.setString(1, usuario.getNombreUsuario());
            prepStat.setString(2, usuario.getPasswordUsuario());
            prepStat.setInt(3, usuario.getRolUsuario());
            if(usuario.isActivoUsuario()){
                prepStat.setInt(3, 1);
            }else{
                prepStat.setInt(3, 0);
            }
            prepStat.setInt(4, usuario.getIdUsuario());
            
            prepStat.executeUpdate();
            
            prepStat.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar usuario");
        }
    }
    
    public Usuario buscarUsuario(int id){
        String comandoSql = "SELECT * FROM usuario WHERE idUsuario=?";
        Usuario usuario = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setInt(1, id);
            ResultSet resultSet = prepStat.executeQuery();
            
            if (resultSet.next()){
                usuario = new Usuario();
                
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setNombreUsuario(resultSet.getString("nombreUsuario"));
                usuario.setPasswordUsuario(resultSet.getString("passwordUsuario"));
                usuario.setRolUsuario(resultSet.getInt("rolUsuario"));
                usuario.setActivoUsuario(resultSet.getBoolean("activo"));
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario");
        }
        
        return usuario;
    }
    
    public Usuario buscarUsuario(String user, String pass){
        String comandoSql = "SELECT * FROM usuario WHERE nombreUsuario=? AND passwordUsuario=?";
        Usuario usuario = null;
        System.out.println("sql" + comandoSql);
        
        try {
            
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setString(1, user);
            prepStat.setString(2, pass);
            ResultSet resultSet = prepStat.executeQuery();
            
            if (resultSet.next()){
                usuario = new Usuario();
                
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setNombreUsuario(resultSet.getString("nombreUsuario"));
                usuario.setPasswordUsuario(resultSet.getString("passwordUsuario"));
                usuario.setRolUsuario(resultSet.getInt("rolUsuario"));
                usuario.setActivoUsuario(resultSet.getBoolean("activo"));
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario");
        }
        
        return usuario;
    }
    
    public Usuario buscarUsuario(String user){
        String comandoSql = "SELECT * FROM usuario WHERE nombreUsuario=?";
        Usuario usuario = null;
        System.out.println("sql" + comandoSql);
        
        try {
            
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setString(1, user);
            ResultSet resultSet = prepStat.executeQuery();
            
            if (resultSet.next()){
                usuario = new Usuario();
                
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setNombreUsuario(resultSet.getString("nombreUsuario"));
                usuario.setPasswordUsuario(resultSet.getString("passwordUsuario"));
                usuario.setRolUsuario(resultSet.getInt("rolUsuario"));
                usuario.setActivoUsuario(resultSet.getBoolean("activo"));
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario");
        }
        
        return usuario;
    }
    
    public List<Usuario> obtenerUsuarios(){
        String comandoSql = "SELECT * FROM usuario";
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            ResultSet resultSet = prepStat.executeQuery();
            
            while (resultSet.next()){
                
                usuario = new Usuario();
                
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setNombreUsuario(resultSet.getString("nombreUsuario"));
                usuario.setPasswordUsuario(resultSet.getString("passwordUsuario"));
                usuario.setRolUsuario(resultSet.getInt("rolUsuario"));
                usuario.setActivoUsuario(resultSet.getBoolean("activo"));
                                
                usuarios.add(usuario);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario");
        }
        
        return usuarios;
    }
    
    public List<Usuario> obtenerUsuariosActivos(){
        String comandoSql = "SELECT * FROM alumno WHERE activo=true";
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = null;
        
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            ResultSet resultSet = prepStat.executeQuery();
            
            while (resultSet.next()){
                
                usuario = new Usuario();
                
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setNombreUsuario(resultSet.getString("nombreUsuario"));
                usuario.setPasswordUsuario(resultSet.getString("passwordUsuario"));
                usuario.setRolUsuario(resultSet.getInt("rolUsuario"));
                usuario.setActivoUsuario(resultSet.getBoolean("activo"));
                                
                usuarios.add(usuario);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario");
        }
        
        return usuarios;
    }
    
    public void borrarUsuario(int id){
        String comandoSql = "DELETE FROM usuario WHERE idUsuario=?";
        try {
            PreparedStatement prepStat = conexion.prepareStatement(comandoSql);
            
            prepStat.setInt(1, id);
            System.out.println("asd " + prepStat);
            prepStat.executeUpdate();
            
            prepStat.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar Usuario");
        }
    }
}
