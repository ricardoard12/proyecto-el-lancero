/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Arma;
import Procesos.ArmaBD1;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@author Henry Joe Wong Urquiza

public class Controlador extends HttpServlet {

    //Para controlar peticiones del tipo GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    //Para controlar peticiones del tipo POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    //Un metodo que recibe todas las peticiones a si sea GET y POST
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //La accion se va a guardar en un caja de texto oculto que nos dira que accion
        //debemos hacer
        String accion = request.getParameter("accion");
        if (accion.equals("RegistrarArma")) {
            this.registrarArma(request, response);
        } else if (accion.equals("ModificarArma")) {
            this.actualizarArma(request, response);
        } else if (accion.equals("AnadirCarrito")) {
            this.añadirCarrito(request, response);
        } 

    }
    //Metodo que sirve para registrar un arma 
    private void registrarArma(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Arma a = new Arma();
        //request.getParameter --> Sirve para obtener los valores de las cajas de texto
        a.setCodigo_Color(Integer.parseInt(request.getParameter("txtCodigo_Color")));
        a.setCodigo_Modelo(Integer.parseInt(request.getParameter("txtCodigo_Modelo")));
        a.setCodigo_Marca(Integer.parseInt(request.getParameter("txtCodigo_Marca")));
        a.setNumero_balistica_arma(request.getParameter("txtNumero_balistica_arma"));
        a.setDescripcion_Arma(request.getParameter("txtDescripcion_Arma"));
        a.setSerie_Arma(request.getParameter("txtSerie_Arma"));
        a.setPrecio_Arma(request.getParameter("txtPrecio_Arma"));
        boolean rpta = ArmaBD1.insertarArma(a);
        if (rpta) {
            //Si inserto lo redireccionamos a otra pagina que se llama "mensaje.jsp"
            response.sendRedirect("mensaje.jsp?men=Se registro el arma de manera correcta");
        } else {
            //Si no se inserto lo redireccionamos a otra pagina que se llama "mensaje.jsp"
            response.sendRedirect("mensaje.jsp?men= ERROR! No se registro el arma");
        }
    }
    //Metodo que sirve para actualizar un arma
    private void actualizarArma(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Arma a = new Arma();
        a.setCodigo_arma(Integer.parseInt(request.getParameter("txtCodigo_arma")));
        a.setCodigo_Color(Integer.parseInt(request.getParameter("txtCodigo_Color")));
        a.setCodigo_Modelo(Integer.parseInt(request.getParameter("txtCodigo_Modelo")));
        a.setCodigo_Marca(Integer.parseInt(request.getParameter("txtCodigo_Marca")));
        a.setNumero_balistica_arma(request.getParameter("txtNumero_balistica_arma"));
        a.setDescripcion_Arma(request.getParameter("txtDescripcion_Arma"));
        a.setSerie_Arma(request.getParameter("txtSerie_Arma"));
        a.setPrecio_Arma(request.getParameter("txtPrecio_Arma"));
        boolean rpta = ArmaBD1.actualizarArma(a);
        if (rpta) {
            response.sendRedirect("mensaje.jsp?men=Se actualizo el arma de manera correcta");
        } else {
            response.sendRedirect("mensaje.jsp?men= ERROR! No se actualizo el arma");
        }
    }
    //Sirve para añadir un detalle al carrito
    //La informacion del carrito de compras se guarda en una sesion
    private void añadirCarrito(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Obtenemos la sesion actual
        HttpSession sesion = request.getSession();
        ArrayList<DetalleVenta> carrito;
        //Si no existe la sesion creamos al carrito de cmoras
        if (sesion.getAttribute("carrito") == null) {
            carrito = new ArrayList<DetalleVenta>();
        } else {
            carrito = (ArrayList<DetalleVenta>) sesion.getAttribute("carrito");
        }
        //Obtenemos el producto que deseamos añadir al carrito
        Producto p = ProductoBD.obtenerProducto(Integer.parseInt(request.getParameter("txtCodigo")));
        //Creamos un detalle para el carrtio
        DetalleVenta d = new DetalleVenta();
        //Obtenemos los valores de la caja de texto
        d.setCodigoProducto(Integer.parseInt(request.getParameter("txtCodigo")));
        d.setProducto(p);
        d.setCantidad(Double.parseDouble(request.getParameter("txtCantidad")));
        //Calculamos el descuento, si es sub detalle es mayor a 50 se le hace
        //un descuento del 5% aca es donde se encuentra la logica del negocio
        double subTotal = p.getPrecio() * d.getCantidad();
        if (subTotal > 50) {
            d.setDescuento(subTotal * (5D / 100D));
        } else {
            d.setDescuento(0);
        }
        //Sirva para saber si tenemos agregado el producto al carrito de compras
        int indice = -1;
        //recorremos todo el carrito de compras
        for (int i = 0; i < carrito.size(); i++) {
            DetalleVenta det = carrito.get(i);
            if (det.getCodigoProducto() == p.getCodigoProducto()) {
                //Si el producto ya esta en el carrito, obtengo el indice dentro
                //del arreglo para actualizar al carrito de compras
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            //Si es -1 es porque voy a registrar
            carrito.add(d);
        } else {
            //Si es otro valor es porque el producto esta en el carrito
            //y vamos actualizar la 
            carrito.set(indice, d);
        }
        //Actualizamos la sesion del carrito de compras
        sesion.setAttribute("carrito", carrito);
        //Redireccionamos al formulario de culminar la venta
        response.sendRedirect("registrarVenta.jsp");
    }
    //Metodo que sirve para registrar toda la venta en la base de datos
    private void registrarVenta(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        Venta v=new Venta();
        v.setCliente(request.getParameter("txtCliente").toUpperCase());
        ArrayList<DetalleVenta> detalle  = (ArrayList<DetalleVenta>) sesion.getAttribute("carrito");
        boolean rpta=VentaBD.insertarVenta(v, detalle);
        if (rpta) {
            response.sendRedirect("mensaje.jsp?men=Se registro la venta de manera correcta");
        } else {
            response.sendRedirect("mensaje.jsp?men=No se registro la venta");
        }
    }
}
