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
    
    @WebMethod(operationName = "CrearProyecto")
    public boolean CrearProyecto(@WebParam(name = "Creador") String Creador, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "FechaI") String FechaI, @WebParam(name = "FechaC") String FechaC, @WebParam(name = "Sueldo") int Sueldo){
        Consultas consultas = new Consultas();
        try {
            return consultas.crearProy(Creador, Nombre, FechaI, FechaC, Sueldo);
        } catch (Exception e) {
        
            return false;        
        }
    }

    @WebMethod(operationName = "ObtenerProyecto")
    public int ObtenerProyecto(@WebParam(name = "Nombre") String Nombre) {
        Consultas consultas = new Consultas();
        try {
            return consultas.obtenerProy(Nombre);
        } catch (Exception e) {
        
            return 0;        
        }        
        
    }

    @WebMethod(operationName = "CrearTarea")
    public boolean CrearTarea(@WebParam(name = "Creador") String Creador, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Descripcion") String Descripcion, @WebParam(name = "FechaI") String FechaI, @WebParam(name = "FechaC") String FechaC){
        Consultas consultas = new Consultas();
        try {
            return consultas.crearTarea(Creador, Nombre, Descripcion, FechaI, FechaC);
        } catch (Exception e) {
        
            return false;        
        }
    }

    @WebMethod(operationName = "ObtenerTarea")
    public int ObtenerTarea(@WebParam(name = "Nombre") String Nombre) {
        Consultas consultas = new Consultas();
        try {
            return consultas.obtenerTarea(Nombre);
        } catch (Exception e) {
        
            return 0;        
        }        
        
    }

    @WebMethod(operationName = "CrearListaTAREA")
    public boolean CrearListaTAREA(@WebParam(name = "Id_proy") int Id_proy, @WebParam(name = "Id_tar") int Id_tar){
        Consultas consultas = new Consultas();
        try {
            return consultas.crearListaTarea(Id_proy, Id_tar);
        } catch (Exception e) {
        
            return false;        
        }
    }

    @WebMethod(operationName = "USPROY")
    public boolean USPROY(@WebParam(name = "Id_us") int Id_us, @WebParam(name = "Id_proy") int Id_proy){
        Consultas consultas = new Consultas();
        try {
            return consultas.usuarioProyecto(Id_us, Id_proy);
        } catch (Exception e) {
        
            return false;        
        }
    }
    
    @WebMethod(operationName = "USTAR")
    public boolean USTAR(@WebParam(name = "Id_us") int Id_us, @WebParam(name = "Id_tar") int Id_tar){
        Consultas consultas = new Consultas();
        try {
            return consultas.usuarioTarea(Id_us, Id_tar);
        } catch (Exception e) {
        
            return false;        
        }
    }
    
    @WebMethod(operationName = "ListaUS")
    public String ListaUS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.ListaUsuarios();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "HacerAmigo")
    public boolean HacerAmigo(@WebParam(name = "Id_us") int Id_us, @WebParam(name = "Id_amigo") int Id_amigo){
        Consultas consultas = new Consultas();
        try {
            return consultas.agregarContacto(Id_us, Id_amigo);
        } catch (Exception e) {
        
            return false;        
        }
    }
    
    @WebMethod(operationName = "CrearASO")
    public boolean CrearASO(@WebParam(name = "nombre") String nombre, @WebParam(name = "objetivo") String objetivo){
        Consultas consultas = new Consultas();
        try {
            return consultas.crearAsociacion(nombre, objetivo);
        } catch (Exception e) {
        
            return false;        
        }
    }
    
    @WebMethod(operationName = "ObtenerASO")
    public int ObtenerASO(@WebParam(name = "Nombre") String Nombre) {
        Consultas consultas = new Consultas();
        try {
            return consultas.obtenerAsociacion(Nombre);
        } catch (Exception e) {
        
            return 0;        
        }        
        
    }
    
    @WebMethod(operationName = "US_ASO")
    public boolean US_ASO(@WebParam(name = "us") int us, @WebParam(name = "aso") int aso){
        Consultas consultas = new Consultas();
        try {
            return consultas.us_aso(us, aso);
        } catch (Exception e) {
        
            return false;        
        }
    }
    
    @WebMethod(operationName = "ELIMINARAMIGO")
    public boolean ELIMINARAMIGO(@WebParam(name = "us") int us, @WebParam(name = "amigo") int amigo){
        Consultas consultas = new Consultas();
        try {
            return consultas.eliminarContacto(us, amigo);
        } catch (Exception e) {
        
            return false;        
        }   
    }
    
    @WebMethod(operationName = "LISTAAMIGOS")
    public String LISTAAMIGOS(@WebParam(name = "us") int us) {
        Consultas consultas = new Consultas();
        try {
            return consultas.ListaAmigos(us);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "IDCONTACTO")
    public int IDCONTACTO(@WebParam(name = "usuario") int usuario, @WebParam(name = "amigo") int amigo) {
        Consultas consultas = new Consultas();
        try {
            return consultas.ID_CONTACTO(usuario, amigo);
        } catch (Exception e) {
        
            return 0;        
        }        
        
    }
    
    @WebMethod(operationName = "MENSAJIN")
    public boolean MENSAJIN(@WebParam(name = "Mensaje") String Mensaje, @WebParam(name = "contact") int contact){
        Consultas consultas = new Consultas();
        try {
            return consultas.mensajeDirecto(Mensaje, contact);
        } catch (Exception e) {
        
            return false;        
        }   
    }
    
    @WebMethod(operationName = "LISTAESTADOS")
    public String LISTAESTADOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.ListaEstados();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "LISTACOMENTARIOS")
    public String LISTACOMENTARIOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.ListaComentarios();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "LISTAPROYECTOS")
    public String LISTAPROYECTOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.ListaProyectos();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "LISTATAREAS")
    public String LISTATAREAS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.ListaTareas();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "DATOSUSUARIO")
    public String DATOSUSUARIO(@WebParam(name = "us") int us) {
        Consultas consultas = new Consultas();
        try {
            return consultas.datosUsuario(us);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "ESTADODELUSUARIO")
    public String ESTADODELUSUARIO(@WebParam(name = "us") int us) {
        Consultas consultas = new Consultas();
        try {
            return consultas.EstadoDelUsuario(us);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "COMENTARIODELUSUARIO")
    public String COMENTARIODELUSUARIO(@WebParam(name = "us") int us) {
        Consultas consultas = new Consultas();
        try {
            return consultas.ComentarioDelUsuario(us);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "VALIDARSOCIO")
    public boolean VALIDARSOCIO(@WebParam(name = "Usuario") int Usuario) {
        Consultas consultas = new Consultas();
        try {
            return consultas.validarSocio(Usuario);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "PERTENECESA")
    public String PERTENECESA(@WebParam(name = "us") int us) {
        Consultas consultas = new Consultas();
        try {
            return consultas.pertenecesA(us);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "TUSCOMPASSON")
    public String TUSCOMPASSON(@WebParam(name = "aso") String aso) {
        Consultas consultas = new Consultas();
        try {
            return consultas.tusCompañerosSon(aso);
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "DENUNCIAESTADO")
    public boolean DENUNCIAESTADO(@WebParam(name = "Estado") int Estado) {
        Consultas consultas = new Consultas();
        try {
            return consultas.DenunciaEstado(Estado);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "DENUNCIACOMENTARIO")
    public boolean DENUNCIACOMENTARIO(@WebParam(name = "Comentario") int Comentario) {
        Consultas consultas = new Consultas();
        try {
            return consultas.DenunciaComentario(Comentario);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "DENUNCIAPROYECTO")
    public boolean DENUNCIAPROYECTO(@WebParam(name = "Proyecto") int Proyecto) {
        Consultas consultas = new Consultas();
        try {
            return consultas.DenunciaProyecto(Proyecto);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "DENUNCIATAREA")
    public boolean DENUNCIATAREA(@WebParam(name = "Tarea") int Tarea) {
        Consultas consultas = new Consultas();
        try {
            return consultas.DenunciaTarea(Tarea);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "ESTADOSDENUNCIADOS")
    public String ESTADOSDENUNCIADOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.estadosDenunciados();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "COMENTARIOSDENUNCIADOS")
    public String COMENTARIOSDENUNCIADOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.comentariosDenunciados();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "PROYECTOSDENUNCIADOS")
    public String PROYECTOSDENUNCIADOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.ProyectosDenunciados();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "TAREASDENUNCIADOS")
    public String TAREASDENUNCIADOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.tareasDenunciados();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "SUSPENDER")
    public boolean SUSPENDER(@WebParam(name = "Usuario") int Usuario) {
        Consultas consultas = new Consultas();
        try {
            return consultas.suspender(Usuario);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "QUITARSUSPENCION")
    public boolean QUITARSUSPENCION(@WebParam(name = "Usuario") int Usuario) {
        Consultas consultas = new Consultas();
        try {
            return consultas.quitarSuspencion(Usuario);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "VERIFICARSANCION")
    public boolean VERIFICARSANCION(@WebParam(name = "Usuario") int Usuario) {
        Consultas consultas = new Consultas();
        try {
            return consultas.verficarSancion(Usuario);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "MOSTRARSANCIONADOS")
    public String MOSTRARSANCIONADOS() {
        Consultas consultas = new Consultas();
        try {
            return consultas.mostrarSancionados();
        } catch (Exception e) {
        
            return "Sorry not sorry";        
        }        
        
    }
    
    @WebMethod(operationName = "QUITARDENUNCIAESTADO")
    public boolean QUITARDENUNCIAESTADO(@WebParam(name = "Estado") int Estado) {
        Consultas consultas = new Consultas();
        try {
            return consultas.quitarDenunciaEstado(Estado);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "QUITARDENUNCIACOMENTARIO")
    public boolean QUITARDENUNCIACOMENTARIO(@WebParam(name = "Comentario") int Comentario) {
        Consultas consultas = new Consultas();
        try {
            return consultas.quitarDenunciaComentario(Comentario);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "QUITARDENUNCIAPROYECTO")
    public boolean QUITARDENUNCIAPROYECTO(@WebParam(name = "Proyecto") int Proyecto) {
        Consultas consultas = new Consultas();
        try {
            return consultas.quitarDenunciaProyecto(Proyecto);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
    
    @WebMethod(operationName = "QUITARDENUNCIATAREA")
    public boolean QUITARDENUNCIATAREA(@WebParam(name = "Tarea") int Tarea) {
        Consultas consultas = new Consultas();
        try {
            return consultas.quitarDenunciaTarea(Tarea);
        } catch (Exception e) {
        
            return false;        
        }        
        
    }
}
