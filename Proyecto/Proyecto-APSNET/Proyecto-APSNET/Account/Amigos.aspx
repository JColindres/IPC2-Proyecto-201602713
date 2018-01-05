<%@ Page Title="Amigos" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Amigos.aspx.cs" Inherits="Proyecto_APSNET.Account.AddPhoneNumber" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm5">
                <div class="form-horizontal">
                    <hr />
                    <h4>Busca y Agrega Nuevos Amigos!</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox1" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            <asp:Label ID="Label1" runat="server" Text="Ingresa el nombre del usuario que quieres de contacto"></asp:Label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button2" runat="server" Text="Agregar" OnClick="Agregar" />
                        </div>
                    </div>
                    <hr />
                    <h4>Elimina Amigos :(</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            <asp:Label ID="Label2" runat="server" Text="Ingresa el nombre del usuario que quieres eliminar"></asp:Label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button1" runat="server" Text="Eliminar" OnClick="Eliminar" />
                        </div>
                    </div>
                    <hr />
                    <h4>Chatea con tus amigos</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox2" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Label ID="Label3" runat="server" Text="Enviar a:"></asp:Label>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Label ID="Label4" runat="server" Text="Contenido:"></asp:Label>
                            &nbsp;&nbsp;<asp:TextBox ID="TextBox4" runat="server" TextMode="MultiLine" Width="264px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button3" runat="server" Text="Enviar" OnClick="Enviar" />
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
