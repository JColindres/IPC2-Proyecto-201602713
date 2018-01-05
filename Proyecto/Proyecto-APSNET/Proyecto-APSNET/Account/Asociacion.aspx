<%@ Page Title="Asociaciones" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Asociacion.aspx.cs" Inherits="Proyecto_APSNET.Account.Lockout" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm32">
                <div class="form-horizontal">
                    <hr />
                    <h4>¿Deseas crear un grupo?</h4>
                    <hr />
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="NombreAso" CssClass="col-md-2 control-label">Nombre</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="NombreAso" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="ObjetivoAso" CssClass="col-md-2 control-label">Objetivo</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="ObjetivoAso" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="CrearAso" Text="Crear" CssClass="btn btn-default" />
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <div class="col-md-4">
            <section id="socialLoginForm32">
            </section>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm323">
                <div class="form-horizontal">
                    <hr />
                    <h4>Tu asociacion</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tú Perteneces a:&nbsp;
                            <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Y tus compañeros son:
                            <br />
                            <br />
                            <asp:ListBox ID="ListBox1" runat="server" Height="79px" Width="144px"></asp:ListBox>
                        </div>
                    </div>
                    <div class="form-group">
                    </div>
                </div>
            </section>
        </div>
        <div class="col-md-4">
            <section id="socialLoginForm323">
            </section>
        </div>
    </div>
</asp:Content>
