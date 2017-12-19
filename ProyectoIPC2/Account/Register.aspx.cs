using Microsoft.AspNet.Identity;
using System;
using System.Linq;
using System.Web.UI;
using ProyectoIPC2;
using webservice;

public partial class Account_Register : Page
{
    webservice.webservice proxy;

    protected void Page_Load(object sender, EventArgs e)
    {

        proxy = new webservice.webservice();

    }

    protected void CreateUser_Click(object sender, EventArgs e)
    {

        proxy.registrar(UserName.Text, Nombre.Text, Apellido.Text, Nacimiento.Text, Correo.Text, Password.Text);
        Response.Write("Registro Exitoso");
        Response.Redirect("/Account/Login.aspx");

    }
}