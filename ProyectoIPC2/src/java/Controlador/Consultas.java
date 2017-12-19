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
    
    public boolean registrar(String nombre, String correo, String nacimiento, String contraseña, String usuario){
    
        PreparedStatement pst = null;
        
        try {
            
            String consulta = "insert into USUARIO (NOMBRE, CORREO, NACIMIENTO, CONTRASEÑA, USERNAME) values (?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, correo);
            pst.setString(3, nacimiento);
            pst.setString(4, contraseña);
            pst.setString(5, usuario);
            
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
