<%@ Page Title="Pagina Administrador" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="IniciadaAdministrador.aspx.cs" Inherits="Proyecto_APSNET.About" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm">
                <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="CerrarSesion" Text="Cerrar Sesion" CssClass="btn btn-default" />
                        </div>
                    </div>
                <div class="form-horizontal">
                    <hr />
                    <h4>¿Desea Crear Backups?</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Usuarios" Text="Crear copia de Usuarios" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Asociaciones" Text="Crear copia de Asociaciones" CssClass="btn btn-default" />
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
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm2">
                <div class="form-horizontal">
                    <hr />
                    <h4>¿Desea Cargar Backups?</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="CargarUsuarios" Text="Cargar copia de Usuarios" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="CargarAsociaciones" Text="Cargar copia de Asociaciones" CssClass="btn btn-default" />
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <div class="col-md-4">
            <section id="socialLoginForm2">
            </section>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm5">
                <div class="form-horizontal">
                    <hr />
                    <h4>Estados Denunciados</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox1" runat="server" Height="100px" Width="345px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <hr />
                    <h4>Comentarios Denunciados</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox2" runat="server" Height="100px" Width="345px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <hr />
                    <h4>Proyectos Denunciados</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox3" runat="server" Height="100px" Width="345px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <hr />
                    <h4>Tareas Denunciados</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox4" runat="server" Height="100px" Width="345px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
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
