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
//import com.google.gson.JsonParser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pablo
 */
public class Consultas extends Conexion {

    public boolean autenticacion(String usuario, String contraseña) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from USUARIO where USERNAME = ? and CONTRASEÑA = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
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

    public boolean registrar(String usuario, String nombre, String apellido, String nacimiento, String correo, String contraseña) {

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

    public int obtenerID(String usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from USUARIO where USERNAME = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            rs = pst.executeQuery();
            int id = 0;

            if (rs.absolute(1)) {

                id = rs.getInt("ID_US");
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

    public boolean estado(String mensaje, int id_us) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into ESTADO (MENSAJE, ID_US) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, mensaje);
            pst.setInt(2, id_us);

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

    public boolean comentario(String mensaje, int id_us, int id_est) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into COMENTARIO (MENSAJE, ID_US, ID_EST) values (?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, mensaje);
            pst.setInt(2, id_us);
            pst.setInt(3, id_est);

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

    public int obtenerIDEST(String estado) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from ESTADO where MENSAJE like ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, estado);
            rs = pst.executeQuery();
            int id = 0;

            if (rs.absolute(1)) {

                id = rs.getInt("ID_EST");
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

    public String mostrarEstadosUsuario() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, e.MENSAJE from estado e, usuario u where e.ID_US = u.ID_US";
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

    public String mostrarEstados() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, e.MENSAJE from estado e, usuario u where e.ID_US = u.ID_US";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("e.MENSAJE") + ",";
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

    public boolean crearBackupU() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        int id = 0;
        String usuario = "";
        String nombre = "";
        String apellido = "";
        String nacimiento = "";
        String correo = "";
        String contraseña = "";

        try {

            String consulta = "select * from USUARIO";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            JSONObject root = new JSONObject();
            JSONArray Usuarios = new JSONArray();

            while (rs.next()) {

                id = rs.getInt("ID_US");
                usuario = rs.getString("USERNAME");
                nombre = rs.getString("NOMBRE");
                apellido = rs.getString("APELLIDO");
                nacimiento = rs.getString("NACIMIENTO");
                correo = rs.getString("CORREO");
                contraseña = rs.getString("CONTRASEÑA");

                JSONObject usuarioObjeto = new JSONObject();

                usuarioObjeto.put("id usuario", id);
                usuarioObjeto.put("nickname", usuario);
                usuarioObjeto.put("nombre", nombre);
                usuarioObjeto.put("apellido", apellido);
                usuarioObjeto.put("nacimiento", nacimiento);
                usuarioObjeto.put("correo", correo);
                usuarioObjeto.put("password", contraseña);

                Usuarios.add(usuarioObjeto);

            }

            root.put("Usuarios", Usuarios);
            System.out.println(root.toJSONString());

            File file = new File("C:/Users/pablo/Desktop/users.json");

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

    public boolean crearBackupA() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        int id = 0;
        String nombre = "";
        String miembros = "";

        try {

            String consulta = "select a.ID_ASO, a.NOMBRE, u.USERNAME from us_aso ua, asociacion a, usuario u where ua.id_aso = a.ID_ASO and ua.ID_US = u.ID_US";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            JSONObject root = new JSONObject();
            JSONArray Asociaciones = new JSONArray();
            JSONArray Miembros = new JSONArray();
            while (rs.next()) {

                id = rs.getInt("a.ID_ASO");
                nombre = rs.getString("a.NOMBRE");
                miembros = rs.getString("u.USERNAME");

                JSONObject asoObjeto = new JSONObject();

                asoObjeto.put("id asociacion", id);
                asoObjeto.put("nombre", nombre);
                asoObjeto.put("Miembros", Miembros);

                ItemList asoObjeto2 = new ItemList();

                asoObjeto2.add(miembros);
                Miembros.add(String.valueOf(asoObjeto2));

                Asociaciones.add(asoObjeto);

            }
            root.put("Asociaciones", Asociaciones);
            System.out.println(root.toJSONString());

            File file = new File("C:/Users/pablo/Desktop/asociaciones.json");

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

    public boolean crearProy(String nombre, String fecha) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into PROYECTO (NOMBRE, FECHA_I) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, fecha);

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
    
    public int obtenerProy(String nombre) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from PROYECTO where NOMBRE like ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            rs = pst.executeQuery();
            int id = 0;

            if (rs.absolute(1)) {

                id = rs.getInt("ID_PROY");
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
    
    public boolean crearTarea(String nombre, String descripcion, String fecha) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into TAREA (NOMBRE, DESCRIPCION, FECHA_I) values (?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, descripcion);
            pst.setString(3, fecha);

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
    
    public int obtenerTarea(String nombre) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from TAREA where NOMBRE like ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            rs = pst.executeQuery();
            int id = 0;

            if (rs.absolute(1)) {

                id = rs.getInt("ID_TAR");
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
    
    public boolean crearListaTarea(int id_proy, int id_tar) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into LISTA_TAREA (ID_PROY, ID_TAR) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, id_proy);
            pst.setInt(2, id_tar);

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
    
    public boolean usuarioProyecto(int id_us, int id_proy ) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into US_PROY (ID_US, ID_PROY) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, id_us);
            pst.setInt(2, id_proy);

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
    
    public boolean usuarioTarea(int id_us, int id_tar ) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into US_TAR (ID_US, ID_TAR) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, id_us);
            pst.setInt(2, id_tar);

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
        
    public String ListaUsuarios() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from USUARIO";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("USERNAME") + ",";
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
    
    public boolean agregarContacto(int id_us, int id_amigo) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into CONTACTO (ID_US, ID_AMIGO) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, id_us);
            pst.setInt(2, id_amigo);

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
    
    public boolean crearAsociacion(String nombre, String objetivo) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into ASOCIACION (NOMBRE, OBJETIVO) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, objetivo);

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
    
