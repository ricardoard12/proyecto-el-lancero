<%-- 
    Document   : Departamento
    Created on : 04-05-2013, 02:34:10 PM
    Author     : Reyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
<head>
  <title>El Lancero</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="../css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body><center>
  <div id="main">

    <div id="site_content">
      <ul id="images">

      </ul>
      <div id="sidebar_container">
        <div class="sidebar">
      
        </div>
      </div>
      <div class="content">
        <center><h3>Mantenimiento Tipo de Arma</h3></center>
        <center> <form action="enviar" method="POST">
        <table border="0">
            <tbody>
                <tr>
                    <td>C&oacute;digo</td>
                    <td><input type="text" name="CodigoDepartamento" value="" /></td>
                </tr>
                <tr>
                    <td>Tipo</td>
                    <td><input type="text" name="CodigoProducto" value="" /></td>
                </tr>
                <tr>
                    <td><input type="button" value="Guardar" /></td>
                    <td><input type="button" value="Cancelar" onclick="location.href='../Mantenimiento.jsp'"/></td>
                </tr>
            </tbody>
        </table>      
            </form></center>
      </div>
    </div>
    <footer>
      El Lancero © 2013
    </footer>
  </div>
  <p>&nbsp;</p>
  <!-- javascript at the bottom for fast page loading -->
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
  <script type="text/javascript" src="js/jquery.sooperfish.js"></script>
  <script type="text/javascript" src="js/jquery.kwicks-1.5.1.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $('#images').kwicks({
        max : 600,
        spacing : 2
      });
      $('ul.sf-menu').sooperfish();
    });
  </script>
   </center> </body>
</html>

