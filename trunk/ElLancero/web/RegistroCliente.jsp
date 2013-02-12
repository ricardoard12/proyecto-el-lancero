<%-- 
    Document   : RegistroCliente
    Created on : 02-08-2013, 12:51:23 AM
    Author     : Mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <center>
        <body>
            <form name="RegistroCliente" action="RegistroCliente" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>* Nombres: </td>
                            <td><input type="text" name="Nombres" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Apellidos: </td>
                            <td><input type="text" name="Apellidos" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Documento de Identidad: </td>
                            <td><input type="text" name="DocumentoIdentidad" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Nit: </td>
                            <td><input type="text" name="Nit" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Licencia Portación de Armas: </td>
                            <td><input type="text" name="LicPortarArma" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Solvencia PNC: </td>
                            <td><input type="text" name="SolPnc" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Telefóno: </td>
                            <td><input type="text" name="Telefono" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Celular: </td>
                            <td><input type="text" name="Celular" value="" /></td>
                        </tr>
                        <tr>
                            <td>* Correo Electrónico: </td>
                            <td><input type="text" name="Correo" value="" /></td>
                        </tr>                        
                    </tbody>
                </table>
                <br>
                <br>
                <table border="0">
                    <tbody>
                        <tr>
                            <td>* Campos Obligatorios</td>
                        </tr>
                    </tbody>
                </table>
                <br>
                <br>
                <table border="0">
                    <tbody>
                        <tr>
                            <td><input type="submit" value="BORRAR" /></td>
                            <td><input type="submit" value="CANCELAR" /></td>
                            <td><input type="submit" value="REGISTRAR" /></td>                            
                        </tr>
                    </tbody>
                </table>
            </form>
        </body>
    </center>
</html>
