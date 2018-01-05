<%@ Page Title="Forgot password" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Perfil.aspx.cs" Inherits="Proyecto_APSNET.Account.ForgotPassword" Async="true" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2>Perfil.</h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm">
                <div class="form-horizontal">
                    <hr />
                    <h4>Esta es tu información</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Nombre de Usuario:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
                            <br />
                            Nombre:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
                            <br />
                            Apellido:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <asp:Label ID="Label3" runat="server" Text="Label"></asp:Label>
                            <br />
                            Fecha de Nacimiento:&nbsp;&nbsp; <asp:Label ID="Label4" runat="server" Text="Label"></asp:Label>
                            <br />
                            Dirección de Correo:&nbsp;&nbsp;&nbsp; <asp:Label ID="Label5" runat="server" Text="Label"></asp:Label>
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <hr />
                    <h4>Estados publicados por ti</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox1" runat="server" Height="81px" Width="196px"></asp:ListBox>
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <hr />
                    <h4>Comtentarios publicados por ti</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox2" runat="server" Height="81px" Width="196px"></asp:ListBox>
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <div class="col-md-4">
            <section id="socialLoginForm">
            </section>
        </div>
    </div>
</asp:Content>

