<%-- 
    Document   : ValidarDatos
    Created on : 03-25-2013, 02:15:57 PM
    Author     : Reyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <%


   Aplicacion.admin p= new Aplicacion.admin();


       p.setUsuario(request.getParameter("usuario"));
       p.setcontrasena(request.getParameter("contrasena"));


       String res=p.insertar3();


    if(res.equals("-1")) {
      out.print("entraste clic aqui para entrar");
              %>
        <a href="Inicio.jsp">entrar ya</a>
    <%
      }



       else if (res.equals("1")){
         out.print("fallo la autentificacion ");}


       else{
           out.print("algo pasa ");
           }


    %>
    </body>
</html>
