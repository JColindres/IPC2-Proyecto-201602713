<%@ Page Title="Denuncias" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Denuncias.aspx.cs" Inherits="Proyecto_APSNET.Account.Confirm" Async="true" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm5">
                <div class="form-horizontal">
                    <hr />
                    <h4>Denunciar Estados</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox1" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Estado:
                            <asp:TextBox ID="TextBox1" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button2" runat="server" Text="Denunciar" OnClick="DenunciarEstado" />
                        </div>
                    </div>
                    <hr />
                    <h4>Denunciar Comentario</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox2" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Comentario:&nbsp;
                            <asp:TextBox ID="TextBox3" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button3" runat="server" Text="Denunciar" OnClick="DenunciarComentario" />
                        </div>
                    </div>
                    <hr />
                    <h4>Denunciar Proyecto</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox3" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Proyecto:&nbsp;
                            <asp:TextBox ID="TextBox2" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button1" runat="server" Text="Denunciar" OnClick="DenunciarProyecto" />
                        </div>
                    </div>
                    <hr />
                    <h4>Denunciar Tarea</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox4" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            Tarea:&nbsp;
                            <asp:TextBox ID="TextBox4" runat="server" Width="30px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
                            Ingrese el identificador correspondiente</div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="Button4" runat="server" Text="Denunciar" OnClick="DenunciarTarea" />
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
