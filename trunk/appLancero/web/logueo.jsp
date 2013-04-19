
<%-- 
    Document   : logueo
    Created on : 03-25-2013, 08:06:19 PM
    Author     : Jaime Reyes
--%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
         
        <h1>Hello World!</h1>
        <jsp:useBean id="ConsultaConexion" scope="page" class="Aplicacion.Conexion" />
           <%
            String Usuario=request.getParameter("Usuario");
            String Contrasena=request.getParameter("Contrasena");
            
            boolean estado = ConsultaConexion.consultarAdmin(Usuario, Contrasena);
            if(estado != true){
                response.sendRedirect("Inicio.jsp");
            }else{
                response.sendRedirect("index.jsp");
            }
        %> 
        
    </body>
</html>
