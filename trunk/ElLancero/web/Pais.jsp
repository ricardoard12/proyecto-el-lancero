<%-- 
    Document   : Pais
    Created on : 02-08-2013, 04:33:20 PM
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
        <h1>Selección de Pais</h1>
        <form name="form" action="Pais.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="IdPais" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Pais</td>
                        <td><input type="text" name="NombrePais" value="" size="15" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Aceptar" name="Aceptar" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body></center>
</html>
