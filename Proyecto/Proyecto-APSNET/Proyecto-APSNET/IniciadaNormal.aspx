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
            <section id="loginForm0">
                <div class="form-horizontal">
                    <hr />
                    <h4>Gestionar Actividades</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-10">
                            <a class="btn btn-default" href="Account/Actividades.aspx">Ir a las actividades &raquo;</a>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <div class="col-md-4">
            <section id="socialLoginForm0">
            </section>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <section id="loginForm9">
                <div class="form-horizontal">
                    <hr />
                    <h4>Elige tus conocimientos</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox10" runat="server" Height="20px" Width="19px"></asp:TextBox>
                        &nbsp;
                            <asp:DropDownList ID="DropDownList1" runat="server">
                            </asp:DropDownList>
                        &nbsp;Ingrese el identificador</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Asignar" Text="Asignar" CssClass="btn btn-default" />
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <hr />
                    <h4>Califica conocimientos</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            &nbsp;<asp:DropDownList ID="DropDownList2" runat="server" Height="56px" Width="468px">
                            </asp:DropDownList>
                            &nbsp;&nbsp;&nbsp; +<asp:TextBox ID="TextBox11" runat="server" Height="20px" Width="16px"></asp:TextBox>
                        &nbsp; -<asp:TextBox ID="TextBox12" runat="server" Height="20px" Width="16px"></asp:TextBox>
                        &nbsp;
                            <asp:TextBox ID="TextBox13" runat="server" Height="20px" Width="16px"></asp:TextBox>
                        &nbsp;
                            <asp:TextBox ID="TextBox14" runat="server" Height="20px" Width="16px"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button runat="server" OnClick="Calificar" Text="Calificar" CssClass="btn btn-default" />
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <div class="col-md-4">
            <section id="socialLoginForm9">
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
                            <asp:TextBox ID="TextBox1" runat="server" Height="66px" TextMode="MultiLine" Width="373px"></asp:TextBox>
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
                            <asp:ListBox ID="ListBox1" runat="server"></asp:ListBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox3" runat="server" Height="66px" TextMode="MultiLine" Width="373px"></asp:TextBox>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            &nbsp;
                            <asp:TextBox ID="TextBox15" runat="server" Width="21px"></asp:TextBox>
&nbsp;Ingrese el identificador del estado
                            <asp:Button runat="server" OnClick="Comentar" Text="Comentar" CssClass="btn btn-default" />
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
