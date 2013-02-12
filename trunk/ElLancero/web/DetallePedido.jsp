<%-- 
    Document   : DetallePedido
    Created on : 02-09-2013, 12:14:15 PM
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
        <h1>Detalle del pedido</h1>
        <form name="form" action="DetallePedido.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="CodigoDp" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Descripción</td>
                        <td><textarea name="DescripciónDp" rows="4" cols="10"></textarea></td>
                    </tr>
                    <tr>
                        <td>Cantidad</td>
                        <td><input type="text" name="CantidadDp" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Precio del lote</td>
                        <td><input type="text" name="PrecioLoteDp" value="" size="5" /></td>
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
