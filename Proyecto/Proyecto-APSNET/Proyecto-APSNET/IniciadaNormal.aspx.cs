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
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();

            String usuarios = Convert.ToString(proxy.desplegarUS());
            Array us = usuarios.Split(',');
            foreach (string item in us)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    if (i == 0)
                    {
                        Label1.Text = us.GetValue(0).ToString();
                    }
                    if (i == 1)
                    {
                        Label3.Text = us.GetValue(1).ToString();
                    }
                    if (i == 2)
                    {
                        Label5.Text = us.GetValue(2).ToString();
                    }
                    if (i == 3)
                    {
                        Label7.Text = us.GetValue(3).ToString();
                    }

                }
            }

            String estados = Convert.ToString(proxy.desplegarEstados());
            Array est = estados.Split(',');
            foreach (string item in est)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    if (i == 0)
                    {
                        TextBox2.Text = est.GetValue(0).ToString();
                    }
                    if (i == 1)
                    {
                        TextBox4.Text = est.GetValue(1).ToString();
                    }
                    if (i == 2)
                    {
                        TextBox6.Text = est.GetValue(2).ToString();
                    }
                    if (i == 3)
                    {
                        TextBox8.Text = est.GetValue(3).ToString();
                    }

                }
            }
        }

        protected void Publicar(object sender, EventArgs e)
        {
            int id = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            bool estado = proxy.PublicarEstado(TextBox1.Text, id);

            if (estado == true)
            {
                Response.Write("Se publicó estado");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo publicar')");
                Response.Write("</script>");
            }
        }

        protected void Comentar(object sender, EventArgs e)
        {
            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            int idE = proxy.obtenerIDEst(TextBox2.Text);

            if (idE != 0)
            {
                proxy.PublicarComentario(TextBox3.Text, idU, idE);
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo realizar el comentario')");
                Response.Write("</script>");
            }
        }

        protected void Comentar2(object sender, EventArgs e)
        {
            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            int idE = proxy.obtenerIDEst(TextBox2.Text);

            if (idE != 0)
            {
                proxy.PublicarComentario(TextBox5.Text, idU, idE);
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo realizar el comentario')");
                Response.Write("</script>");
            }
        }

        protected void Comentar3(object sender, EventArgs e)
        {
            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            int idE = proxy.obtenerIDEst(TextBox2.Text);

            if (idE != 0)
            {
                proxy.PublicarComentario(TextBox7.Text, idU, idE);
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo realizar el comentario')");
                Response.Write("</script>");
            }
        }

        protected void Comentar4(object sender, EventArgs e)
        {
            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            int idE = proxy.obtenerIDEst(TextBox9.Text);

            if (idE != 0)
            {
                proxy.PublicarComentario(TextBox3.Text, idU, idE);
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo realizar el comentario')");
                Response.Write("</script>");
            }
        }               

        protected void CerrarSesion(object sender, EventArgs e)
        {
            Session.Remove("NombreUsuario");
            Response.Redirect("/Default.aspx");
        }
    }
}