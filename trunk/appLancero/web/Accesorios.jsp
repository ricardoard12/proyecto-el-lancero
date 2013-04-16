<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
         <%
        Connection conn=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); //se carga el driver
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/el_lancero", "root", "Hola2013");
            out.print("conexion CTM! xD");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        File reportFile = new File(application.getRealPath("report1.jasper"));

        Map parameters = new HashMap();

        byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath (),parameters,conn);

        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);
        ServletOutputStream ouputStream = response.getOutputStream();
        ouputStream.write(bytes, 0, bytes.length);
        ouputStream.flush();
        ouputStream.close();
        %>
        </div>
      </div>
      <div class="content">
          <center>
              <h3>Existencia de Accesorios</h3>
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
                          <td><input type="submit" value="Mostrar registro" onclick/></td>
                          <td></td>
                      </tr>
                      <tr>
                          <td></td>                          
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
