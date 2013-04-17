/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

// @autor Mario
import Modelo.Arma;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class ArmaBD {

    //Metodo utilizado para insertar un Detalle de Venta a nuestra Base de datos
    //Obtenemos la conexion de Venta debido a que la clase Venta es la que inicia
    //la transaccion
    public static synchronized boolean insertarArmaBD(Arma varArmaBD, Connection cn) {
        CallableStatement cl = null;
        boolean rpta = false;
        try {
            //Nombre del procedimiento almacenado y como espera tres parametros
            //le ponemos 3 interrogantes
            String call = "{CALL spI_Arma(?,?,?,?,?,?)}";
//Preparamos la sentecia
            cl = cn.prepareCall(call);
            //Codigo de la venta
            cl.setInt(1, varArmaBD.getCodigo_Marca());
            //Codigo del producto
            cl.setInt(2, varArmaBD.getCodigo_Modelo());
            //La cantidad
            cl.setInt(3, varArmaBD.getCodigo_Color());
            //El descuento
            cl.setString(4, varArmaBD.getSerie_Arma());
            cl.setString (5, varArmaBD.getNumero_balistica_arma());
            cl.setString(6, varArmaBD.getPrecio_Arma());
            cl.setString(7, varArmaBD.getDescripcion_Arma());
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
