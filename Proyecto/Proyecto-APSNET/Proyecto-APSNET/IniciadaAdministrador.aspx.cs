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

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();

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

        protected void CargarUsuarios(object sender, EventArgs e)
        {

        }

        protected void CargarAsociaciones(object sender, EventArgs e)
        {

        }

        protected void CerrarSesion(object sender, EventArgs e)
        {
            Session.Remove("NombreUsuario");
            Response.Redirect("/Default.aspx");
        }
    }
}