package Controlador;


import Controlador.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
            pst.setString(5, correo);
            pst.setString(6, contraseña);
            
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
    
    public int obtenerID(String usuario){
    
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            
            String consulta = "select * from USUARIO where USERNAME = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,usuario);
            rs = pst.executeQuery();
            int id = 0;
            
            if (rs.absolute(1)) {
                
                id = rs.getInt("ID_US");
                return id;
                
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
        return 0;
    }
    
    public boolean estado(String mensaje, int id_us){
    
        PreparedStatement pst = null;
        
        try {
            
            String consulta = "insert into ESTADO (MENSAJE, ID_US) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, mensaje);
            pst.setInt(2, id_us);
            
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
    
    public boolean comentario(String mensaje, int id_us, int id_est){
    
        PreparedStatement pst = null;
        
        try {
            
            String consulta = "insert into COMENTARIO (MENSAJE, ID_US, ID_EST) values (?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, mensaje);
            pst.setInt(2, id_us);
            pst.setInt(3, id_est);
            
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
    
    public int obtenerIDEST(String estado){
    
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            
            String consulta = "select * from ESTADO where MENSAJE = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,estado);
            rs = pst.executeQuery();
            int id = 0;
            
            if (rs.absolute(1)) {
                
                id = rs.getInt("ID_EST");
                return id;
                
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
        return 0;
    }
    
    public String mostrarEstados(){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            
            String consulta = "select u.USERNAME, e.MENSAJE from estado e, usuario u where e.ID_US = u.ID_US";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {
                
                resultado = /*rs.getString("u.USERNAME") + " dice: " + */rs.getString("e.MENSAJE") + "\n\n ";
                
            }
            
            return resultado;
            
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
        return "No se encontraron resultados";
    }
}
