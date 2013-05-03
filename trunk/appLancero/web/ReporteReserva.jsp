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
      
      <div id="sidebar_container">
        <div class="sidebar">
    
        </div>
      </div>
      <div class="content">
        <h3>Generar Reporte de Reserva</h3>
        <form action="enviar" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Seleccione producto</td>
                        <td><select name="NombreSucursal">
                                <option>Arma</option>
                                <option>Municion</option>
                                <option>Accesorio</option>
                            </select></td>
                    </tr>
                    
                    <tr>
                          <td>C&oacute;digo</td>
                          <td><input type="text" name="CodigoArma" value="" /></td>
                      </tr>                        
                          <td>Fecha</td>
                          <td><input type="text" name="Fecha" value="" /></td>
                      </tr>
                     
                      <tr>
                          <td><input type="button" value="Generar" name="GenerarPedido" /></td>
                          <td><input type="submit" value="Cancelar" name="Cancelar" /></td>
                      </tr>
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
  <script type='Text/JavaScript' src='js/jquery.scw.js'></script>
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
