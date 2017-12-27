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
            proxy = new webservice.webservice();
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
    }
}