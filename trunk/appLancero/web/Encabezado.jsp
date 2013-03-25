

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
          <li class="selected"><a href="Inicio.jsp">Inicio</a></li>
          <li><a href="#">Inventario</a>
             <ul>
                <a href="Armas.jsp">Armas</a>
                <a href="Municiones.jsp">Municiones</a>
                <a href="Accesorios.jsp">Accesorios</a>
             </ul>
          <li><a href="#">Actividad</a>
            <ul>
                <li><a href="#">Registrar producto</a>
                    <ul>
                        <a href="RegistrarArma.jsp">Registrar Armas</a>
                        <a href="RegistrarMunicion.jsp">Registrar Municiones</a>
                        <a href="RegistrarAccesorio.jsp">Registrar Accesorios</a>
                    </ul>
                <li><a href="#">ModificarProducto</a>
                    <ul>
                        <a href="ModificarArma.jsp">Modificar Arma</a>
                        <a href="ModificarMunicion.jsp">Modificar municion</a>
                        <a href="ModificarAccesorio.jsp">Modificar Accesorio</a>
                    </ul>
                <li><a href="EliminarProducto.jsp">Eliminar Producto</a>
            </ul>          
          <li><a href="Sucursal.jsp">Pedido Sucursal</a>
          <li><a href="#">Reporteria</a>
              <ul>
                  <li><a href="ReporteReserva.jsp">Reporte Reserva</a></li>
                  <li><a href="ReporteSucursal.jsp">Reporte Sucursal</a></li>
                  <li><a href="ReporteClientes.jsp">Reporte Cliente</a></li>
              </ul>
          <li><a href="index.jsp">Cerrar Sesión</a>
          </ul>
      </nav>
    </header>