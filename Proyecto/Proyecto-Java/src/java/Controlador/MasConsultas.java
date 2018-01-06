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
    
    public boolean crearBackupA() {

        PreparedStatement pst = null;
        ResultSet rs = null;

        int idE = 0;
        int idC = 0;
        String usuarioE = "";
        String usuarioC = "";
        String textoE = "";
        String textoC = "";
        String nombre = "";
        String miembros = "";

        try {

            String consulta = "select u.USERNAME, e.ID_EST, e.MENSAJE, c.ID_COM, us.USERNAME, c.MENSAJE from estado e, comentario c, usuario u, usuario us where e.ID_US = u.ID_US and c.ID_EST = e.ID_EST and c.ID_US = us.ID_US";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            JSONObject root = new JSONObject();
            JSONArray Miembros = new JSONArray();
            JSONArray Asociaciones = new JSONArray();
            JSONArray Comentarios = new JSONArray();
            JSONArray Estados = new JSONArray();
            JSONArray Respuestas = new JSONArray();
            while (rs.next()) {
                                
                /*id = rs.getInt("a.ID_ASO");
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
                
                
                usuarioE = rs.getString("u.USERNAME");
                idE = rs.getInt("e.ID_EST");
                textoE = rs.getString("e.MENSAJE");
                idC = rs.getInt("c.ID_COM");
                usuarioC = rs.getString("us.USERNAME");
                textoC = rs.getString("c.MENSAJE");
                
                JSONObject est_com = new JSONObject();
                
                est_com.put("usuario", idE);
                est_com.put("Estados", Estados);
                
                ItemList estados = new ItemList();
                
                estados.add(String.valueOf(idE));
                estados.add(textoE);
                estados.add(E);*/

            }
            root.put("Asociaciones", Comentarios);
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
}
