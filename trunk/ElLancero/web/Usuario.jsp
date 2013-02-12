<%-- 
    Document   : IngresarUsuario
    Created on : 02-08-2013, 03:18:21 PM
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
        <h1>Inicio de Sesión</h1>
            <form name="form" action="IngresarUsuario.jsp" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Usuario</td>
                            <td><input type="text" name="NombreUsuario" value="" size="5" /></td>
                        </tr>
                        <tr>
                            <td>Contraseña</td>
                            <td><input type="password" name="ContraseñaUsuario" value="" size="5" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Iniciar Sesión" name="Iniciar" /></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </form>
    </body></center>
</html>
