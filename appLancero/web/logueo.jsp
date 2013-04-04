<%-- 
    Document   : logueo
    Created on : 03-25-2013, 08:06:19 PM
    Author     : Diego Hernandez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
util.Validar oValidador = new util.Validar();

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
    
String nombre = request.getParameter("USR");
String clave = request.getParameter("CAVE");

boolean estado = oValidador.usuario(nombre, clave);


%>
    </body>
</html>
