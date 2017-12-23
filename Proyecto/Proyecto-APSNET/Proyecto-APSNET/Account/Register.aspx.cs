using System;
using System.Linq;
using System.Web;
using System.Web.UI;
using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.Owin;
using Owin;
using Proyecto_APSNET.Models;

namespace Proyecto_APSNET.Account
{
    public partial class Register : Page
    {
        webservice.webservice proxy;

        protected void Page_Load(object sender, EventArgs e)
        {

            proxy = new webservice.webservice();

        }

        protected void CreateUser_Click(object sender, EventArgs e)
        {
            if (Correo.Text.Contains("@") && Correo.Text.Contains(".com"))
            {
                //proxy.Registrarse(UserName.Text, Nombre.Text, Apellido.Text, Nacimiento.Text, Correo.Text, Password.Text);

                if (proxy.Registrarse(UserName.Text, Nombre.Text, Apellido.Text, Nacimiento.Text, Correo.Text, Password.Text) == true)
                {
                    Response.Redirect("/Account/Login.aspx");

                    Response.Write("<script language=javascript>");
                    Response.Write("alert('Registro Exitoso')");
                    Response.Write("</script>");

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
                Response.Write("alert('Escribir una dirección de correo válida')");
                Response.Write("</script>");
            }
        }
    }
}