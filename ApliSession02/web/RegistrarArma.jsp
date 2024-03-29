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
          <h3>Registrar Armas</h3>         
          <form action="enviar" method="POST">
              <table border="0">
                  <tbody>
                      <tr>
                          <td><font color="red">*</font>C&oacute;digo</td>
                          <td><input type="text" name="CodigoArma" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Tipo</td>
                          <td><select name="Tipo">
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                              </select></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Marca</td>
                          <td></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Modelo</td>
                          <td><select name="ModeloArma">
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                              </select></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>N� serie</td>
                          <td><input type="text" name="NumeroSerie" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Color</td>
                          <td><select name="ColorArma">
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                              </select></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Ca�on</td>
                          <td><input type="text" name="Ca�onArma" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>N� balisitca</td>
                          <td><input type="text" name="NumeroBalistica" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font>Precio</td>
                          <td><input type="text" name="PrecioArma" value="" /></td>
                      </tr>
                      <tr>
                          <td><input type="button" value="Registrar" name="RegistrarArma" /></td>
                          <td><input type="submit" value="Cancelar" name="Cancelar" /></td>
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
