﻿using System;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using webservice;

public partial class _Default : Page
{

    webservice.webservice proxy;

    protected void Page_Load(object sender, EventArgs e)
    {
        proxy = new webservice.webservice();
    }

    /*protected void Sumar(Object sender, EventArgs e)
    {
        try
        {
            Resultado.Text = proxy.suma(double.Parse(parametro1.Text),
                                double.Parse(parametro2.Text));
        }
        catch (FormatException)
        {
            Resultado.Text = "Invalide Input";
        }
        //UpdatePanelAddition.Update();
    }*/
}