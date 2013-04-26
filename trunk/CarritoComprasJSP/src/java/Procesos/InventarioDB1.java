/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Modelo.Arma;
import Modelo.Inventario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

// @autor Mario

public class InventarioDB1 {

    //Metodo utilizado para insertar una Venta a nuestra Base de datos
    public static synchronized boolean insertarInventario(Inventario varInventario, ArrayList<Inventario> inventario) {

        Connection cn = null;
        CallableStatement cl = null;
        boolean rpta = false;
        try {
            //Nombre del procedimiento almacenado y como espera tres parametros
            //le ponemos 3 interrogantes
            String call = "{CALL spI_inventario(?,?,?,?,?,?,?,?,?,?)}";
//Obtenemos la conexion
            cn = Conexion2.getConexion();
            //Decimos que vamos a crear una transaccion
            cn.setAutoCommit(false);
            //Preparamos la sentecia
            cl = cn.prepareCall(call);
            //Como el codigo se autogenera y es del tipo OUT en el procedimiento
            //almacenado le decimos que es OUT y el del tipo Integer en Java
            cl.registerOutParameter(1, Types.INTEGER);
            //El siguiente parametro del procedimiento almacenado es el cliente
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
            
            rpta = cl.executeUpdate() == 1 ? true : false;
            //Codigo que se genero producto de la insercion ---> codigoVenta
            varInventario.setCodigo_inv(cl.getInt(1));
            if (rpta) {
                for (Inventario inv : inventario) {
                    //Establecemos al detalle el codigo genero producto de la venta
                    inv.setCodigo_inv(varInventario.getCodigo_inv());
                    //Insertamos el detalle y le pasamos la conexion
                    rpta = Inventario.insetarInventario(inv, cn);
                    //Si nos devuelve false salimos del for
                    if (!rpta) {
                        break;
                    }
                }
                if (rpta) {
                    //Confirmamos la transaccion
                    cn.commit();
                } else {
                    //Negamos la transaccion
                    Conexion2.deshacerCambios(cn);
                }
            } else {
                //Negamos la transaccion
                Conexion2.deshacerCambios(cn);
            }
            Conexion2.cerrarCall(cl);
            Conexion2.cerrarConexion(cn);
        } catch (SQLException e) {
            e.printStackTrace();
            Conexion2.deshacerCambios(cn);
            Conexion2.cerrarCall(cl);
            Conexion2.cerrarConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
            Conexion2.deshacerCambios(cn);
            Conexion2.cerrarCall(cl);
            Conexion2.cerrarConexion(cn);
        }
        return rpta;
    }

    //Metodo utilizado para obtener todos las ventas de nuestra base de datos
    public static synchronized ArrayList<Inventario> obtenerInventario() {
        //El array que contendra todos nuestros productos
        ArrayList<Inventario> lista = new ArrayList<Inventario>();
        Connection cn = null;
        CallableStatement cl = null;
        ResultSet rs = null;
        
        try {
            //Nombre del procedimiento almacenado
            String call = "{CALL spF_inventario_All()}";
cn = Conexion2.getConexion();
            cl = cn.prepareCall(call);
            //La sentencia lo almacenamos en un resulset
            rs = cl.executeQuery();
            //Consultamos si hay datos para recorrerlo
            //e insertarlo en nuestro array
            while (rs.next()) {
                Inventario inv=new Inventario();
                Arma arm=new Arma();
                
                inv.setCodigo_inv(rs.getInt("Codigo_inv"));
                inv.setCodigo_arma(rs.getInt("Codigo_arma"));
                inv.setCodigo_mu(rs.getInt("Codigo_mu"));
                inv.setCodigo_acc(rs.getInt("Codigo_acc"));
                inv.setCodigo_dp(rs.getInt("Codigo_dp"));
                inv.setCodigo_suc(rs.getInt("Codigo_suc"));
                inv.setCantidad_inv(rs.getString("Cantadiad_inv"));
                inv.setDescripcion(rs.getString("Descripcion_inv"));
                inv.setFecha_ingreso_inv(rs.getTimestamp("Fecha_ingreso_inv"));
                inv.setFecha_salida_inv(rs.getTimestamp("Fecha_salida_inv"));
                
                arm.setCodigo_arma(rs.getInt("Codigo_arma"));
                arm.setCodigo_Marca(rs.getInt("Codigo_marca"));
                arm.setCodigo_Modelo(rs.getInt("Codigo_modelo"));
                arm.setCodigo_Color(rs.getInt("Codigo_color"));
                arm.setSerie_Arma(rs.getString("Serie_arma"));
                arm.setPrecio_Arma(rs.getString("Precio_arma"));
                arm.setDescripcion_Arma(rs.getString("Descripcion_arma"));
                arm.setNumero_balistica_arma (rs.getString("Numero_balistica_arma"));
                
                lista.add(inv);
                
            }
                /*
                pro.setCodigoProducto(rs.getInt("CodigoProducto"));
                pro.setNombre(rs.getString("Nombre"));
                pro.setPrecio(rs.getDouble("Precio"));
                det.setCantidad(rs.getDouble("Cantidad"));
                det.setDescuento(rs.getDouble("Parcial"));
                det.setVenta(ven);
                det.setProducto(pro);
                lista.add(det);
            }
            */ 
           
            Conexion2.cerrarCall(cl);
            Conexion2.cerrarConexion(cn);
        } catch (SQLException e) {
            e.printStackTrace();
            Conexion2.cerrarCall(cl);
            Conexion2.cerrarConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
            Conexion2.cerrarCall(cl);
            Conexion2.cerrarConexion(cn);
        }
        return lista;
    }
}