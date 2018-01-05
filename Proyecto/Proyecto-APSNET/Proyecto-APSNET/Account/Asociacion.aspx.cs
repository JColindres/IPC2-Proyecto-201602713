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
        }

        protected void CrearAso(object sender, EventArgs e)
        {
            int id = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
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
    }
}