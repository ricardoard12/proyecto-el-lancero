<!DOCTYPE HTML>
<html>

<head>
  <title>El Lancero</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
  <div id="main">
   <%@include file="Encabezado.jsp"%>
    <div id="site_content">
      <ul id="images">
        <li><img src="images/1.jpg" width="600" height="300" alt="seascape_one" /></li>
        <li><img src="images/2.jpg" width="600" height="300" alt="seascape_two" /></li>
        <li><img src="images/3.jpg" width="600" height="300" alt="seascape_three" /></li>
        <li><img src="images/4.jpg" width="600" height="300" alt="seascape_four" /></li>
        <li><img src="images/5.jpg" width="600" height="300" alt="seascape_five" /></li>
        <li><img src="images/6.jpg" width="600" height="300" alt="seascape_seascape" /></li>
      </ul>
      <div id="sidebar_container">
        <div class="sidebar">
    
        </div>
      </div>
      <div class="content">
        <h3>Control de inventario</h3>
        <form action="enviar" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Seleccione sucursal</td>
                        <td><select name="NombreSucursal">
                                <option></option>
                                <option></option>
                                <option></option>
                                <option></option>
                                <option></option>
                            </select></td>
                    </tr>
                    
                    <tr>
                          <td>C&oacute;digo</td>
                          <td><input type="text" name="CodigoArma" value="" /></td>
                      </tr>

                          <td>Cantidad</td>
                          <td><input type="text" name="Cantidad" value="" /></td>
                      </tr>
                      <tr>
                          <td>Descripci&oacute;n</td>
                          <td><input type="text" name="Descripción" value="" /></td>
                      </tr>
                      <tr>
                          <td>Fecha de Ingreso</td>
                          <td><input type="text" name="FechadeIngreso" value="" /></td>
                      </tr>
                      <tr>
                          <td>Fecha de Salida</td>
                          <td><input type="text" name="FechadeSalida" value="" /></td>
                      </tr>
                      
                      <tr>
                          <td><input type="button" value="Generar" name="GenerarPedido" /></td>
                          <td><input type="submit" value="Cancelar" name="Cancelar" /></td>
                      </tr>
                </tbody>
            </table>
        </form>
    
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
</body>
</html>
