<%-- 
    Document   : index
    Created on : 26-nov-2010, 11:03:02
    Author     : ING.FERNANDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
          <h1><a href="index.html">El Lancero<span class="logo_colour"> Armas, Accesorios y Más</span></a></h1>
          <h2>El Salvador</h2>
        </div>
      </div>            
      <nav> 
          <ul class="sf-menu" id="nav">
          <li class="selected"><a href="index.jsp">Inicio</a></li>
          <li><a href="#">Nuestras Empresa</a>
              <ul>
                  <a href="mision.jsp">Misión</a>
                  <a href="vision.jsp">Visión</a>
                  <a href="sucursales.jsp">Sucursales</a>
              </ul>
          <li><a href="#">Catalogo</a>
             <ul>
                <a href="armas.jsp">Armas</a>
                <a href="municiones.jsp">Municiones</a>
                <a href="accesorios.jsp">Accesorios</a>
             </ul>
          <li><a href="#">Servicios</a>
            <ul>
                <li><a href="#">Reservas en Línea</a>
                    <ul>
                        <a href="rsvarmas.jsp">Reservar Armas</a>
                        <a href="rsvmuniciones.jsp">Rerservar Municiones</a>
                        <a href="rsvaccesorios.jsp">Reservar Accesorios</a>
                    </ul>
            </ul>
          <li><a href="contactenos.jsp">Contactenos</a></li>              
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
          <form method="post" action="ingreso">
              <table border="0">
                  <tbody>
                      <tr>
                          <td>Usuario: </td>
                          <td><input type="text" name="usu" /></td>
                      </tr>
                      <tr>
                          <td>Contraseña: </td>
                          <td><input type="password" name="pass" /></td>
                      </tr>
                      <tr>
                          <td><input type="submit" value="Ingresar" /></td>
                          <td><a href="registrarse.jsp">Registrarse</a></td>
                      </tr>
                  </tbody>
              </table>
          </form>        
        </div>
      </div>
      <div class="content">
        <h1>Bienvenidos!!!!</h1>
        <p>Somos una empresa dedicada a la venta de armas de fuego, contamos con más de 25 años experiencia.</p>
        <p>Nuestro personal es 100% conocedor de todos los tipos de armas que distribuimos por lo que recibirá una excelente asesoria.</p>
        <p></p>        
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

