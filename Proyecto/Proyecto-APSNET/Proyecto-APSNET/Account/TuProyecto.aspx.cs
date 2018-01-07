using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.Owin;

namespace Proyecto_APSNET.Account
{
    public partial class ManageLogins : System.Web.UI.Page
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

            String creador = Convert.ToString(Session["NombreUsuario"]); 
            String lista = Convert.ToString(proxy2.TAREAINACTIVO(creador));
            Array listus = lista.Split(',');

            foreach (string item in listus)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox1.Items.Add(listus.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista2 = Convert.ToString(proxy2.TAREAENPROCESO(creador));
            Array listus2 = lista2.Split(',');

            foreach (string item in listus2)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox2.Items.Add(listus2.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista3 = Convert.ToString(proxy2.TAREAFINALIZADO(creador));
            Array listus3 = lista3.Split(',');

            foreach (string item in listus3)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox3.Items.Add(listus3.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista4 = Convert.ToString(proxy2.PROYECTOINACTIVO(creador));
            Array listus4 = lista4.Split(',');

            foreach (string item in listus4)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox4.Items.Add(listus4.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista5 = Convert.ToString(proxy2.PROYECTOENPROCESO(creador));
            Array listus5 = lista5.Split(',');

            foreach (string item in listus5)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox5.Items.Add(listus5.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }

            String lista6 = Convert.ToString(proxy2.PROYECTOFINALIZADO(creador));
            Array listus6 = lista6.Split(',');

            foreach (string item in listus6)
            {
                for (int i = 0; i < item.Length; i++)
                {
                    try
                    {
                        ListBox6.Items.Add(listus6.GetValue(i).ToString());
                    }
                    catch (Exception exxx) { }
                }
            }
        }
    }       
}