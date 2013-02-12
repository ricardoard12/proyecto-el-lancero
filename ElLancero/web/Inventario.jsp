<%-- 
    Document   : Inventario
    Created on : 02-09-2013, 11:35:53 AM
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
        <form name="form" action="Inventario.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="CodigoInventario" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Cantidad del producto</td>
                        <td><input type="text" name="CantidadProducto" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Descripción del producto</td>
                        <td><textarea name="DescripciónProducto" rows="4" cols="10"></textarea></td>
                    </tr>
                    <tr>
                        <td>Fecha de ingreso</td>
                        <td><input type="text" name="FechaIngreso" value="" size="10" /></td>
                    </tr>
                    <tr>
                        <td>Fecha de salida</td>
                        <td><input type="text" name="FechaSalida" value="" size="10" /></td>
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
