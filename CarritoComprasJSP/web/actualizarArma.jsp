<%-- 
    Document   : actualizarArma
    Created on : 04-24-2013, 07:11:43 PM
    Author     : Mario
--%>

<%@page import="Procesos.ArmaBD1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.*" %>
<%@page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%-- Obtenemos el id o el codigo del producto que deseamos modificar o actualizar --%>
<%
    Arma a=ArmaBD1.obtenerArma(Integer.parseInt(request.getParameter("id")));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:El Lancero S.A. de C.V. - Actualizar Arma</title>
    </head>
    <body>
        <h1>El Lancero S.A. de C.V.<br>Actualizar Arma</h1>
        <div>
            <a href="index.jsp">Inicio</a> |
            <a href="registrarArma.jsp">Registrar Arma</a> |
            <a href="registrarInventario.jsp">Registrar Inventario</a> |
            <a href="verInventario.jsp">Consultar Inventario</a> |
            <a href="Reporte">Reporte Arma</a>
        </div>
        <br >
        <%-- En el action del formulario le decimos que llama al Controlador --%>
        <form method="post" action="Controlador">
            <div>
                <%-- Indica al controlador que vamos hacer una modificacion --%>
                <input type="hidden" name="accion" value="ModificarArma" />
                <table border="1">
                    <tr>
                        <td>Codigo</td>
                        <%-- Escribimos el codigo del producto a modificar --%>
                        <td><input type="text" name="txtCodigo_Arma" value="<%= a.getCodigo_arma()%>" readonly /></td>
                    </tr>
                    <tr>
                        <td>Modelo</td>
                        <%-- Escribimos el nombre del producto a modificar --%>
                        <td><input type="text" name="txtCodigo_Modelo" value="<%= a.getCodigo_Modelo()%>" /></td>
                    </tr>
                    <tr>
                        <td>Marca</td>
                        <%-- Escribimos el precio del producto a modificar --%>
                        <td><input type="text" name="txtCodigo_Marca" value="<%= a.getCodigo_Marca()%>" /></td>
                    </tr>
                    <tr>
                        <td>Color</td>
                        <%-- Escribimos el precio del producto a modificar --%>
                        <td><input type="text" name="txtCodigo_Color" value="<%= a.getCodigo_Color()%>" /></td>
                    </tr>
                    <tr>
                        <td>Precio</td>
                        <%-- Escribimos el precio del producto a modificar --%>
                        <td><input type="text" name="txtPrecio_Arma" value="<%= a.getPrecio_Arma()%>" /></td>
                    </tr>
                    <tr>
                        <td>Serie del Arma</td>
                        <%-- Escribimos el precio del producto a modificar --%>
                        <td><input type="text" name="txtSerie_Arma" value="<%= a.getSerie_Arma()%>" /></td>
                    </tr>
                    <tr>
                        <td>Balistica</td>
                        <%-- Escribimos el precio del producto a modificar --%>
                        <td><input type="text" name="txtNumero_balistica_arma" value="<%= a.getNumero_balistica_arma()%>" /></td>
                    </tr>
                    <tr>
                        <td>Descripcion</td>
                        <%-- Escribimos el precio del producto a modificar --%>
                        <td><input type="text" name="txtDescripcion_Arma" value="<%= a.getDescripcion_Arma()%>" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Actualizar" name="btnActualizar" /></td>
                    </tr>
                </table>
            </div>
        </form>

    </body>
</html>