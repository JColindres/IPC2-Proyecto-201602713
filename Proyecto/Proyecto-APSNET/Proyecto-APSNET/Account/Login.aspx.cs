using System;
using System.Web;
using System.Web.UI;
using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.Owin;
using Owin;
using Proyecto_APSNET.Models;

namespace Proyecto_APSNET.Account
{
    public partial class Login : Page
    {
        webservice.webservice proxy;

        protected void Page_Load(object sender, EventArgs e)
        {

            proxy = new webservice.webservice();

        }

        protected void LogIn(object sender, EventArgs e)
        {
            if (UserName.Text != "" && Password.Text != "")
            {
                try
                {
                    int idU = proxy.obtenerIDUS(UserName.Text);
                    bool suspension = proxy.VERIFICARSANCION(idU);
                    if (suspension == false)
                    {
                        if (proxy.IniciarSesion(UserName.Text, Password.Text) == true)
                        {
                            Session["NombreUsuario"] = UserName.Text;
                            Response.Write("<script language=javascript>");
                            Response.Write("alert('Se inició sesión')");
                            Response.Write("</script>");

                            if (UserName.Text == "admin" && Password.Text == "soft123warlock")
                            {
                                Response.Redirect("/IniciadaAdministrador.aspx");
                            }
                            else
                            {
                                Response.Redirect("/IniciadaNormal.aspx");
                            }
                        }
                        else
                        {
                            Response.Write("<script language=javascript>");
                            Response.Write("alert('Datos Incorrectos')");
                            Response.Write("</script>");
                        }
                    }
                    else
                    {
                        Response.Write("<script language=javascript>");
                        Response.Write("alert('Esta cuenta a sido suspendida por contenido indebido')");
                        Response.Write("</script>");
                    }
                }
                catch (Exception exx)
                {
                    Response.Write("Error: " + exx);
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