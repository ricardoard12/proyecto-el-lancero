<%-- 
    Document   : Departamento
    Created on : 04-05-2013, 02:34:10 PM
    Author     : Reyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page 
    import = "javax.persistence.Query;
    import  Entidades.CodigoArea;
    import javax.persistence.EntityManager;
    import Mantenimiento.mantenimientoCodigoArea;
        
    
    "%>

<html>
    
<head>
  <title>El Lancero</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
  <jsp:useBean id="mantoCarea" scope="request" class="Mantenimiento.mantenimientoCodigoArea" />
        <script type="text/javascript">
            function validarGuardar()
            {
                var codigoCarea=document.forms["Form"]["coidgo_codigoArea"].value;
                var nombreCarea=document.forms["Form"]["nombre_codigoArea"].value;
                if(codigoCarea==null || codigoCarea=="") 
                {
                    alert("El codigo del codigo de area es obligatorio...")
                    return false;
                }              
            }
        </script>
</head>

<body>
  <div id="main">
    <div id="site_content">
    <div class="content">      
        <center><h3>Mantenimiento Color</h3></center>
        <center> <form action="CodigoArea.jsp" method="POST">
        <%
        String operacion = request.getParameter("operacion");
        long codigoCarea = request.getp;
        String nombreCarea = request.getParameter("nombreCarea");
        
        
        if(operacion==null){
            if(operacion.equals("Guardar")){
                CodigoArea coa = mantoCarea.consultar(codigoCarea);
                if(coa==null){
                    CodigoArea codigoarea = new CodigoArea();
                    codigoarea.setCodigoCarea(codigoCarea);
                    codigoarea.setNombreCarea(nombreCarea);
                    int flag = mantoCarea.guardar(departamentos);
                }
        }
               }
                %>
        <table border="0">
            <tbody>
                <tr>
                    <td>C&oacute;digo</td>
                    <td><input type="text" name="CodigoArea" value="" /></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="NombreArea" value="" /></td>
                </tr>
                <tr>
                    <td><input type="button" value="Guardar" /></td>
                    <td><input type="button" value="Cancelar" onclick="location.href='../Mantenimiento.jsp'"/></td>
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
   </center> </body>
</html>

