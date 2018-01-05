using System;
using System.Web;
using System.Web.UI;
using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.Owin;
using Owin;
using Proyecto_APSNET.Models;

namespace Proyecto_APSNET.Account
{
    public partial class ForgotPassword : Page
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
            String usuarios = Convert.ToString(proxy.DATOSUSUARIO(id));
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
                        Label2.Text = us.GetValue(1).ToString();
                    }
                    if (i == 2)
                    {
                        Label3.Text = us.GetValue(2).ToString();
                    }
                    if (i == 3)
                    {
                        Label4.Text = us.GetValue(3).ToString();
                    }
                    if (i == 4)
                    {
                        Label5.Text = us.GetValue(4).ToString();
                    }
                }
            }

            String lista2 = Convert.ToString(proxy.ESTADODELUSUARIO(id));
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

            String lista22 = Convert.ToString(proxy.COMENTARIODELUSUARIO(id));
            Array listus22 = lista22.Split(',');

            foreach (string item in listus22)
            {
                for (int j = 0; j < item.Length; j++)
                {
                    try
                    {
                        ListBox2.Items.Add(listus22.GetValue(j).ToString());
                    }
                    catch (Exception exx)
                    {
                        Console.WriteLine(exx);
                    }
                }
            }
        }
        
    }
}