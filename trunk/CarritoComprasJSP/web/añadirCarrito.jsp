<%-- 
    Document   : añadirCarrito
    Created on : 04-24-2013, 07:11:59 PM
    Author     : Mario
--%>

<%@page import="Procesos.ArmaBD1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.*" %>
<%@page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%-- Obtenemos el id o el codigo del producto que deseamos añadir al carrito --%>
<%
    Arma a = ArmaBD1.obtenerArma(Integer.parseInt(request.getParameter("id")));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:El Lancero - Carrito de Compras</title>
    </head>
    <body>
        <h1>El Lancero<br>Carrito de Compras</h1>
        <div>
            <a href="index.jsp">Inicio</a> |
            <a href="registrarArma.jsp">Registrar Arma</a> |
            <a href="registrarInventario.jsp">Registrar Inventario</a> |
            <a href="verInventario.jsp">Consultar Inventario</a> |
            <a href="Reporte">Reporte Arma</a>
        </div>
        <br >
        <form method="post" action="Controlador">
            <div>
                <input type="hidden" name="accion" value="AnadirCarrito" />
                <table border="1">
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="txtCodigo_Arma" value="<%= a.getCodigo_arma()%>" readonly /></td>
                    </tr>
                    <tr>
                        <td>Modelo</td>
                        <td><input type="text" name="txtCodigo_Modelo" value="<%= a.getCodigo_Modelo()%>" readonly /></td>
                    </tr>
                    <tr>
                        <td>Marca</td>
                        <td><input type="text" name="txtCodigo_Marca" value="<%= a.getCodigo_Marca()%>" readonly /></td>
                    </tr>
                    
                    <tr>
                        <td>Precio</td>
                        <td><input type="text" name="txtPrecio" value="<%= a.getPrecio_Arma()%>" readonly /></td>
                    </tr>
                    <tr>
                        <td>Descripcion</td>
                        <td><input type="text" name="txtDescripcion_Arma" value="<%= a.getDescripcion_Arma()%>" readonly /></td>
                    </tr>
                    <tr>
                        <td>Cantidad Pedir</td>
                        <td><input type="text" name="txtCantidad" value="0" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Añadir" name="btnAnadir" /></td>
                    </tr>
                </table>
            </div>
        </form>

    </body>
</html>
