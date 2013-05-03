
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
        <jsp:useBean id="ConsultaConexion" scope="session" class="Aplicacion.Conexion" />
        <%--   <%
            String Usuario=request.getParameter("Usuario");
            String Contrasena=request.getParameter("Contrasena");
            
            Aplicacion.admin Admin = ConsultaConexion.consultarAdmin(Usuario, Contrasena);
            if(Admin==null){
                response.sendRedirect("Index.Jsp");
                
            }else{
               response.sendRedirect("Inicio.Jsp");
            }
        %> --%>


    </body>
</html>
