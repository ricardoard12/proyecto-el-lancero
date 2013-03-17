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
          <h1><a href="index.html">El Lancero<span class="logo_colour"> Armas, Accesorios y Más</span></a></h1>
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
          <form action="form" method="POST">
              <table border="0">
                  <tbody>
                      <tr>
                          <td>Usuario: </td>
                          <td><input type="text" name="usuario" value="" /></td>
                      </tr>
                      <tr>
                          <td>Contraseña: </td>
                          <td><input type="password" name="contraseña" value="" /></td>
                      </tr>
                      <tr>
                          <td><input type="button" value="Ingresar" /></td>
                          <td><a href="registrarse.jsp">Registrarse</a></td>
                      </tr>
                  </tbody>
              </table>
          </form>
          
        </div>
      </div>
      <div class="content">
          <h3>Registrarse</h3>         
          <form action="enviar" method="POST">
              <table border="0">
                  <tbody>
                      <tr>
                          <td><font color="red">*</font> Nombres: </td>
                          <td><input type="text" name="nombre" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Apellidos: </td>
                          <td><input type="text" name="apellido" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Fecha de nacimiento: </td>
                          <td><select name="dia">
                                  <option>1</option>
                                  <option>2</option>
                                  <option>3</option>
                                  <option>4</option>
                                  <option>5</option>
                                  <option>6</option>
                                  <option>7</option>
                                  <option>8</option>
                                  <option>9</option>
                                  <option>10</option>
                                  <option>11</option>
                                  <option>12</option>
                                  <option>13</option>
                                  <option>14</option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                              </select>
                              <select name="mes">
                                  <option>Ene</option>
                                  <option>Feb</option>
                                  <option>Mar</option>
                                  <option>Abr</option>
                                  <option>May</option>
                                  <option>Jun</option>
                                  <option>Jul</option>
                                  <option>Ago</option>
                                  <option>Sep</option>
                                  <option>Oct</option>
                                  <option>Nov</option>
                                  <option>Dic</option>
                              </select>
                              <select name="ano">
                                  <option>1992</option>
                                  <option>1991</option>
                                  <option>1990</option>
                                  <option>1989</option>
                                  <option>1988</option>
                                  <option>1987</option>
                                  <option>1986</option>
                                  <option>1985</option>
                                  <option>1984</option>
                                  <option>1983</option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
                                  <option></option>
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
                          <td><font color="red">*</font> DUI: </td>
                          <td><input type="text" name="dui" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> NIT: </td>
                          <td><input type="text" name="nit" value="" /></td>
                      </tr>
                      <tr>
                          <td> Licencia Conducir: </td>
                          <td><input type="text" name="licenciaConducir" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Licencia Portación Arma: </td>
                          <td><input type="text" name="licenciaArma" value="" /></td>
                      </tr>
                      <tr>
                          <td> Solvencia PNC: </td>
                          <td><input type="text" name="solvenciaPNC" value="" /></td>
                      </tr>
                      <tr>
                          <td> Teléfono: </td>
                          <td><input type="button" value="Agregar Teléfono" onclick="location.href='telefono.jsp'" /></td>
                      </tr>
                      <tr>
                          <td> Celular: </td>
                          <td><input type="button" value="Agregar Celular" onclick="location.href='celular.jsp'" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Dirección: </td>
                          <td><input type="button" value="Agregar Dirección" onclick="location.href='direccion.jsp'" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Correo: </td>
                          <td><input type="button" value="Agregar Correo" onclick="location.href='correo.jsp'" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Lugar de Trabajo: </td>
                          <td><input type="text" name="lugarTrabajo" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Usuario: </td>
                          <td><input type="text" name="usuario" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Contraseña: </td>
                          <td><input type="password" name="contrasena" value="" /></td>
                      </tr>                      
                      <tr>
                          <td><input type="button" value="Guardar" name="Guardar" onclick="location.href='index.jsp'" /></td>
                          <td></td>
                      </tr>
                      
                  </tbody>
              </table>

              <p>Campos * obligatorios</p>
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