    public int obtenerAsociacion(String nombre) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from ASOCIACION where NOMBRE like ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            rs = pst.executeQuery();
            int id = 0;

            if (rs.absolute(1)) {

                id = rs.getInt("ID_ASO");
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
    
    public boolean us_aso(int usuario, int aso) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into US_ASO (ID_US, ID_ASO) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            pst.setInt(2, aso);

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
    
    public boolean eliminarContacto(int usuario, int amigo) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from CONTACTO where ID_US = ? and ID_AMIGO = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
            pst.setInt(2, amigo);

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
    
    public String ListaAmigos(int us) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME from USUARIO u, CONTACTO c where c.ID_US = ? and c.ID_AMIGO = u.ID_US";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, us);
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
    
    public int ID_CONTACTO(int us, int amigo) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from CONTACTO where ID_US = ? and ID_AMIGO = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, us);
            pst.setInt(2, amigo);
            rs = pst.executeQuery();
            int id = 0;

            if (rs.absolute(1)) {

                id = rs.getInt("ID_CONTACTO");
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
    
    public boolean mensajeDirecto(String mensaje, int contacto) {

        PreparedStatement pst = null;

        try {

            String consulta = "insert into MENSAJEPRIVADO (MENSAJE, ID_CONTACTO) values (?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, mensaje);
            pst.setInt(2, contacto);

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
    
    public String ListaEstados() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from ESTADO";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("ID_EST") + "]" + rs.getString("MENSAJE") + ",";
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
    
    public String ListaComentarios() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from COMENTARIO";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("ID_COM") + "]" + rs.getString("MENSAJE") + ",";
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
    
    public String ListaProyectos() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from PROYECTO";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("ID_PROY") + "]" + rs.getString("NOMBRE") + ",";
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
    
    public String ListaTareas() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from TAREA";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " [" + rs.getString("ID_TAR") + "]" + rs.getString("NOMBRE") + ",";
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
    
    public String datosUsuario(int us) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from USUARIO where ID_US = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, us);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = rs.getString("USERNAME") + "," + rs.getString("NOMBRE") + "," + rs.getString("APELLIDO") + "," + rs.getString("NACIMIENTO") + "," + rs.getString("CORREO");
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
    
    public String EstadoDelUsuario(int us) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, e.MENSAJE from usuario u, estado e where e.ID_US = u.ID_US and u.ID_US = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, us);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("e.MENSAJE") + ",";
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
    
    public String ComentarioDelUsuario(int us) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, c.MENSAJE from usuario u, comentario c where c.ID_US = u.ID_US and u.ID_US = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, us);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("c.MENSAJE") + ",";
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
    
    public boolean validarSocio(int usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select a.NOMBRE, u.USERNAME from us_aso ua,asociacion a, usuario u where ua.ID_US = u.ID_US and ua.ID_ASO = a.ID_ASO and u.ID_US = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario);
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
    
    public String pertenecesA(int us) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select a.NOMBRE, u.USERNAME from us_aso ua,asociacion a, usuario u where ua.ID_US = u.ID_US and ua.ID_ASO = a.ID_ASO and u.ID_US = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, us);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = rs.getString("a.NOMBRE");
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
    
    public String tusCompañerosSon(String aso) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select a.NOMBRE, u.USERNAME from us_aso ua,asociacion a, usuario u where ua.ID_US = u.ID_US and ua.ID_ASO = a.ID_ASO and a.NOMBRE = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, aso);
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
    
    public boolean DenunciaEstado(int estado) {

        PreparedStatement pst = null;

        try {

            String consulta = "update ESTADO set DENUNCIA = ? where ID_EST = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setBoolean(1, true);
            pst.setInt(2, estado);

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
    
    public boolean DenunciaComentario(int comentario) {

        PreparedStatement pst = null;

        try {

            String consulta = "update COMENTARIO set DENUNCIA = ? where ID_COM = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setBoolean(1, true);
            pst.setInt(2, comentario);

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
    
    public boolean DenunciaProyecto(int proyecto) {

        PreparedStatement pst = null;

        try {

            String consulta = "update PROYECTO set DENUNCIA = ? where ID_PROY = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setBoolean(1, true);
            pst.setInt(2, proyecto);

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
    
    public boolean DenunciaTarea(int tarea) {

        PreparedStatement pst = null;

        try {

            String consulta = "update TAREA set DENUNCIA = ? where ID_TAR = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setBoolean(1, true);
            pst.setInt(2, tarea);

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
    
    public String estadosDenunciados() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, e.MENSAJE from estado e, usuario u where e.ID_US = u.ID_US and denuncia = 1";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("u.USERNAME") + " dijo: " + rs.getString("e.MENSAJE") + ",";
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
    
    public String comentariosDenunciados() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME, e.MENSAJE from comentario e, usuario u where e.ID_US = u.ID_US and denuncia = 1";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("u.USERNAME") + " dijo: " + rs.getString("e.MENSAJE") + ",";
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
    
    public String ProyectosDenunciados() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME ,p.NOMBRE from us_proy up, proyecto p, usuario u where up.ID_US = u.ID_US and up.ID_PROY = p.ID_PROY and denuncia = 1";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("u.USERNAME") + " creó: " + rs.getString("p.NOMBRE") + ",";
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
    
    public String tareasDenunciados() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select u.USERNAME ,t.NOMBRE from us_tar ut, tarea t, usuario u where ut.ID_US = u.ID_US and ut.ID_TAR = t.ID_TAR and denuncia = 1";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {

                resultado = resultado + " " + rs.getString("u.USERNAME") + " creó: " + rs.getString("t.NOMBRE") + ",";
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
