<%-- 
    Document   : index
    Created on : 04-01-2013, 10:18:53 PM
    Author     : Mario
--%>

<%@page import="Procesos.ArmaBD1"%>
<%-- Importaciones que son necesarias para que se muestre el JSP --%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.*" %>
<%@page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:EL LANCERO - CONTROL DE INVENTARIO</title>
    </head>
    <body>
        <h1>El Lancero S.A. de C.V.<br>Control de inventario</h1>
        <div>
            <%-- Menu de opciones --%>
            <a href="index.jsp">Inicio</a> |
            <a href="registrarArma.jsp">Registrar Arma</a> |
            <a href="registrarInventario.jsp">Registrar Inventario</a> |
            <a href="verInventario.jsp">Consultar Inventario</a> |
            <a href="Reporte">Reporte Arma</a>
        </div>
        <br >
        <div>
            <table border="1">
                <tr style="background-color: chocolate">
                    <td colspan="4">Lista de armas</td>

                </tr>
                <tr style="background-color: chocolate">
                    <td>Codigo</td>
                    <td>Marca</td>
                    <td>Color</td>
                    <td>Modelo</td>
                    <td>Precio</td>
                    <td>Numero de serie</td>
                    <td>Numero de balistica</td>
                    <td>Descripcion</td>
                </tr>
                <%-- Lista de todos los productos --%>
                <%
                            ArrayList<Arma> lista = ArmaBD1.obtenerArma();
                            for (Arma a : lista) {
                %>
                <tr>
                    <td><%= a.getCodigo_arma()%></td>
                    <td><%= a.getCodigo_Marca()%></td>
                    <td><%= a.getCodigo_Color()%></td>
                    <td><%= a.getCodigo_Modelo()%></td>
                    <td><%= a.getPrecio_Arma()%></td>
                    <td><%= a.getSerie_Arma()%></td>
                    <td><%= a.getNumero_balistica_arma()%></td>
                    <td><%= a.getDescripcion_Arma()%></td>
                    <%-- Enlaces a las paginas de actualizar o anadir al carrito --%>
                    <td><a href="actualizarArma.jsp?id=<%= a.getCodigo_arma()%>">Modificar</a> |
                        <a href="anadirCarrito.jsp?id=<%= a.getCodigo_arma()%>">Añadir</a>
                    </td>
                </tr>
                <%
                            }
                %>

            </table>
        </div>


    </body>
</html>
