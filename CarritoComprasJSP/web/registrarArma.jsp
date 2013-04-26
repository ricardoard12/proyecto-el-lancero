<%-- 
    Document   : registrarArma
    Created on : 04-24-2013, 07:10:49 PM
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
        <title>.:El Lancero S.A. de C.V. - Registrar Arma</title>
    </head>
    <body>
        <h1>El Lancero S.A. de C.V.<br>Registrar Arma</h1>
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
                <input type="hidden" name="accion" value="RegistrarArma" />
                <table border="1">
                    <tr>
                        <td>Modelo</td>
                        <td><input type="text" name="txtCodigo_Modelo" value="" /></td>
                    </tr>
                    <tr>
                        <td>Marca</td>
                        <td><input type="text" name="txtCodigo_Marca" value="" /></td>
                    </tr>
                    <tr>
                        <td>Color</td>
                        <td><input type="text" name="txtCodigo_Color" value="" /></td>
                    </tr>
                    <tr>
                        <td>Precio</td>
                        <td><input type="text" name="txtCodigo_Precio" value="" /></td>
                    </tr>
                    <tr>
                        <td>Numero de serie</td>
                        <td><input type="text" name="txtSerie_Arma" value="" /></td>
                    </tr>
                    <tr>
                        <td>Balistica</td>
                        <td><input type="text" name="txtNumero_balistica_arma" value="" /></td>
                    </tr>
                     <td>Descripcion</td>
                        <td><input type="text" name="txtDescripcion_Arma" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Registrar" name="btnRegistrar" /></td>
                    </tr>
                </table>
            </div>
        </form>

    </body>
</html>
