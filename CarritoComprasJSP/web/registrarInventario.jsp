<%-- 
    Document   : registrarInventario
    Created on : 04-24-2013, 07:12:18 PM
    Author     : Mario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.*" %>
<%@page import="java.util.*" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:El Lancero S.A. de C.V. - Registrar Inventario</title>
    </head>
    <body>
        <h1>El Lancero S.A. de C.V<br>Registrar Inventario</h1>
        <div>
            <a href="index.jsp">Inicio</a> |
            <a href="registrarArma.jsp">Registrar Arma</a> |
            <a href="registrarInventario.jsp">Registrar Inventario</a> |
            <a href="verInventario.jsp">Consultar Inventario</a> |
            <a href="Reporte">Reporte Arma</a>
        </div>
        <br >
        <div>
            <form method="post" action="Controlador">
                <%-- Llamamos a la accion Registrar Venta --%>
                <input type="hidden" name="accion" value="RegistrarInventario" />
                <table border="1">
                        <tr style="background-color: chocolate">
                            <td colspan="5">Carrito de Compras</td>
                        </tr>
                        <tr style="background-color: chocolate">
                            <td>Cliente:</td>
                            <td colspan="4"><input type="text" name="txtCliente" value="" /></td>
                        </tr>
                        <tr style="background-color: chocolate">
                            <td>Arma</td>
                            <td>Sucursal</td>
                            <td>Accesorio</td>
                            <td>Municion</td>
                            <td>Cantidad</td>
                            
                        </tr>
                        <%-- Los productos que tenemos en la sesion que se llama carrito --%>
                        <%
                                    ArrayList <Inventario> lista = (ArrayList <Inventario>)session.getAttribute("carrito");
                                    if(lista!=null){
                                        for (Inventario d : lista) {
                        %>
                                        <tr>
                                            <td><%= d.getCodigo_arma()%></td>
                                            <td><%= d.getCodigo_suc()%></td>
                                            <td><%= d.getCodigo_acc()%></td>
                                            <td><%= d.getCodigo_mu () %></td>
                                            <td><%= d.getCantidad_inv()%></td>
                                             </tr>
                        <%
                                        }
                                    }
                        %>
                        <tr >
                            <td colspan="5"><input type="submit" value="Registrar Inventario" name="btnInventario" /></td>
                        </tr>
                    </table>
                </form>
        </div>


    </body>
</html>
