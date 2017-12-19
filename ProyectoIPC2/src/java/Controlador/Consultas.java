package Controlador;


import Controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class Consultas extends Conexion{
    
    public boolean autenticacion(String usuario, String contraseña){
    
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            
            String consulta = "select * from USUARIO where USERNAME = ? and CONTRASEÑA = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if (rs.absolute(1)) {
                
                return true;
                
            }
            
        } catch (Exception e) {
            
            System.err.println("Error"+e);
            
        } finally{
        
            try {
                
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
                
            } catch (Exception e) {
            
                System.err.println("Error"+e);
                
            }
            
        }
        return false;
    }
    
    public boolean registrar(String usuario, String nombre, String apellido, String nacimiento, String correo, String contraseña){
    
        PreparedStatement pst = null;
        
        try {
            
            String consulta = "insert into USUARIO (USERNAME, NOMBRE, APELLIDO, NACIMIENTO, CORREO, CONTRASEÑA) values (?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, nacimiento);
            pst.setString(5, contraseña);
            pst.setString(6, usuario);
            
            if(pst.executeUpdate() == 1){
            
                return true;
            }
            
        } catch (Exception e) {
            
            System.err.println("Error"+e);
            
        } finally{
        
            try {
                
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                
            } catch (Exception e) {
            
                System.err.println("Error"+e);
                
            }
        
        }
        
        return false;
    }
    
}
