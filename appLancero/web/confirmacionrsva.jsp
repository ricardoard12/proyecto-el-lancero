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
          <h1><a href="index.html">El Lancero<span class="logo_colour"> Armas, Accesorios y M�s</span></a></h1>
          <h2>El Salvador</h2>
        </div>
      </div>      
      <nav>        
          <ul class="sf-menu" id="nav">
          <li class="selected"><a href="index.jsp">Inicio</a></li>
          <li><a href="empresa.jsp">Nuestra Empresa</a></li>
          <li><a href="#">Catalogo</a>
             <ul>
                <a href="armas.jsp">Armas</a>
                <a href="municiones.jsp">Municiones</a>
                <a href="accesorios.jsp">Accesorios</a>
             </ul>
          <li><a href="#">Servicios</a>
            <ul>
                <li><a href="#">Reservas en L�nea</a>
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
      <div class="content">
        <h1>Muchas Gracias!!!</h1>
        <p>Estimado cliente le informamos que su solicitud a sido recibida.</p>
        <p>Uno de nuestros asesores le contactar� para informarle cuando puede presentarse a retirar sus productos.</p>
        <p>Para mayor informaci�n puede comunicarse al telefono 2222-0975</p>        
      </div>
    </div>
    <footer>
      El Lancero � 2013
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