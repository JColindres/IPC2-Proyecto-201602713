<%@ Page Title="Pagina Principal" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Contact.aspx.cs" Inherits="Proyecto_APSNET.Contact" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="form-horizontal">
        <h4>¿Que tienes en mente?</h4>
        <hr />
        <asp:PlaceHolder runat="server" ID="MensajeError" Visible="false">
            <p class="text-danger">
                <asp:Literal runat="server" ID="FailureText" />
            </p>
        </asp:PlaceHolder>
        <div class="form-group">
            <div class="col-md-10">
    <p>
        Publica tu estado aquí:</p>
                <p>
                    <asp:TextBox ID="TextBox1" runat="server" Height="76px" Width="870px"></asp:TextBox>
                </p>

            </div>
        </div>
       
        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <asp:Button runat="server" OnClick="Publicar" Text="Publicar" CssClass="btn btn-default" />
                <br />
                <br />
        <h4>Mira lo que los demas piensan:</h4>
                <p>&nbsp;</p>
                <p>
                    <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
                </p>
                <p>
                    <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
                </p>
                <p>
                    <asp:TextBox ID="TextBox2" runat="server" Height="76px" Width="870px"></asp:TextBox>
                </p>
                <p>
                <asp:Button runat="server" OnClick="Comentar" Text="Comentar" CssClass="btn btn-default" />
                </p>
            </div>
        </div>
    </div>
</asp:Content>
