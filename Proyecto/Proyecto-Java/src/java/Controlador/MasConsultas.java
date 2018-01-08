package Controlador;

import Controlador.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.ItemList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author pablo
 */
public class MasConsultas extends Conexion{
    
    public boolean eliminarEstadoDeComentario(int estado) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from COMENTARIO where ID_EST = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, estado);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarEstadoDefinitivo(int estado) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from ESTADO where ID_EST = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, estado);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarComentario(int comentario) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from COMENTARIO where ID_COM = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, comentario);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarUSPROY(int proyecto) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from US_PROY where ID_PROY = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, proyecto);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarPROYLISTATAREA(int proyecto) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from LISTA_TAREA where ID_PROY = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, proyecto);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarProyecto(int proyecto) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from PROYECTO where ID_PROY = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, proyecto);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarUSTAR(int tarea) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from US_TAR where ID_TAR = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, tarea);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarTARLISTATAREA(int tarea) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from LISTA_TAREA where ID_TAREA = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, tarea);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean eliminarTarea(int tarea) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from TAREA where ID_TAR = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, tarea);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean crearBackupEyC() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        int idE = 0;
        int idC = 0;
        String usuarioE = "";
        String usuarioC = "";
        String textoE = "";
        String textoC = "";

        try {

            String consulta = "select u.USERNAME, e.ID_EST, e.MENSAJE, c.ID_COM, us.USERNAME, c.MENSAJE from estado e, comentario c, usuario u, usuario us where e.ID_US = u.ID_US and c.ID_EST = e.ID_EST and c.ID_US = us.ID_US";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            JSONObject root = new JSONObject();
            JSONArray Comentarios = new JSONArray();
            JSONArray Estados = new JSONArray();
            JSONArray Respuestas = new JSONArray();
            while (rs.next()) {
                                
                usuarioE = rs.getString("u.USERNAME");
                idE = rs.getInt("e.ID_EST");
                textoE = rs.getString("e.MENSAJE");
                idC = rs.getInt("c.ID_COM");
                usuarioC = rs.getString("us.USERNAME");
                textoC = rs.getString("c.MENSAJE");
                
                JSONObject est_com = new JSONObject();
                
                est_com.put("usuario", usuarioE);
                est_com.put("Estados", Estados);
                Comentarios.add(est_com);
                
                JSONObject estados = new JSONObject();
                
                estados.put("id", idE);
                estados.put("texto", textoE);
                estados.put("Respuestas", Respuestas);
                Estados.add(estados);
                
                JSONObject respuestas = new JSONObject();
                
                respuestas.put("id", idC);
                respuestas.put("usuario", usuarioC);
                respuestas.put("texto", textoC);
                Respuestas.add(respuestas);

            }
            root.put("Comentarios", Comentarios);
            System.out.println(root.toJSONString());

            File file = new File("C:/Users/pablo/Desktop/estadosyasociaciones.json");

            try (PrintWriter writer = new PrintWriter(file)) {
                writer.print(root.toJSONString());
            } catch (FileNotFoundException ex) {
                System.out.println(ex.toString());
            }
            return true;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return false;
    }
    
    public boolean crearBackupTareasIndependientes() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        int id = 0;
        String creador = "";
        String nombre = "";
        String descripcion = "";
        String fechaI = "";
        String fechaC = "";
        String estado = "";
        String asignados = "";

        try {

            String consulta = "select t.ID_TAR, t.CREADOR, t.NOMBRE, t.DESCRIPCION, t.FECHA_I, t.FECHA_C, t.ESTADO, u.USERNAME \n" +
"from lista_tarea lt, tarea t, us_tar ut, usuario u \n" +
"where t.NOMBRE not in (select t.NOMBRE \n" +
"from lista_tarea lt, tarea t, proyecto p \n" +
"where lt.ID_PROY = p.ID_PROY \n" +
"and lt.ID_TAR = t.ID_TAR) \n" +
"and ut.ID_US = u.ID_US \n" +
"group by u.USERNAME";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            JSONObject root = new JSONObject();
            JSONArray Tareas = new JSONArray();
            JSONArray Asignados = new JSONArray();
            while (rs.next()) {
                                
                id = rs.getInt("t.ID_TAR");
                creador = rs.getString("t.CREADOR");
                nombre = rs.getString("t.NOMBRE");
                descripcion = rs.getString("t.DESCRIPCION");
                fechaI = rs.getString("t.FECHA_I");
                fechaC = rs.getString("t.FECHA_C");
                estado = rs.getString("t.ESTADO");
                asignados = rs.getString("u.USERNAME");

                JSONObject tareas = new JSONObject();

                tareas.put("id", id);
                tareas.put("creador", creador);
                tareas.put("nombre", nombre);
                tareas.put("descripcion", descripcion);
                tareas.put("fechainicio", fechaI);
                tareas.put("fechacierre", fechaC);
                tareas.put("estado", estado);
                tareas.put("Asignados", Asignados);

                ItemList miembros = new ItemList();

                miembros.add(asignados);
                Asignados.add(String.valueOf(miembros));

                Tareas.add(tareas);

            }
            root.put("Tareas Independientes", Tareas);
            System.out.println(root.toJSONString());

            File file = new File("C:/Users/pablo/Desktop/tareasIndependientes.json");

            try (PrintWriter writer = new PrintWriter(file)) {
                writer.print(root.toJSONString());
            } catch (FileNotFoundException ex) {
                System.out.println(ex.toString());
            }
            return true;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return false;
    }
    
    public boolean crearBackupProyectos() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        int idp = 0;
        String creadorp = "";
        String nombrep = "";
        String fechaIp = "";
        String fechaCp = "";
        int sueldo = 0;
        String estadop = "";
        int id = 0;
        String creador = "";
        String nombre = "";
        String descripcion = "";
        String fechaI = "";
        String fechaC = "";
        String estado = "";
        String asignados = "";

        try {

            String consulta = "select p.ID_PROY, p.CREADOR, p.NOMBRE, p.FECHA_I, p.FECHA_C, p.SUELDO, p.ESTADO, t.ID_TAR, t.CREADOR, t.NOMBRE, t.DESCRIPCION, t.FECHA_I, t.FECHA_C, t.ESTADO, u.USERNAME \n" +
"from lista_tarea lt, tarea t, us_tar ut, usuario u, proyecto p \n" +
"where t.NOMBRE in (select t.NOMBRE \n" +
"from lista_tarea lt, tarea t, proyecto p \n" +
"where lt.ID_PROY = p.ID_PROY \n" +
"and lt.ID_TAR = t.ID_TAR) \n" +
"and ut.ID_US = u.ID_US \n" +
"group by u.USERNAME ";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            JSONObject root = new JSONObject();
            JSONArray Proyectos = new JSONArray();
            JSONArray Tareas = new JSONArray();
            JSONArray Asignados = new JSONArray();
            while (rs.next()) {
                
                idp = rs.getInt("p.ID_PROY");
                creadorp = rs.getString("p.CREADOR");
                nombrep = rs.getString("p.NOMBRE");
                fechaIp = rs.getString("p.FECHA_I");
                fechaCp = rs.getString("p.FECHA_C");
                sueldo = rs.getInt("p.SUELDO");
                estadop = rs.getString("P.ESTADO");
                
                id = rs.getInt("t.ID_TAR");
                creador = rs.getString("t.CREADOR");
                nombre = rs.getString("t.NOMBRE");
                descripcion = rs.getString("t.DESCRIPCION");
                fechaI = rs.getString("t.FECHA_I");
                fechaC = rs.getString("t.FECHA_C");
                estado = rs.getString("t.ESTADO");
                asignados = rs.getString("u.USERNAME");
                                
                JSONObject proyectos = new JSONObject();
                
                proyectos.put("id", idp);
                proyectos.put("creador", creadorp);
                proyectos.put("nombre", nombrep);
                proyectos.put("fechainicio", fechaIp);
                proyectos.put("fechacierre", fechaCp);
                proyectos.put("sueldo", sueldo);
                proyectos.put("estado", estadop);
                proyectos.put("Tareas", Tareas);
                
                Proyectos.add(proyectos);
                
                JSONObject tareas = new JSONObject();

                tareas.put("id", id);
                tareas.put("creador", creador);
                tareas.put("nombre", nombre);
                tareas.put("descripcion", descripcion);
                tareas.put("fechainicio", fechaI);
                tareas.put("fechacierre", fechaC);
                tareas.put("estado", estado);
                tareas.put("Asignados", Asignados);

                ItemList miembros = new ItemList();

                miembros.add(asignados);
                Asignados.add(String.valueOf(miembros));

                Tareas.add(tareas);

            }
            root.put("Proyectos", Proyectos);
            System.out.println(root.toJSONString());

            File file = new File("C:/Users/pablo/Desktop/proyectos.json");

            try (PrintWriter writer = new PrintWriter(file)) {
                writer.print(root.toJSONString());
            } catch (FileNotFoundException ex) {
                System.out.println(ex.toString());
            }
            return true;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return false;
    }
    
    public boolean agregarConocimiento(String conocimiento) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into CONOCIMIENTO (DESCRIPCION) values (?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, conocimiento);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean agregarHabilidad(String habilidad, int id_con) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into HABILIDAD (DESCRIPCION, ID_CON) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, habilidad);
            pst.setInt(2, id_con);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public String ListaCon() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from CONOCIMIENTO";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("ID_CON") + "] " + rs.getString("DESCRIPCION") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public int obtenerConocimiento(String descripcion) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from CONOCIMIENTO where DESCRIPCION like ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, descripcion);
            rs = pst.executeQuery();
            int id = 0;

            if (rs.absolute(1)) {

                id = rs.getInt("ID_CON");
                return id;

            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return 0;
    }
    
    public String ListaProyectosNF() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select p.ID_PROY, p.NOMBRE from proyecto p where p.ESTADO = 'Inactivo' or p.ESTADO = 'En Proceso'";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("p.ID_PROY") + "]" + rs.getString("p.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String ListaTareasNF() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.ID_TAR, t.NOMBRE from tarea t where t.ESTADO = 'Inactivo' or t.ESTADO = 'En Proceso'";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("t.ID_TAR") + "]" + rs.getString("t.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String ProyectoInactivo(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select p.NOMBRE from proyecto p where p.CREADOR = ? and p.ESTADO = 'INACTIVO'";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("p.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String ProyectoEnProceso(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select p.NOMBRE from proyecto p where p.CREADOR = ? and p.ESTADO = 'EN PROCESO'";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("p.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String ProyectoFinalizado(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select p.NOMBRE from proyecto p where p.CREADOR = ? and p.ESTADO = 'FINALIZADO'";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("p.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String TareaInactivo(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.NOMBRE from lista_tarea lt, tarea t where t.NOMBRE not in (select t.NOMBRE from lista_tarea lt, tarea t, proyecto p where lt.ID_PROY = p.ID_PROY and lt.ID_TAR = t.ID_TAR) and t.CREADOR = ? and t.ESTADO = 'INACTIVO' group by t.NOMBRE";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("t.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String TareaEnProceso(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.NOMBRE from lista_tarea lt, tarea t where t.NOMBRE not in (select t.NOMBRE from lista_tarea lt, tarea t, proyecto p where lt.ID_PROY = p.ID_PROY and lt.ID_TAR = t.ID_TAR) and t.CREADOR = ? and t.ESTADO = 'EN PROCESO' group by t.NOMBRE";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("t.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String TareaFinalizado(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.NOMBRE from lista_tarea lt, tarea t where t.NOMBRE not in (select t.NOMBRE from lista_tarea lt, tarea t, proyecto p where lt.ID_PROY = p.ID_PROY and lt.ID_TAR = t.ID_TAR) and t.CREADOR = ? and t.ESTADO = 'FINALIZADO' group by t.NOMBRE";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("t.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public boolean esproyectmanager(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from proyecto p where p.CREADOR = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {

                return true;

            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return false;
    }
    
    public String hasTrabajadoI(String usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, p.NOMBRE from proyecto p, usuario u, us_proy up where up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and p.ESTADO = 'INACTIVO' and u.USERNAME = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("p.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String hasTrabajadoEP(String usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, p.NOMBRE from proyecto p, usuario u, us_proy up where up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and p.ESTADO = 'EN PROCESO' and u.USERNAME = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("p.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String hasTrabajadoF(String usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, p.NOMBRE from proyecto p, usuario u, us_proy up where up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and p.ESTADO = 'FINALIZADO' and u.USERNAME = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("p.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String comparacionConocimientos(String creador) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, c.DESCRIPCION, z.KARMA_P, z.KARMA_N from us_con z, conocimiento c, usuario u, proyecto p, us_proy up where z.ID_CON = c.ID_CON and z.ID_US = u.ID_US and up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and p.CREADOR = ? order by u.USERNAME";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, creador);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("u.USERNAME") + " posee el conocimiento de: " + rs.getString("c.DESCRIPCION") + " con Karma positivo: " + rs.getString("z.KARMA_P") + " y con Karma negativo: " + rs.getString("z.KARMA_N") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public boolean IniciarProyecto(String proyecto) {

        PreparedStatement pst = null;

        try {

            String consulta = "update PROYECTO set ESTADO = 'EN PROCESO' where NOMBRE = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, proyecto);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean IniciarTarea(String tarea) {

        PreparedStatement pst = null;

        try {

            String consulta = "update TAREA set ESTADO = 'EN PROCESO' where NOMBRE = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, tarea);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean TerminarProyecto(String proyecto) {

        PreparedStatement pst = null;

        try {

            String consulta = "update PROYECTO set ESTADO = 'FINALIZADO' where NOMBRE = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, proyecto);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean TerminarTarea(String tarea) {

        PreparedStatement pst = null;

        try {

            String consulta = "update TAREA set ESTADO = 'FINALIZADO' where NOMBRE = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, tarea);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public boolean EsTrabajador(int usuario) {

        PreparedStatement pst = null;

        try {

            String consulta = "select u.ID_US, u.USERNAME, p.NOMBRE from usuario u, proyecto p, us_proy up where up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and u.ID_US = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public String Trabajaspara(int usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, p.NOMBRE from usuario u, proyecto p, us_proy up where up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and u.ID_US = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = rs.getString("p.NOMBRE");
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String tusCompañerosSon(String proyecto) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, p.NOMBRE from usuario u, proyecto p, us_proy up where up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and p.NOMBRE = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, proyecto);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("u.USERNAME") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String tusCompañerosTarea() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.ID_US, u.USERNAME from usuario u, tarea p, us_tar ut where ut.ID_US = u.ID_US and ut.ID_TAR = p.ID_TAR GROUP BY u.USERNAME";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("u.USERNAME") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String TareaInactivoPublico(int usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.NOMBRE from tarea t, proyecto p, usuario u, lista_tarea lt, us_tar ut where lt.ID_TAR = t.ID_TAR and lt.ID_PROY = p.ID_PROY and ut.ID_US = u.ID_US and t.ESTADO = 'inactivo' and u.ID_US = ? group by t.NOMBRE";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("t.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String TareaEnProcesoPublico(int usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.NOMBRE from tarea t, proyecto p, usuario u, lista_tarea lt, us_tar ut where lt.ID_TAR = t.ID_TAR and lt.ID_PROY = p.ID_PROY and ut.ID_US = u.ID_US and t.ESTADO = 'en proceso' and u.ID_US = ? group by t.NOMBRE";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("t.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String TareaFinalizadoPublico(int usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.NOMBRE from tarea t, proyecto p, usuario u, lista_tarea lt, us_tar ut where lt.ID_TAR = t.ID_TAR and lt.ID_PROY = p.ID_PROY and ut.ID_US = u.ID_US and t.ESTADO = 'finalizado' and u.ID_US = ? group by t.NOMBRE";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("t.NOMBRE") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String conocimientosDisponibles() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from conocimiento";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("ID_CON") + "] " + rs.getString("DESCRIPCION") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public boolean asignarConocimiento(int usuario, int conocimiento) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into US_CON(KARMA_P, KARMA_N, ID_US, ID_CON) values (0,0,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            pst.setInt(2, conocimiento);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public String listadoParaCalificar() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.ID_US, u.USERNAME, c.ID_CON, c.DESCRIPCION, z.KARMA_P, z.KARMA_N from us_con z, conocimiento c, usuario u  where z.ID_US = u.ID_US and z.ID_CON = c.ID_CON order by u.USERNAME";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("u.ID_US") + "] " + rs.getString("u.USERNAME") + " posee el conocimiento de: " + " [" + rs.getString("c.ID_CON") + "] " + rs.getString("c.DESCRIPCION") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public boolean calificarConocimiento(int positivo, int negativo, int usuario, int conocimiento) {

        PreparedStatement pst = null;

        try {

            String consulta = "update us_con set KARMA_P = ?, KARMA_N = ? where ID_US = ? and ID_CON = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, positivo);
            pst.setInt(2, negativo);
            pst.setInt(3, usuario);
            pst.setInt(4, conocimiento);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public String tusConocimientos(int usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select c.ID_CON, c.DESCRIPCION, uc.KARMA_P, uc.KARMA_N \n" +
"from conocimiento c, us_con uc \n" +
"where uc.ID_US = ? \n" +
"and uc.ID_CON = c.ID_CON\n" +
"group by c.ID_CON ";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("c.DESCRIPCION") + " con +" + rs.getString("uc.KARMA_P") + " y -" + rs.getString("uc.KARMA_N") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String tusHabilidades(int usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.ID_US, u.USERNAME, h.DESCRIPCION \n" +
"from conocimiento c, us_con uc, habilidad h, usuario u \n" +
"where uc.ID_US = u.ID_US \n" +
"and uc.ID_CON = c.ID_CON\n" +
"and h.ID_CON = c.ID_CON\n" +
"and u.ID_US = ? \n" +
"group by h.DESCRIPCION";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("h.DESCRIPCION") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public boolean crearListaCon(int tarea, int conocimiento) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into LISTA_CON(ID_TAR, ID_CON) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, tarea);
            pst.setInt(2, conocimiento);

            if (pst.executeUpdate() == 1) {

                return true;
            }

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }

        return false;
    }
    
    public String proyectoConocimientos() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select p.NOMBRE, c.DESCRIPCION\n" +
"from proyecto p, tarea t, lista_tarea lt, lista_con lc, conocimiento c\n" +
"where lc.ID_CON = c.ID_CON\n" +
"and lc.ID_TAR = t.ID_TAR \n" +
"and lt.ID_PROY = p.ID_PROY \n" +
"and lt.ID_TAR = t.ID_TAR";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("p.NOMBRE") + " pide conocimientos en: " + rs.getString("c.DESCRIPCION") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
    
    public String tareaConocimientos() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select t.NOMBRE, c.DESCRIPCION  \n" +
"from tarea t, lista_con lc, conocimiento c \n" +
"where lc.ID_TAR = t.ID_TAR \n" +
"and lc.ID_CON = c.ID_CON";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("t.NOMBRE") + " pide conocimientos en: " + rs.getString("c.DESCRIPCION") + ",";
                System.out.println(resultado);
            }

            return resultado;

        } catch (Exception e) {

            System.err.println("Error" + e);

        } finally {

            try {

                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {

                System.err.println("Error" + e);

            }

        }
        return "No se encontraron resultados";
    }
}
