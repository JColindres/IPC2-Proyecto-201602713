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
        otrowebservice.otrowebservice proxy2;

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();
            proxy2 = new otrowebservice.otrowebservice();
                       

            String estados = Convert.ToString(proxy.desplegarEstados());
            Array est = estados.Split(',');
            foreach (string item in est)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox1.Items.Add(est.GetValue(i).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

            String lista2 = Convert.ToString(proxy2.CONOCIMIENTOSDISPONIBLES());
            Array listus2 = lista2.Split(',');

            foreach (string item in listus2)
            {
                for (int j = 0; j < item.Length; j++)
                {
                    try
                    {
                        DropDownList1.Items.Add(listus2.GetValue(j).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }

            String lista = Convert.ToString(proxy2.LISTADOPARACALIFICAR());
            Array listus = lista.Split(',');

            foreach (string item in listus)
            {
                for (int j = 0; j < item.Length; j++)
                {
                    try
                    {
                        DropDownList2.Items.Add(listus.GetValue(j).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
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
            int idE = Convert.ToInt32(TextBox15.Text);
            bool comentario = proxy.PublicarComentario(TextBox3.Text, idU, idE); ;

            if (idE != 0 && comentario == true)
            {                
                Response.Write("Se comentó estado");
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

        protected void Asignar(object sender, EventArgs e)
        {
            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            int con = Convert.ToInt32(TextBox10.Text);
            if (TextBox10.Text != null)
            {
                proxy2.ASIGNARCONOCIMIENTO(idU, con);
                Response.Write("Se realizó la asignacion");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo realizar la asignaicon')");
                Response.Write("</script>");
            }
        }

        protected void Calificar(object sender, EventArgs e)
        {
            int pos = Convert.ToInt32(TextBox11.Text);
            int neg = Convert.ToInt32(TextBox12.Text);
            int us = Convert.ToInt32(TextBox13.Text);
            int con = Convert.ToInt32(TextBox14.Text);
            bool calficacion = proxy2.CALIFICARCONOCIMIENTO(pos, neg, us, con);

            if (calficacion == true)
            {
                Response.Write("Se calificó");
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('No se pudo realizar la calificacion')");
                Response.Write("</script>");
            }
        }
    }
}