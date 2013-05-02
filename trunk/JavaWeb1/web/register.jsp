<%-- 
    Document   : register
    Created on : 05-01-2013, 07:33:10 PM
    Author     : Mario
--%>
       <%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%-- En caso de que exista una sesion iniciada redirecciono a index.jsp. "NO tiene caso mostrar este formulario cuando hay una sesion iniciada --%>
    <t:if test="${sessionScope['sessionEmail']!=null}">
       <% response.sendRedirect("index.jsp");%>
    </t:if>
    <!DOCTYPE html>
    <html>
       <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <title>Registrarse</title>
       </head>
       <body>
           <h1>Iniciar sesion</h1>
           <p><a href="login.jsp">Iniciar Sesion</a></p>
           
           <p style="color: #ff0000">${sessionScope['error']}</p>
           <form action="Register" method="post">
               <p>Nombre: <input type="text" name="name"></p>
               <p>Email: <input type="text" name="email"></p>
               <p>Contraseña: <input type="password" name="password1"></p>
               <p>Confirma contraseña <input type="password" name="password2"></p>
               <p><input type="submit" value="Entrar"></p>
           </form>
       </body>
    </html>
