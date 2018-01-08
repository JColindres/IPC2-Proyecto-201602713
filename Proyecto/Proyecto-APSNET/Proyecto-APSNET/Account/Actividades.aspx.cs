using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Web;
using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.EntityFramework;
using Microsoft.AspNet.Identity.Owin;
using Microsoft.Owin.Security;
using Owin;
using Proyecto_APSNET.Models;

namespace Proyecto_APSNET.Account
{
    public partial class Manage : System.Web.UI.Page
    {
        webservice.webservice proxy;
        otrowebservice.otrowebservice proxy2;

        protected void Page_Load()
        {
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();
            proxy2 = new otrowebservice.otrowebservice();

            String lista = Convert.ToString(proxy2.LISTAPROYNF());
            Array listus = lista.Split(',');

            foreach (string item in listus)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        DropDownList1.Items.Add(listus.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista2 = Convert.ToString(proxy2.LISTATAREASNF());
            Array listus2 = lista2.Split(',');

            foreach (string item in listus2)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        DropDownList2.Items.Add(listus2.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista3 = Convert.ToString(proxy2.LISTACON());
            Array listus3 = lista3.Split(',');

            foreach (string item in listus3)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        DropDownList3.Items.Add(listus3.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista4 = Convert.ToString(proxy2.PROYECTOCONOCIMIENTOS());
            Array listus4 = lista4.Split(',');

            foreach (string item in listus4)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox1.Items.Add(listus4.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista5 = Convert.ToString(proxy2.TAREACONOCIMIENTOS());
            Array listus5 = lista5.Split(',');

            foreach (string item in listus5)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox2.Items.Add(listus5.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }
        }

        protected void CrearProyecto(object sender, EventArgs e)
        {
            int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            bool proyecto = proxy.CrearProyecto(Convert.ToString(Session["NombreUsuario"]), NombreProyecto.Text, FechaProyecto.Text, FechaCierreP.Text, Convert.ToInt32(Sueldo.Text));

            if (proyecto == true)
            {
                int idProy = proxy.ObtenerProyecto(NombreProyecto.Text);
                proxy.USPROY(idUsuario, idProy);
                Response.Write("Se creó proyecto, ahora eres un Project Manager");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo crear')");
                Response.Write("</script>");
            }
        }

        protected void CrearTarea(object sender, EventArgs e)
        {
            int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            bool tarea = proxy.CrearTarea(Convert.ToString(Session["NombreUsuario"]), NombreTarea.Text, DescripcionTarea.Text, FechaTarea.Text, FechaCierreT.Text);

            if (tarea == true)
            {
                int idTarea = proxy.ObtenerTarea(NombreTarea.Text);
                int idProy = proxy.ObtenerProyecto(NombreProy.Text);
                proxy.CrearListaTAREA(idProy, idTarea);
                proxy.USTAR(idUsuario, idTarea);
                Response.Write("Se agregó tarea");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo crear')");
                Response.Write("</script>");
            }
        }

        protected void proy_Click(object sender, EventArgs e)
        {
            try
            {
                int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
                int idProy = Convert.ToInt16(TextBox1.Text);
                proxy.USPROY(idUsuario, idProy);
                Response.Write("Se te asignaste al Poryecto");
            }
            catch (Exception exxx)
            {
                Response.Write(exxx);
            }
        }

        protected void tar_Click(object sender, EventArgs e)
        {
            try
            {
                int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
                int idTar = Convert.ToInt16(TextBox2.Text);
                proxy.USTAR(idUsuario, idTar);
                Response.Write("Se te asignaste a la Tarea");
            }
            catch (Exception exxx)
            {
                Response.Write(exxx);
            }
        }

        protected void VerTrabajo_Click(object sender, EventArgs e)
        {
            //int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            //if (proxy2.ESTRABAJADOR(idUsuario) == true)
            //{
                Response.Redirect("/Account/TuTrabajo.aspx");
            /*}
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No trabajas para ningun proyecto')");
                Response.Write("</script>");
            }*/
        }

        protected void VerTuProyecto_Click(object sender, EventArgs e)
        {
            if (proxy2.ESPROYECTOMANAGER(Convert.ToString(Session["NombreUsuario"])) == true)
            {
                Response.Redirect("/Account/TuProyecto.aspx");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No eres Proyect Manager')");
                Response.Write("</script>");
            }
        }

        protected void AgregarCon(object sender, EventArgs e)
        {
            int idTarea = proxy.ObtenerTarea(NombreTarea.Text);
            int idCon = Convert.ToInt32(TextBox3.Text);
            bool tarea = proxy2.CREARLISTACON(idTarea, idCon);
            if (tarea == true)
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
    }
}