<%-- 
    Document   : Encabezado2
    Created on : 04-26-2013, 11:46:00 PM
    Author     : Reyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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