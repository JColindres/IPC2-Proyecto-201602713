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
    public partial class ManagePassword : System.Web.UI.Page
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

            int idU = proxy.obtenerIDUS(Convert.ToString(Session["NombreUsuario"]));
            Label1.Text = proxy2.TRABAJASPARA(idU);

            String lista = Convert.ToString(proxy2.TUSCOMPAÑEROSSON(Label1.Text));
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

            String lista2 = Convert.ToString(proxy2.TUSCOMPAÑEROSTAREA());
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
        }
        
    }
}