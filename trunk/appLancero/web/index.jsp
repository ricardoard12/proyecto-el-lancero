
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
    <header>
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.jsp">El Lancero<span class="logo_colour"> Armas, Accesorios y Más</span></a></h1>
          <h2>El Salvador</h2>
        </div>
      </div>            
      <nav> 
          <ul class="sf-menu" id="nav">
          </ul>
      </nav>
    </header>
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
          <h3>Acesso</h3>
          <form action="logueo.jsp" method="POST">
              <table border="0">
                  <tbody>
                      <tr>
                          <td>Usuario: </td>
                          <td><input type="text" name="Usuario" value="" /></td>
                      </tr>
                      <tr>
                          <td>Contraseña: </td>
                          <td><input type="password" name="Contrasena" value="" /></td>
                      </tr>
                      <tr>
                          <td><input type="submit" value="Ingresar"/></td>
                          <td><a href="RegistrarEmpleado.jsp">Registrarse</a></td>
                      </tr>
                  </tbody>
              </table>
          </form>        
        </div>
      </div>
      <div class="content">
        <h1>Control de inventario</h1>
        <p>Sistema de control y manejo de inventario El Lancero S.A de C.V</p>
        <p></p>
        <p></p>        
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
