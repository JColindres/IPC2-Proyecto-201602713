/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice.ws;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author pablo
 */
@WebService(serviceName = "webservice")
public class webservice  extends Conexion{

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public String suma(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
        //TODO write your implementation code here:
        return String.valueOf(parameter1 + parameter2);
    }
    
    @WebMethod(operationName = "autenticacion")
    public boolean autenticacion(@WebParam(name = "usuario") String usuario, @WebParam(name = "contraseña") String contraseña){
    
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
    
    @WebMethod(operationName = "registrar")
    public boolean registrar(@WebParam(name = "usuario") String usuario, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "nacimiento") String nacimiento, @WebParam(name = "correo") String correo, @WebParam(name = "contraseña") String contraseña){
    
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

