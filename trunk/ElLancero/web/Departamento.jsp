<%-- 
    Document   : Departamento
    Created on : 02-08-2013, 04:23:15 PM
    Author     : MELENDEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <center>
        <body>
        <h1>Selección de Departamento</h1>
        <form name="form" action="Departamento.jsp" method="POST">
            <table border="0">
                   <tbody>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="IdDepartamento" value="" size="5" /></td>
                    </tr>
                    <tr>
                        <td>Departamento</td>
                        <td><select name="SelecciónDepartamento">
                                <option>Ahuachapan</option>
                                <option>Cabañas</option>
                                <option>Chalatenango</option>
                                <option>Cuscatlan</option>
                                <option>La Libertad</option>
                                <option>La Paz</option>
                                <option>La Unión</option>
                                <option>Morazan</option>
                                <option>San Miguel</option>
                                <option>San Salvador</option>
                                <option>San Vicente</option>
                                <option>Santa Ana</option>
                                <option>Sonsonate</option>
                                <option>Usulatán</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Aceptar" name="Aceptar" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>       
     </body>
    </center>
</html>
