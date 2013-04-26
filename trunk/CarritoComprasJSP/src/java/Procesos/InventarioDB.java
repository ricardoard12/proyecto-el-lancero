/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

// @Mario
import Modelo.Inventario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;


public class InventarioDB {

    //Metodo utilizado para insertar un Detalle de Venta a nuestra Base de datos
    //Obtenemos la conexion de Venta debido a que la clase Venta es la que inicia
    //la transaccion
    public static synchronized boolean insertarInventario(Inventario varInventario, Connection cn) {
        CallableStatement cl = null;
        boolean rpta = false;
        try {
            //Nombre del procedimiento almacenado y como espera tres parametros
            //le ponemos 3 interrogantes
            String call = "{CALL spI_inventario(?,?,?,?,?,?,?,?,?,?)}";
//Preparamos la sentecia
            cl = cn.prepareCall(call);
            //Codigo de la venta
            cl.registerOutParameter(1, Types.INTEGER);
            //Codigo del producto
            cl.setInt(2, varInventario.getCodigo_acc());
            //La cantidad
            cl.setInt(3, varInventario.getCodigo_arma());
            //El descuento
            cl.setInt(4, varInventario.getCodigo_dp());
            cl.setInt(5, varInventario.getCodigo_mu());
            cl.setInt(6, varInventario.getCodigo_suc());
            cl.setString(7, varInventario.getCantidad_inv());
            cl.setString(8, varInventario.getDescripcion());
            cl.setTimestamp(9, varInventario.getFecha_ingreso_inv());
            cl.setTimestamp(10, varInventario.getFecha_salida_inv());
            //Ejecutamos la sentencia y si nos devuelve el valor de 1 es porque
            //registro de forma correcta los datos
            rpta = cl.executeUpdate() == 1 ? true : false;
            Conexion2.cerrarCall(cl);
        } catch (SQLException e) {
            e.printStackTrace();
            Conexion2.cerrarCall(cl);
        } catch (Exception e) {
            e.printStackTrace();
            Conexion2.cerrarCall(cl);
        }
        return rpta;
    }
}