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
    
    @WebMethod(operationName = "AGREGARCONOCIMIENTO")
    public boolean AGREGARCONOCIMIENTO(@WebParam(name = "conocimiento") String conocimiento) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.agregarConocimiento(conocimiento);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }    
        
    @WebMethod(operationName = "AGREGARHABILIDAD")
    public boolean AGREGARHABILIDAD(@WebParam(name = "hab") String hab, @WebParam(name = "con") int con) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.agregarHabilidad(hab, con);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "LISTACON")
    public String LISTACON() {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.ListaCon();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "OBTENERCON")
    public int OBTENERCON(@WebParam(name = "Nombre") String Nombre) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.obtenerConocimiento(Nombre);
        } catch (Exception e) {
        
            return 0;        
        }        
        
    }
    
    @WebMethod(operationName = "LISTATAREASNF")
    public String LISTATAREASNF() {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.ListaTareasNF();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "LISTAPROYNF")
    public String LISTAPROYNF() {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.ListaProyectosNF();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "PROYECTOINACTIVO")
    public String PROYECTOINACTIVO(@WebParam(name = "creador") String creador) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.ProyectoInactivo(creador);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "PROYECTOENPROCESO")
    public String PROYECTOENPROCESO(@WebParam(name = "creador") String creador) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.ProyectoEnProceso(creador);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "PROYECTOFINALIZADO")
    public String PROYECTOFINALIZADO(@WebParam(name = "creador") String creador) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.ProyectoFinalizado(creador);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "TAREAINACTIVO")
    public String TAREAINACTIVO(@WebParam(name = "creador") String creador) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.TareaInactivo(creador);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "TAREAENPROCESO")
    public String TAREAENPROCESO(@WebParam(name = "creador") String creador) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.TareaEnProceso(creador);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "TAREAFINALIZADO")
    public String TAREAFINALIZADO(@WebParam(name = "creador") String creador) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.TareaFinalizado(creador);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "ESPROYECTOMANAGER")
    public boolean ESPROYECTOMANAGER(@WebParam(name = "Creador") String Creador) {
        MasConsultas consultas = new MasConsultas();
        try {
            return consultas.esproyectmanager(Creador);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
}
