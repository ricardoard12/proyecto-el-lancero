<%-- 
    Document   : PerfilUsuario
    Created on : 02-08-2013, 03:43:37 PM
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
        <h1>Perfil de Usuario</h1>
        <form name="form" action="PerfilUsuario.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Perfil</td>
                        <td><input type="text" name="NombrePerfilUsuario" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Permiso</td>
                        <td><input type="text" name="PermisoPu" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Acceder" name="AccederPerfil" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body></center>
</html>
