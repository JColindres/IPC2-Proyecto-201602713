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
}
