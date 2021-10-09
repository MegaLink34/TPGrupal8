/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.Control;

import Universidad.Modelo.Conexion;
import Universidad.Modelo.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InscripcionData {
    
    private Connection conexion; 
    
    public InscripcionData(Conexion con){
        try {
            this.conexion =  con.getConexion();
        }catch (SQLException ex) {
            System.out.println("Error de conexion.");
        }
    }
    
    public void guardarCursada(Inscripcion c){
        String sql="INSERT INTO Inscripcion (idAlumno,idMateria,nota) VALUES (?,?,?)";       
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
            System.out.println("Error de conexion.");
        }  
    }
}
