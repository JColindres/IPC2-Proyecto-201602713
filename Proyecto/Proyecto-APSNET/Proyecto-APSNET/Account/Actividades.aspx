<%@ Page Title="Actividades" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Actividades.aspx.cs" Inherits="Proyecto_APSNET.Account.Manage" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <h2><%: Title %></h2>

    <div class="row">
        <div class="col-md-8">
            <section id="loginForm3">
                <div class="form-horizontal">
                    <hr />
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <asp:Button ID="VerTrabajo" runat="server" Text="Ver Trabajo" CssClass="btn btn-default" OnClick="VerTrabajo_Click" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:Button ID="VerTuProyecto" runat="server" Text="Ver Tu Proyecto" CssClass="btn btn-default" OnClick="VerTuProyecto_Click" />
                        </div>
                    </div>
                    <hr />
                    <h4>¿Deseas crear un proyecto? &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ¿Deseas unirte a un proyecto/tarea?</h4>
                    <hr />
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="NombreProyecto" CssClass="col-md-2 control-label">Nombre del Proyecto</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="NombreProyecto" runat="server"></asp:TextBox>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
                            <asp:DropDownList ID="DropDownList1" runat="server">
                            </asp:DropDownList>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:TextBox ID="TextBox1" runat="server" Width="35px"></asp:TextBox>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:Button ID="proy" runat="server" Text="Unirse a Proyecto" OnClick="proy_Click" Width="140px" CssClass="btn btn-default" />
                        </div>
                    </div>
                    <div class="form-group">
                        <asp:Label runat="server" AssociatedControlID="FechaProyecto" CssClass="col-md-2 control-label">Fecha de inicio del Proyecto</asp:Label>
                        <div class="col-md-offset-2 col-md-10">
                            <asp:TextBox ID="FechaProyecto" runat="server"></asp:TextBox>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:DropDownList ID="DropDownList2" runat="server">
                            </asp:DropDownList>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:TextBox ID="TextBox2" runat="server" Width="35px"></asp:TextBox>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:Button ID="tar" runat="server" Text="Unirse a Tarea" OnClick="tar_Click" Width="122px" CssClass="btn btn-default" />
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
</asp:Content>