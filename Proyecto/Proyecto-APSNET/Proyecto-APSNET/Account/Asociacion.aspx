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
</asp:Content>
