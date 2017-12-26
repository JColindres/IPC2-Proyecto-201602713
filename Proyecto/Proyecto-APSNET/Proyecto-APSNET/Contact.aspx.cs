using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Proyecto_APSNET
{
    public partial class Contact : Page
    {

        webservice.webservice proxy;

        protected void Page_Load(object sender, EventArgs e)
        {
            proxy = new webservice.webservice();
            Label1.Text = Convert.ToString(Session["NombreUsuario"]);
            Label2.Text = proxy.desplegarEstados();
        }

        protected void Publicar(object sender, EventArgs e)
        {
            int id = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            proxy.PublicarEstado(TextBox1.Text, id);
        }

        protected void Comentar(object sender, EventArgs e)
        {
            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            int idE = proxy.obtenerIDEst(Label2.Text);
            string mensaje = TextBox2.Text;
            proxy.PublicarComentario(mensaje, idU, idE);
        }
    }
}