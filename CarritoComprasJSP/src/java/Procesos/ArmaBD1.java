/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Modelo.Arma;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

// @autor Henry Joe Wong Uruqiza
// Archivo: ProductoBD.java
// Creado: 24FEBRERO2011 12:39:08 PM
public class ArmaBD1 {
    //Metodo utilizado para insertar un Producto a nuestra Base de datos

    public static synchronized boolean insertarArma(Arma varArma) {
        Connection cn = null;
        CallableStatement cl = null;
        boolean rpta = false;
        try {
            //Nombre del procedimiento almacenado y como espera tres parametros
            //le ponemos 3 interrogantes
            String call = "{CALL spI_arma(?,?,?,?,?,?,?,?)}";
            //Obtenemos la conexion
            cn = Conexion2.getConexion();
            //Decimos que vamos a crear una transaccion
            cn.setAutoCommit(false);
            //Preparamos la sentecia
            cl = cn.prepareCall(call);
            //Como el codigo se autogenera y es del tipo OUT en el procedimiento
            //almacenado le decimos que es OUT y el del tipo Integer en Java
            cl.registerOutParameter(1, Types.INTEGER);
            //El siguiente parametro del procedimiento almacenado es el nombre
            cl.setInt(2, varArma.getCodigo_Marca());
            cl.setInt(3, varArma.getCodigo_Modelo());
            cl.setInt(4, varArma.getCodigo_Color());
            cl.setString(5, varArma.getSerie_Arma());
            cl.setString(6, varArma.getPrecio_Arma());
            cl.setString(7, varArma.getDescripcion_Arma());
            cl.setString(8, varArma.getNumero_balistica_arma());
            //Ejecutamos la sentencia y si nos devuelve el valor de 1 es porque
            //registro de forma correcta los datos
            rpta = cl.executeUpdate() == 1 ? true : false;
            if (rpta) {
                //Confirmamos la transaccion
                cn.commit();
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

    //Metodo utilizado para insertar un Producto a nuestra Base de datos
    public static synchronized boolean actualizarArma(Arma vararma) {
        Connection cn = null;
        CallableStatement cl = null;
        boolean rpta = false;
        try {
            //Nombre del procedimiento almacenado y como espera tres parametros
            //le ponemos 3 interrogantes
            String call = "{CALL spU_arma(?,?,?,?,?,?,?,?)}";
            //Obtenemos la conexion
            cn = Conexion2.getConexion();
            //Decimos que vamos a crear una transaccion
            cn.setAutoCommit(false);
            //Preparamos la sentecia
            cl = cn.prepareCall(call);
            //El primer parametro del procedimiento almacenado es el codigo
            cl.setInt(1, vararma.getCodigo_arma());
            //El siguiente parametro del procedimiento almacenado es el nombre
           cl.setInt(1, vararma.getCodigo_arma());
           cl.setInt(2, vararma.getCodigo_Modelo());
           cl.setInt(3, vararma.getCodigo_Color());
           cl.setInt(4, vararma.getCodigo_Marca());
           cl.setString(5, vararma.getSerie_Arma());
           cl.setString(6, vararma.getPrecio_Arma());
           cl.setString(7, vararma.getNumero_balistica_arma());
           cl.setString(8, vararma.getDescripcion_Arma());
            //Ejecutamos la sentencia y si nos devuelve el valor de 1 es porque
            //registro de forma correcta los datos
            rpta = cl.executeUpdate() == 1 ? true : false;
            if (rpta) {
                //Confirmamos la transaccion
                cn.commit();
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
    //Metodo utilizado para obtener todos los productos de nuestra base de datos

    public static synchronized ArrayList<Arma> obtenerArma() {
        //El array que contendra todos nuestros productos
        ArrayList<Arma> lista = new ArrayList<Arma>();
        Connection cn = null;
        CallableStatement cl = null;
        ResultSet rs = null;
        try {
            //Nombre del procedimiento almacenado
            String call = "{CALL spF_arma_all()}";
            cn = Conexion2.getConexion();
            cl = cn.prepareCall(call);
            //La sentencia lo almacenamos en un resulset
            rs = cl.executeQuery();
            //Consultamos si hay datos para recorrerlo
            //e insertarlo en nuestro array
            while (rs.next()) {
                Arma a = new Arma();
                //Obtenemos los valores de la consulta y creamos
                //nuestro objeto producto
                a.setCodigo_arma(rs.getInt("codigo_arma"));
                a.setCodigo_Modelo(rs.getInt("codigo_modelo"));
                a.setCodigo_Marca(rs.getInt("codigo_marca"));
                a.setCodigo_Color(rs.getInt("codigo_color"));
                a.setSerie_Arma(rs.getString("serie_arma"));
                a.setDescripcion_Arma(rs.getString("descripcion_arma"));
                a.setNumero_balistica_arma(rs.getString("numero_balistica_arma"));
                a.setPrecio_Arma(rs.getString("precio_arma"));
                //Lo adicionamos a nuestra lista
                lista.add(a);
            }
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

    //Metodo utilizado para obtener todos los productos de nuestra base de datos
    public static synchronized Arma obtenerArma(int codigo_arma) {
        Arma a = new Arma();
        Connection cn = null;
        CallableStatement cl = null;
        ResultSet rs = null;
        try {
            //Nombre del procedimiento almacenado
            String call = "{CALL spF_arma_one(?)}";
            cn = Conexion2.getConexion();
            cl = cn.prepareCall(call);
            cl.setInt(1, codigo_arma);
            //La sentencia lo almacenamos en un resulset
            rs = cl.executeQuery();
            //Consultamos si hay datos para recorrerlo
            //e insertarlo en nuestro array
            while (rs.next()) {
                //Obtenemos los valores de la consulta y creamos
                //nuestro objeto producto
                a.setCodigo_arma(rs.getInt("codigo_arma"));
                a.setCodigo_Modelo(rs.getInt("codigo_modelo"));
                a.setCodigo_Marca(rs.getInt("codigo_marca"));
                a.setCodigo_Color(rs.getInt("codigo_color"));
                a.setSerie_Arma(rs.getString("serie_arma"));
                a.setDescripcion_Arma(rs.getString("descripcion_arma"));
                a.setNumero_balistica_arma(rs.getString("numero_balistica_arma"));
                a.setPrecio_Arma(rs.getString("precio_arma"));
            }
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
        return a;
    }
}
