/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import Controlador.MasConsultas;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author pablo
 */
@WebService(serviceName = "otrowebservice")
public class otrowebservice {

    @WebMethod(operationName = "ELIMINARESTADODELCOMENTARIO")
    public boolean ELIMINARESTADODELCOMENTARIO(@WebParam(name = "Estado") int Estado) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarEstadoDeComentario(Estado);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARESTADODEFINITIVO")
    public boolean ELIMINARESTADODEFINITIVO(@WebParam(name = "Estado") int Estado) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarEstadoDefinitivo(Estado);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARCOMENTARIO")
    public boolean ELIMINARCOMENTARIO(@WebParam(name = "Comentario") int Comentario) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarComentario(Comentario);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARUSPROY")
    public boolean ELIMINARUSPROY(@WebParam(name = "Proyecto") int Proyecto) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarUSPROY(Proyecto);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARPROYLISTATAREA")
    public boolean ELIMINARPROYLISTATAREA(@WebParam(name = "Proyecto") int Proyecto) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarPROYLISTATAREA(Proyecto);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARPROYECTO")
    public boolean ELIMINARPROYECTO(@WebParam(name = "Proyecto") int Proyecto) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarProyecto(Proyecto);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARUSTAR")
    public boolean ELIMINARUSTAR(@WebParam(name = "Tarea") int Tarea) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarUSTAR(Tarea);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARTARLISTATAREA")
    public boolean ELIMINARTARLISTATAREA(@WebParam(name = "Tarea") int Tarea) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarTARLISTATAREA(Tarea);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ELIMINARTAREA")
    public boolean ELIMINARTAREA(@WebParam(name = "Tarea") int Tarea) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.eliminarTarea(Tarea);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "CREARBACKUPEYC")
    public boolean CREARBACKUPEYC() {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.crearBackupEyC();
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
}
