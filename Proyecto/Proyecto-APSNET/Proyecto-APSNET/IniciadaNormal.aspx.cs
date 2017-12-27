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
            TextBox3.Text = proxy.desplegarEstados();
        }

        protected void Publicar(object sender, EventArgs e)
        {
            int id = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            proxy.PublicarEstado(TextBox1.Text, id);
        }

        protected void Comentar(object sender, EventArgs e)
        {
            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            //int idE = proxy.obtenerIDEst(proxy.desplegarEstados());
            Label2.Text = TextBox3.Text;
            int idE = proxy.obtenerIDEst(Label2.Text);

            if (idE != 0)
            {
                proxy.PublicarComentario(TextBox2.Text, idU, idE);
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo realizar el comentario')");
                Response.Write("</script>");
            }
        }
        
    }
}