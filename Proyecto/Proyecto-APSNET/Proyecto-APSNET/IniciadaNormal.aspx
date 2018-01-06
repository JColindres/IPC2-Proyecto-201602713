<%@ Page Title="Pagina Principal" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="IniciadaNormal.aspx.cs" Inherits="Proyecto_APSNET.Contact" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm7">
                <hr />
                <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="CerrarSesion" Text="Cerrar Sesion" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-10">
                            <a class="btn btn-default" href="Account/Perfil.aspx">Ver Perfil &raquo;</a>
                        </div>
                    </div>
            </section>
        </div>

        <div class="col-md-4">
            <section id="socialLoginForm7">
            </section>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm5">
                <div class="form-horizontal">
                    <hr />
                    <h4>Gestionar Contactos</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-10">
                            <a class="btn btn-default" href="Account/Amigos.aspx">Ir a los contactos &raquo;</a>
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
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm51">
                <div class="form-horizontal">
                    <hr />
                    <h4>Realizar Denuncia</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-10">
                            <a class="btn btn-default" href="Account/Denuncias.aspx">Ir a denunciar &raquo;</a>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <div class="col-md-4">
            <section id="socialLoginForm51">
            </section>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm512">
                <div class="form-horizontal">
                    <hr />
                    <h4>Gestionar Asociación</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-10">
                            <a class="btn btn-default" href="Account/Asociacion.aspx">Ir a las asociaciones &raquo;</a>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <div class="col-md-4">
            <section id="socialLoginForm512">
            </section>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm">
                <div class="form-horizontal">
                    <hr />
                    <h4>¿Que tienes en mente?</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox1" runat="server" Height="66px" TextMode="MultiLine" Width="674px"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Publicar" Text="Publicar" CssClass="btn btn-default" />
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
            <section id="loginForm3">
                <div class="form-horizontal">
                    <hr />
                    <h4>¿Deseas crear un proyecto? No olvides agregarle tareas!</h4>
                    <hr />
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="NombreProyecto" CssClass="col-md-2 control-label">Nombre del Proyecto</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="NombreProyecto" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="FechaProyecto" CssClass="col-md-2 control-label">Fecha de inicio del Proyecto</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="FechaProyecto" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="FechaCierreP" CssClass="col-md-2 control-label">Fecha de cierre del Proyecto</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="FechaCierreP" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="Sueldo" CssClass="col-md-2 control-label">Sueldo del Proyecto</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="Sueldo" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="CrearProyecto" Text="Crear" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="NombreProy" CssClass="col-md-2 control-label">Nombre del Proyecto</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="NombreProy" runat="server"></asp:TextBox>
                        &nbsp; (no es obligatorio, pueden haber tareas independientes)
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="NombreTarea" CssClass="col-md-2 control-label">Nombre de la Tarea</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="NombreTarea" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="DescripcionTarea" CssClass="col-md-2 control-label">Descripcion de la Tarea</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="DescripcionTarea" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="FechaTarea" CssClass="col-md-2 control-label">Fecha de la Tarea</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="FechaTarea" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="FechaCierreT" CssClass="col-md-2 control-label">Fecha de la Tarea</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="FechaCierreT" runat="server"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="CrearTarea" Text="Crear" CssClass="btn btn-default" />
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <div class="col-md-4">
            <section id="socialLoginForm3">
            </section>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm2">
                <div class="form-horizontal">
                    <hr />
                    <h4>TIMELINE - Mira los estados de otros usuarios</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Label ID="Label1" runat="server" Text=""></asp:Label>
                        &nbsp;dice:</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox2" runat="server" Height="66px" TextMode="MultiLine" Width="674px" ReadOnly="True" BackColor="Silver"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox3" runat="server" Height="66px" TextMode="MultiLine" Width="674px"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Comentar" Text="Comentar" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Label ID="Label3" runat="server" Text=""></asp:Label>
                        &nbsp;dice:</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox4" runat="server" Height="66px" TextMode="MultiLine" Width="674px" ReadOnly="True" BackColor="Silver"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox5" runat="server" Height="66px" TextMode="MultiLine" Width="674px"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Comentar2" Text="Comentar" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Label ID="Label5" runat="server" Text=""></asp:Label>
                        &nbsp;dice:</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox6" runat="server" Height="66px" TextMode="MultiLine" Width="674px" ReadOnly="True" BackColor="Silver"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox7" runat="server" Height="66px" TextMode="MultiLine" Width="674px"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Comentar3" Text="Comentar" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Label ID="Label7" runat="server" Text=""></asp:Label>
                        &nbsp;dice:</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox8" runat="server" Height="66px" TextMode="MultiLine" Width="674px" ReadOnly="True" BackColor="Silver"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox9" runat="server" Height="66px" TextMode="MultiLine" Width="674px"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Comentar4" Text="Comentar" CssClass="btn btn-default" />
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
</asp:Content>
