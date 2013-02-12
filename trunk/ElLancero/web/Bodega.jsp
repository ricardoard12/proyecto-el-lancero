<%-- 
    Document   : Bodega
    Created on : 02-08-2013, 04:44:19 PM
    Author     : MELENDEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <center>
        <body>
         <form name="form" action="Bodega.jsp" method="POST">
             <br>
             <br>
             <br>
            <table border="0">
                    <tbody>
                        <tr>
                            <td>Codigo: </td>
                            <td><input type="text" name="CodigoBodega" value="" size="5" /></td>
                        </tr>
                        <tr>
                            <td>N° de Estante: </td>
                            <td><input type="text" name="NumeroEstanteBodega" value="" size="5" /></td>
                        </tr>                        
                 </tbody>
             </table>
             <br>
             <br>
             <br>
             <table border="0">
                 <tbody>
                     <tr>
                         <td><input type="reset" value="BORRAR" name="Borrar" /></td>
                         <td><input type="submit" value="MODIFICAR" name="Modificar" /></td>
                         <td><input type="submit" value="GUARDAR" name="Guardar" /></td>
                         <td><input type="submit" value="CANCELAR" name="Cancelar" /></td>
                     </tr>
                 </tbody>
             </table>

            </form>
        </body>
   </center>
</html>
