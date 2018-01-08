<%@ Page Title="Tu Trabajo" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="TuTrabajo.aspx.cs" Inherits="Proyecto_APSNET.Account.ManagePassword" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm5">
                <div class="form-horizontal">
                    <hr />
                    <h4>Mira el progreso de tu Proyecto</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tus Trabajas para:&nbsp;&nbsp;&nbsp;
                            <asp:Label ID="Label1" runat="server" Text="No estas en ningun proyecto"></asp:Label>
                            <br />
                            <br />
                            Tus Compañeros de proyecto son:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Tus Compañeros de tareas son:<br />
                            <asp:ListBox ID="ListBox1" runat="server" Height="125px" Width="139px"></asp:ListBox>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:ListBox ID="ListBox2" runat="server" Height="125px" Width="139px"></asp:ListBox>
                            <br />
                        </div>
                    </div>
                 </div>
            </section>
        </div>

        <div class="col-md-4">
            <section id="socialLoginForm5">
            </section>
        </div>
    </div>
</asp:Content>
