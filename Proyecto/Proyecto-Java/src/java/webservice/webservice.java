/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import Controlador.Consultas;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author pablo
 */
@WebService(serviceName = "webservice")
public class webservice {

    @WebMethod(operationName = "IniciarSesion")
    public boolean IniciarSesion(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contra") String Contra) {
        Consultas consultas = new Consultas();
        try {
            return consultas.autenticacion(Usuario, Contra);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "Registrarse")
    public boolean Registrarse(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Apellido") String Apellido, @WebParam(name = "Nacimiento") String Nacimiento, @WebParam(name = "Correo") String Correo, @WebParam(name = "Contra") String Contra) {
        Consultas consultas = new Consultas();
        try {
            return consultas.registrar(Usuario, Nombre, Apellido, Nacimiento, Correo, Contra);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "obtenerIDUS")
    public int obtenerIDUS(@WebParam(name = "Usuario") String Usuario) {
        Consultas consultas = new Consultas();
        try {
            return consultas.obtenerID(Usuario);
        } catch (Exception e) {
        
            return 0;        
        }        
        
    }
    
    @WebMethod(operationName = "PublicarEstado")
    public boolean PublicarEstado(@WebParam(name = "Mensaje") String Mensaje, @WebParam(name = "IdUs") int IdUs){
        Consultas consultas = new Consultas();
        try {
            return consultas.estado(Mensaje, IdUs);
        } catch (Exception e) {
        
            return false;        
        }
    }
    
    @WebMethod(operationName = "PublicarComentario")
    public boolean PublicarComentario(@WebParam(name = "Mensaje") String Mensaje, @WebParam(name = "IdUs") int IdUs, @WebParam(name = "IdEst") int IdEst){
        Consultas consultas = new Consultas();
        try {
            return consultas.comentario(Mensaje, IdUs, IdEst);
        } catch (Exception e) {
        
            return false;        
        }
    }
    
    @WebMethod(operationName = "obtenerIDEst")
    public int obtenerIDEst(@WebParam(name = "Mensaje") String Mensaje) {
        Consultas consultas = new Consultas();
        try {
            return consultas.obtenerIDEST(Mensaje);
        } catch (Exception e) {
        
            return 0;        
        }        
        
    }
    
    @WebMethod(operationName = "desplegarUS")
    public String desplegarUS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.mostrarEstadosUsuario();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "desplegarEstados")
    public String desplegarEstados() {
        Consultas consultas = new Consultas();
        try {
            return consultas.mostrarEstados();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "BackupUsuarios")
    public boolean BackupUsuarios() {
        Consultas consultas = new Consultas();
        try {
            return consultas.crearBackupU();
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "BackupAso")
    public boolean BackupAso() {
        Consultas consultas = new Consultas();
        try {
            return consultas.crearBackupA();
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
}
