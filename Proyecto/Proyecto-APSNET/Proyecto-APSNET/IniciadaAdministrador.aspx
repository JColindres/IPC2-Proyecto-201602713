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
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button11" runat="server" OnClick="Button11_Click" Text="Crear copia de Estados y Comentarios" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button12" runat="server" OnClick="Button12_Click" Text="Crear copia de Tareas Independientes" CssClass="btn btn-default" />
                        </div>
                    </div>                    
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button13" runat="server" OnClick="Button13_Click" Text="Crear copia de Proyectos" CssClass="btn btn-default" />
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
                    <h4>Agrega conocimientos y habilidades</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Conocimiento:&nbsp;
                            <asp:TextBox ID="Conocimiento" runat="server"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            
                            <asp:Button ID="Button9" runat="server" OnClick="Button9_Click" Text="Agregar Conocimiento" />
                            
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:DropDownList ID="DropDownList1" runat="server">
                            </asp:DropDownList>
                        &nbsp;&nbsp; Seleccione el conocimiento&nbsp; </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Habilidad:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <asp:TextBox ID="Habilidad" runat="server"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            
                            <asp:Button ID="Button10" runat="server" OnClick="Button10_Click" Text="Agregar Habilidad" />
                            
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
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Estado:
                            <asp:TextBox ID="TextBox3" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tiene dos opciones:<br />
                            <asp:Button ID="Button2" runat="server" Text="Quitar Denuncia" OnClick="QuitarDenunciarEstado" />
                        &nbsp; o&nbsp;
                            <asp:Button ID="Button5" runat="server" Text="Borrar definitivamente" OnClick="BorrarEstado" />
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
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Comentario:
                            <asp:TextBox ID="TextBox4" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tiene dos opciones:<br />
                            <asp:Button ID="Button1" runat="server" Text="Quitar Denuncia" OnClick="QuitarDenunciarComentario" />
                        &nbsp; o&nbsp;
                            <asp:Button ID="Button6" runat="server" Text="Borrar definitivamente" OnClick="BorrarComentario" />
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
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Proyecto:
                            <asp:TextBox ID="TextBox5" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tiene dos opciones:<br />
                            <asp:Button ID="Button3" runat="server" Text="Quitar Denuncia" OnClick="QuitarDenunciarProyecto" />
                        &nbsp; o&nbsp;
                            <asp:Button ID="Button7" runat="server" Text="Borrar definitivamente" OnClick="BorrarProyecto" />
                        </div>
                    </div>
                    <hr />
                    <h4>Tareas Denunciadas</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox4" runat="server" Height="100px" Width="345px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tarea:
                            <asp:TextBox ID="TextBox6" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tiene dos opciones:<br />
                            <asp:Button ID="Button4" runat="server" Text="Quitar Denuncia" OnClick="QuitarDenunciarTarea" />
                        &nbsp; o&nbsp;
                            <asp:Button ID="Button8" runat="server" Text="Borrar definitivamente" OnClick="BorrarTarea" />
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
            <section id="loginForm52">
                <div class="form-horizontal">
                    <hr />
                    <h4>Administrar Suspensiones</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">

                            Ingresa el nombre del usuario a suspender:<br />
                            <br />
                            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
                            <br />
                            <br />
                            <asp:Button ID="Suspender" runat="server" Text="Suspender" OnClick="Suspender_Click" />

                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            &nbsp;Lista de usuarios suspendidos:<br />
                            <br />
                            <asp:ListBox ID="ListBox5" runat="server" Height="100px" Width="200px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">

                            Ingresa el nombre del usuario a suspender:<br />
                            <br />
                            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
                            <br />
                            <br />
                            <asp:Button ID="Quitar" runat="server" Text="Quitar Suspension" OnClick="Quitar_Click" />

                        </div>
                    </div>
                </div>
            </section>
        </div>

        <div class="col-md-4">
            <section id="socialLoginForm52">
            </section>
        </div>
    </div>
</asp:Content>
