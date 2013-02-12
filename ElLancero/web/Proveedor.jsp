<%-- 
    Document   : Proveedor
    Created on : 02-09-2013, 12:30:02 PM
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
        <h1></h1>
        <form name="form" action="Proveedor.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="CodigoProveedor" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Nombres</td>
                        <td><input type="text" name="NombreProveedor" value="" size="10" /></td>
                    </tr>
                    <tr>
                        <td>Apellidos</td>
                        <td><input type="text" name="ApellidoProveedor" value="" size="10" /></td>
                    </tr>
                    <tr>
                        <td>Id</td>
                        <td><input type="text" name="IdProveedor" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Correo</td>
                        <td><input type="text" name="CorreoProveedor" value="" size="10" /></td>
                    </tr>
                    <tr>
                        <td>Dirección</td>
                        <td><input type="text" name="DirecciónProveedor" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <td>Telefono</td>
                        <td><input type="text" name="TelefonoProveedor" value="" size="10" /></td>
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
