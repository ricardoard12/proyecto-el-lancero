<%-- 
    Document   : PedidoProveedor
    Created on : 02-09-2013, 12:09:16 PM
    Author     : MELENDEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <center><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El Lancero</title>
    </head>
    <body>
        <h1></h1>
        <form name="form" action="PedidoProveedor.jsp">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="CodigoPp" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Fecha del Pedido</td>
                        <td><input type="text" name="FechaPp" value="" size="10" /></td>
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
