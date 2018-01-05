using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Proyecto_APSNET.Account
{
    public partial class Lockout : System.Web.UI.Page
    {
        webservice.webservice proxy;

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();

            int id = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            Label1.Text = proxy.PERTENECESA(id);

            String lista2 = Convert.ToString(proxy.TUSCOMPASSON(Label1.Text));
            Array listus2 = lista2.Split(',');

            foreach (string item in listus2)
            {
                for (int j = 0; j < item.Length; j++)
                {
                    try
                    {
                        ListBox1.Items.Add(listus2.GetValue(j).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }
        }

        protected void CrearAso(object sender, EventArgs e)
        {
            int id = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            if (proxy.VALIDARSOCIO(id) == false)
            {
                bool asociacion = proxy.CrearASO(NombreAso.Text, ObjetivoAso.Text);

                if (asociacion == true)
                {
                    int idAso = proxy.ObtenerASO(NombreAso.Text);
                    proxy.US_ASO(id, idAso);
                    Response.Write("Se creó asociacion");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo publicar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ya perteneces a una asociacion')");
                Response.Write("</script>");
            }
        }
    }
}