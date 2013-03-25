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
                                  <option>15</option>
                                  <option>16</option>
                                  <option>17</option>
                                  <option>18</option>
                                  <option>19</option>
                                  <option>20</option>
                                  <option>21</option>
                                  <option>22</option>
                                  <option>23</option>
                                  <option>24</option>
                                  <option>25</option>
                                  <option>26</option>
                                  <option>27</option>
                                  <option>28</option>
                                  <option>29</option>
                                  <option>30</option>
                                  <option>31</option>
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
                                  <option>1982</option>
                                  <option>1981</option>
                                  <option>1980</option>
                                  <option>1979</option>
                                  <option>1978</option>
                                  <option>1977</option>
                                  <option>1976</option>
                                  <option>1975</option>
                                  <option>1974</option>
                                  <option>1973</option>
                                  <option>1972</option>
                                  <option>1971</option>
                                  <option>1970</option>
                                  <option>1969</option>
                                  <option>1968</option>
                                  <option>1967</option>
                                  <option>1966</option>
                                  <option>1965</option>
                                  <option>1964</option>
                                  <option>1963</option>
                                  <option>1962</option>
                                  <option>1961</option>
                                  <option>1960</option>
                                  <option>1959</option>
                                  <option>1958</option>
                                  <option>1957</option>
                                  <option>1956</option>
                                  <option>1955</option>
                                  <option>1954</option>
                                  <option>1953</option>
                                  <option>1952</option>
                                  <option>1951</option>
                                  <option>1950</option>
                                  <option>1949</option>
                                  <option>1948</option>
                                  <option>1947</option>
                                  <option>1946</option>
                                  <option>1945</option>
                                  <option>1944</option>
                                  <option>1943</option>
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
                          <td><font color="red">*</font> Cargo: </td>
                          <td><input type="text" name="Cargo Empleado" value="" /></td>
                      </tr>
                      <tr>
                          <td> Tiempo de laborar: </td>
                          <td><input type="text" name="Tiempo de laborar empleado" value="" /></td>
                      </tr>
                      <tr>
                          <td><font color="red">*</font> Ingresos: </td>
                          <td><input type="text" name="Ingresos empleado" value="" /></td>
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
