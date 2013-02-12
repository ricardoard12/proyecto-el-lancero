<%-- 
    Document   : Sucursal
    Created on : 02-08-2013, 03:59:41 PM
    Author     : MELENDEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El Lancero</title>
    </head>
    <center><body>
        <h1></h1>
        <form name="form" action="Sucursal.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="CodigoSucursal" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="NombreSucursal" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Dirección</td>
                        <td><input type="text" name="DirecciónSucursal" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Telefono</td>
                        <td><input type="text" name="TelefonoSucursal" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Guardar" name="Guardar" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body></center>
</html>
