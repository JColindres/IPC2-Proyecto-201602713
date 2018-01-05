using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.Owin;
using System.Threading.Tasks;
using Proyecto_APSNET.Models;

namespace Proyecto_APSNET.Account
{
    public partial class AddPhoneNumber : System.Web.UI.Page
    {
        webservice.webservice proxy;

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();          
            
            String lista = Convert.ToString(proxy.ListaUS());
            Array listus = lista.Split(',');

            foreach (string item in listus)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    ListBox1.Items.Add(listus.GetValue(i).ToString());
                }
            }

            int idUs = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            String lista2 = Convert.ToString(proxy.LISTAAMIGOS(idUs));
            Array listus2 = lista2.Split(',');

            foreach (string item in listus2)
            {
                for (int j = 0; j < item.Length; j++)
                {
                    try
                    {
                        ListBox2.Items.Add(listus2.GetValue(j).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

        }

        protected void Agregar(object sender, EventArgs e)
        {
            if (TextBox1.Text != " ")
            {
                string amigo = Convert.ToString(TextBox1.Text);
                int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
                int idAmigo = proxy.obtenerIDUS(amigo);
                bool contacto = proxy.HacerAmigo(idUsuario, idAmigo);

                if (contacto == true)
                {
                    Response.Write("Se agregó a contactos");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo agregar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Llene el campo')");
                Response.Write("</script>");
            }
        }

        protected void Eliminar(object sender, EventArgs e)
        {
            if (TextBox1.Text != " ")
            {
                string amigo = Convert.ToString(TextBox2.Text);
                int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
                int idAmigo = proxy.obtenerIDUS(amigo);
                bool contacto = proxy.ELIMINARAMIGO(idUsuario, idAmigo);

                if (contacto == true)
                {
                    Response.Write("Se eliminó contacto");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo eliminar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Llene el campo')");
                Response.Write("</script>");
            }
        }

        protected void Enviar(object sender, EventArgs e)
        {
            if (TextBox1.Text != " ")
            {                
                int idUsuario = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
                int idAmigo = proxy.obtenerIDUS(TextBox3.Text);
                String mensaje = TextBox4.Text;
                int id_contacto = proxy.IDCONTACTO(idUsuario, idAmigo);
                bool mensajin = proxy.MENSAJIN(mensaje, id_contacto);

                if (mensajin == true)
                {
                    Response.Write("Mensaje enviado");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo enviar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Llene los campos')");
                Response.Write("</script>");
            }
        }
    }
}