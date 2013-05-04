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
      
      <div class="content">
          <center>
              <h3>Existencia de Armas</h3>
              <table border="0">
                  <tbody>
                   <tr>
                         <td>Sucursal</td>
                        <td><select name="NombreSucursal">
                                <option>Seleccione...</option>
                                <option>Casa Matriz</option>
                                <option>Col. San Francisco</option>
                                <option>Soyapango</option>
                                <option>Col. Escal&oacute;n</option>
                                <option></option>
                            </select></td>
                    </tr>
                    <tr>
                          <td><input type="submit" value="Mostrar registro" /></td>
                          <td></td>
                      </tr>                   
                  </tbody>
              </table>
          </center>        
      </div>
    </div>
    <%@include file="PiePagina.jsp"%>
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
