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

                resultado = rs.getString("u.USERNAME");
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

                resultado = rs.getString("e.MENSAJE");
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

    public boolean cargarUsuarios(String archivo) {

        PreparedStatement pst = null;        
        //JsonParser parser = new JsonParser();
        
        String usuario = "";
        String nombre = "";
        String apellido = "";
        String nacimiento = "";
        String correo = "";
        String contraseña = "";
        
        try {
            
            String consulta = "insert into USUARIO (USERNAME, NOMBRE, APELLIDO, NACIMIENTO, CORREO, CONTRASEÑA) values (?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            
            //Object obj = parser.parse(new FileReader());
            
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
}
