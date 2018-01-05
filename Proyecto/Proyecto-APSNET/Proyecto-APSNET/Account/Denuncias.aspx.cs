using System;
using System.Web;
using System.Web.UI;
using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.Owin;
using Owin;
using Proyecto_APSNET.Models;

namespace Proyecto_APSNET.Account
{
    public partial class Confirm : Page
    {
        webservice.webservice proxy;

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["NombreUsuario"] == null)
            {
                Response.Redirect("/Default.aspx");
            }

            proxy = new webservice.webservice();

            String lista = Convert.ToString(proxy.LISTAESTADOS());
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

            String lista2 = Convert.ToString(proxy.LISTACOMENTARIOS());
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

            String lista3 = Convert.ToString(proxy.LISTAPROYECTOS());
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

            String lista4 = Convert.ToString(proxy.LISTATAREAS());
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

        protected void DenunciarEstado(object sender, EventArgs e)
        {
            if (TextBox1.Text != " " | TextBox1.Text != "")
            {
                bool denuncia = proxy.DENUNCIAESTADO(Convert.ToInt16(TextBox1.Text));
                if (denuncia == true)
                {
                    Response.Write("Se denunció");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo denunciar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void DenunciarComentario(object sender, EventArgs e)
        {
            if (TextBox1.Text != " " | TextBox1.Text != "")
            {
                bool denuncia = proxy.DENUNCIACOMENTARIO(Convert.ToInt16(TextBox3.Text));
                if (denuncia == true)
                {
                    Response.Write("Se denunció");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo denunciar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void DenunciarProyecto(object sender, EventArgs e)
        {
            if (TextBox1.Text != " " | TextBox1.Text != "")
            {
                bool denuncia = proxy.DENUNCIAPROYECTO(Convert.ToInt16(TextBox2.Text));
                if (denuncia == true)
                {
                    Response.Write("Se denunció");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo denunciar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }

        protected void DenunciarTarea(object sender, EventArgs e)
        {
            if (TextBox1.Text != " " | TextBox1.Text != "")
            {
                bool denuncia = proxy.DENUNCIATAREA(Convert.ToInt16(TextBox4.Text));
                if (denuncia == true)
                {
                    Response.Write("Se denunció");
                }
                else
                {
                    Response.Write("<script language=javascript>");
                    Response.Write("alert('No se pudo denunciar')");
                    Response.Write("</script>");
                }
            }
            else
            {
                Response.Write("<script language=javascript>");
                Response.Write("alert('Ingresé un numero de la lista')");
                Response.Write("</script>");
            }
        }
    }
}