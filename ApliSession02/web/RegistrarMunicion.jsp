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
     
      <div id="sidebar_container">
        <div class="sidebar">
          
        </div>
      </div>
      <div class="content">
          <h3>Registrar municiones</h3>         
          <form action="enviar" method="POST">
              <table border="0">
                  <tbody>
                      <tr>
                          <td><font color="red">*</font>C&oacute;digo</td>
                          <td><input type="text" name="CodigoMunición" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Marca</td>
                          <td></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Calibre</td>
                          <td><select name="CalibreMunicion">
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                              </select></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Precio</td>
                          <td><input type="text" name="PrecioMunición" value="" /></td>
                      </tr>
                      <tr>
                          <td><input type="button" value="Registrar" /></td>
                          <td><input type="submit" value="Cancelar" /></td>
                      </tr>
                  </tbody>
              </table>
              <p>Campos Obligatorios *</p>
          </form>
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
