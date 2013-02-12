<%-- 
    Document   : OrdenRequerimiento
    Created on : 02-08-2013, 04:12:49 PM
    Author     : MELENDEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El Lancero</title>
    </head>
    <center> <body>
        <h1>Ingreso Orden de Requerimiento</h1>
        <form name="form" action="OrdenRequerimiento.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="CodigoORS" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Descripción</td>
                        <td><textarea name="DescripciónOr" rows="4" cols="20">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td>Fecha de Requerimiento</td>
                        <td><input type="text" name="FechaRequerimientoORS" value="" size="10" /></td>
                    </tr>
                    <tr>
                        <td>Fecha de Recepción</td>
                        <td><input type="text" name="FechaRecepciónORS" value="" size="10" /></td>
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
