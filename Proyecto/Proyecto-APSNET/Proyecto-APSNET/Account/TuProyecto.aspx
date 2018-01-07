<%@ Page Title="Tu Proyecto" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="TuProyecto.aspx.cs" Inherits="Proyecto_APSNET.Account.ManageLogins" %>

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
                            Tus Tareas Individuales:<br />
                            <br />
                            Inactivo:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; En Proceso:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Finalizado:<br />
                            <asp:ListBox ID="ListBox1" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
                            <asp:ListBox ID="ListBox2" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:ListBox ID="ListBox3" runat="server" Height="125px" Width="121px"></asp:ListBox>
                            <br />
                            <br />
                            <br />
                            Tu Proyecto:<br />
                            <br />
                            Inactivo:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; En Proceso:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Finalizado:<br />
                            <asp:ListBox ID="ListBox4" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
                            <asp:ListBox ID="ListBox5" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:ListBox ID="ListBox6" runat="server" Height="125px" Width="121px"></asp:ListBox>
                        </div>
                    </div>
                 </div>
                <div class="form-horizontal">
                    <hr />
                    <h4>Compara los conocimientos de tus trabajadores</h4>
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:ListBox ID="ListBox7" runat="server" Height="125px" Width="677px"></asp:ListBox>
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