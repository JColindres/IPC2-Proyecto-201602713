using Microsoft.AspNet.Identity;
using Microsoft.Owin.Security;
using System;
using System.Web;
using System.Web.UI;
using ProyectoIPC2;
using webservice;

public partial class Account_Login : Page
{

    webservice.webservice proxy;

        protected void Page_Load(object sender, EventArgs e)
        {

            proxy = new webservice.webservice();

        }

        protected void LogIn(object sender, EventArgs e)
        {
            try
            {

                proxy.autenticacion(UserName.Text,Password.Text);
                Session["NombreUsuario"] = UserName.Text;
                Response.Write("Se inicio sesion: Bienvenido " + Session["NombreUsuario"]);
                //Response.Redirect("/Account/Administrador.aspx");
            }
            catch (Exception exx)
            {
                Response.Write("Error: " + exx);
            }
        }
}