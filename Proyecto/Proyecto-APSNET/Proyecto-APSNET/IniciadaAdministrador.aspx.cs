using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Proyecto_APSNET
{
    public partial class About : Page
    {

        webservice.webservice proxy;
        otrowebservice.otrowebservice proxy2;

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();
            proxy2 = new otrowebservice.otrowebservice();

            String lista = Convert.ToString(proxy.ESTADOSDENUNCIADOS());
            Array listus = lista.Split(',');

            foreach (string item in listus)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox1.Items.Add(listus.GetValue(i).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

            String lista2 = Convert.ToString(proxy.COMENTARIOSDENUNCIADOS());
            Array listus2 = lista2.Split(',');

            foreach (string item in listus2)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox2.Items.Add(listus2.GetValue(i).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

            String lista3 = Convert.ToString(proxy.PROYECTOSDENUNCIADOS());
            Array listus3 = lista3.Split(',');

            foreach (string item in listus3)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox3.Items.Add(listus3.GetValue(i).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

            String lista4 = Convert.ToString(proxy.TAREASDENUNCIADOS());
            Array listus4 = lista4.Split(',');

            foreach (string item in listus4)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox4.Items.Add(listus4.GetValue(i).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

            String lista45 = Convert.ToString(proxy.MOSTRARSANCIONADOS());
            Array listus45 = lista45.Split(',');

            foreach (string item in listus45)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox5.Items.Add(listus45.GetValue(i).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

            String lista455 = Convert.ToString(proxy2.LISTACON());
            Array listus455 = lista455.Split(',');

            foreach (string item in listus455)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        DropDownList1.Items.Add(listus455.GetValue(i).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }
        }

        protected void Usuarios(object sender, EventArgs e)
        {
            if (proxy.BackupUsuarios() == true)
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Se creó exitósamente')");
                Response.Write("alert('Buscar archivo en el escritorio')");
                Response.Write("</script>");

                Response.Write("Se creó backup: archivo guardado en el escritorio");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo crear')");
                Response.Write("</script>");
            }
        }

        protected void Asociaciones(object sender, EventArgs e)
        {
            if (proxy.BackupAso() == true)
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Se creó exitósamente')");
                Response.Write("alert('Buscar archivo en el escritorio')");
                Response.Write("</script>");

                Response.Write("Se creó backup: archivo guardado en el escritorio");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo crear')");
                Response.Write("</script>");
            }
        }
        
        protected void CerrarSesion(object sender, EventArgs e)
        {
            Session.Remove("NombreUsuario");
            Response.Redirect("/Default.aspx");
        }

        protected void Suspender_Click(object sender, EventArgs e)
        {
            if (TextBox1.Text != " ")
            {
                int idUs = proxy.obtenerIDUS(TextBox1.Text);
                bool suspencion = proxy.SUSPENDER(idUs);
                if (suspencion == true)
                {
                    Response.Write("Se suspendió usuario");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo suspender')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('ingrese un usuario')");
                Response.Write("</script>");
            }
        }

        protected void Quitar_Click(object sender, EventArgs e)
        {
            if (TextBox2.Text != "")
            {
                int idUs = proxy.obtenerIDUS(TextBox2.Text);
                bool quitar = proxy.QUITARSUSPENCION(idUs);
                if (quitar == true)
                {
                    Response.Write("Se habilitó usuario");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo suspender')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('ingrese un usuario')");
                Response.Write("</script>");
            }
        }

        protected void QuitarDenunciarEstado(object sender, EventArgs e)
        {
            if (TextBox3.Text != "")
            {
                bool denuncia = proxy.QUITARDENUNCIAESTADO(Convert.ToInt16(TextBox3.Text));
                if (denuncia == true)
                {
                    Response.Write("Se quitó denuncia");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo quitar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void QuitarDenunciarComentario(object sender, EventArgs e)
        {
            if (TextBox4.Text != "")
            {
                bool denuncia = proxy.QUITARDENUNCIACOMENTARIO(Convert.ToInt16(TextBox4.Text));
                if (denuncia == true)
                {
                    Response.Write("Se quitó denuncia");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo quitar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void QuitarDenunciarProyecto(object sender, EventArgs e)
        {
            if (TextBox5.Text != "")
            {
                bool denuncia = proxy.QUITARDENUNCIAPROYECTO(Convert.ToInt16(TextBox5.Text));
                if (denuncia == true)
                {
                    Response.Write("Se quitó denuncia");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo quitar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void QuitarDenunciarTarea(object sender, EventArgs e)
        {
            if (TextBox6.Text != "")
            {
                bool denuncia = proxy.QUITARDENUNCIATAREA(Convert.ToInt16(TextBox6.Text));
                if (denuncia == true)
                {
                    Response.Write("Se quitó denuncia");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo quitar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void BorrarEstado(object sender, EventArgs e)
        {
            if (TextBox3.Text != "")
            {
                bool borrarDeComentario = proxy2.ELIMINARESTADODELCOMENTARIO(Convert.ToInt16(TextBox3.Text));
                if (borrarDeComentario == true)
                {
                    bool borrarEstado = proxy2.ELIMINARESTADODEFINITIVO(Convert.ToInt16(TextBox3.Text));
                    if (borrarEstado == true)
                    {
                        Response.Write("Se borró el estado");
                    }
                    else
                    {
                        Response.Write("<script language=javascript>");
                        Response.Write("alert('No se pudo borrar')");
                        Response.Write("</script>");
                    }
                }
                else
                {
                    bool borrarEstado = proxy2.ELIMINARESTADODEFINITIVO(Convert.ToInt16(TextBox3.Text));
                    if (borrarEstado == true)
                    {
                        Response.Write("Se borró el estado");
                    }
                    else
                    {
                        Response.Write("<script language=javascript>");
                        Response.Write("alert('No se pudo borrar')");
                        Response.Write("</script>");
                    }
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void BorrarComentario(object sender, EventArgs e)
        {
            if (TextBox4.Text != "")
            {
                bool borrarComentario = proxy2.ELIMINARCOMENTARIO(Convert.ToInt16(TextBox4.Text));
                if (borrarComentario == true)
                {
                    Response.Write("Se borró el comentario");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo borrar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void BorrarProyecto(object sender, EventArgs e)
        {
            if (TextBox5.Text != "")
            {
                bool borrarDeUs = proxy2.ELIMINARUSPROY(Convert.ToInt16(TextBox5.Text));
                bool borrarDeListaTar = proxy2.ELIMINARPROYLISTATAREA(Convert.ToInt16(TextBox5.Text));
                if (borrarDeUs == true && borrarDeListaTar == true)
                {
                    bool borrarProyecto = proxy2.ELIMINARPROYECTO(Convert.ToInt16(TextBox5.Text));
                    if (borrarProyecto == true)
                    {
                        Response.Write("Se borró el proyecto");
                    }
                    else
                    {
                        Response.Write("<script language=javascript>");
                        Response.Write("alert('No se pudo borrar')");
                        Response.Write("</script>");
                    }
                }
                else
                {
                    bool borrarProyecto = proxy2.ELIMINARPROYECTO(Convert.ToInt16(TextBox5.Text));
                    if (borrarProyecto == true)
                    {
                        Response.Write("Se borró el proyecto");
                    }
                    else
                    {
                        Response.Write("<script language=javascript>");
                        Response.Write("alert('No se pudo borrar')");
                        Response.Write("</script>");
                    }
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void BorrarTarea(object sender, EventArgs e)
        {
            if (TextBox6.Text != "")
            {
                bool borrarDeUs = proxy2.ELIMINARUSTAR(Convert.ToInt16(TextBox6.Text));
                bool borrarDeListaTar = proxy2.ELIMINARTARLISTATAREA(Convert.ToInt16(TextBox6.Text));
                if (borrarDeUs == true && borrarDeListaTar == true)
                {
                    bool borrarTarea = proxy2.ELIMINARTAREA(Convert.ToInt16(TextBox6.Text));
                    if (borrarTarea == true)
                    {
                        Response.Write("Se borró la tarea");
                    }
                    else
                    {
                        Response.Write("<script language=javascript>");
                        Response.Write("alert('No se pudo borrar')");
                        Response.Write("</script>");
                    }
                }
                else
                {
                    bool borrarTarea = proxy2.ELIMINARTAREA(Convert.ToInt16(TextBox6.Text));
                    if (borrarTarea == true)
                    {
                        Response.Write("Se borró la tarea");
                    }
                    else
                    {
                        Response.Write("<script language=javascript>");
                        Response.Write("alert('No se pudo borrar')");
                        Response.Write("</script>");
                    }
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void Button9_Click(object sender, EventArgs e)
        {
            if (proxy2.AGREGARCONOCIMIENTO(Conocimiento.Text) == true)
            {
                Response.Write("Se agregó conocimiento");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo agregar')");
                Response.Write("</script>");
            }
        }

        protected void Button10_Click(object sender, EventArgs e)
        {
            int idCon = proxy2.OBTENERCON(Conocimiento.Text);
            if (proxy2.AGREGARHABILIDAD(Habilidad.Text, idCon) == true)
            {
                Response.Write("Se agregó habilidad");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo agregar')");
                Response.Write("</script>");
            }
        }

        protected void Button11_Click(object sender, EventArgs e)
        {
            if (proxy2.CREARBACKUPEYC() == true)
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Se creó exitósamente')");
                Response.Write("alert('Buscar archivo en el escritorio')");
                Response.Write("</script>");

                Response.Write("Se creó backup: archivo guardado en el escritorio");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo crear')");
                Response.Write("</script>");
            }
        }

        protected void Button12_Click(object sender, EventArgs e)
        {
            if (proxy2.CREARBACKUPTI() == true)
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Se creó exitósamente')");
                Response.Write("alert('Buscar archivo en el escritorio')");
                Response.Write("</script>");

                Response.Write("Se creó backup: archivo guardado en el escritorio");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo crear')");
                Response.Write("</script>");
            }
        }

        protected void Button13_Click(object sender, EventArgs e)
        {
            if (proxy2.CREARBACKUPP() == true)
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Se creó exitósamente')");
                Response.Write("alert('Buscar archivo en el escritorio')");
                Response.Write("</script>");

                Response.Write("Se creó backup: archivo guardado en el escritorio");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo crear')");
                Response.Write("</script>");
            }
        }
    }
}