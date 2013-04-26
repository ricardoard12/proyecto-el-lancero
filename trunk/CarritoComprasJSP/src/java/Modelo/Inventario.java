/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.Timestamp;



/**
 *
 * @author Mario
 */
public class Inventario {

    //este metodo es para evitar el error del InventarioDB1
    public static boolean insetarInventario(Inventario inv, Connection cn) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    private int codigo_inv;
    //llave foranea
    private int codigo_arma;
    private int codigo_mu;
    private int codigo_acc;
    private int codigo_dp;
    private int codigo_suc;
    //terminan las llaves foraneas
    private String cantidad_inv;
    private String descripcion;
    private Timestamp fecha_ingreso_inv;
    private Timestamp fecha_salida_inv;
    
    private Arma arma;
    private Municion municion;
    private Accesorio accesorio;
    private Detalle_Pedido detalle_pedido;
    private Sucursal sucursal;
    
    
    public Inventario () {
      
}

    
    public Inventario(int codigo_inv, int codigo_arma, int codigo_mu, int codigo_acc, int codigo_dp, int codigo_suc, String cantidad_inv, String descripcion, Timestamp fecha_ingreso_inv, Timestamp fecha_salida_inv) {
        this.codigo_inv = codigo_inv;
        this.codigo_arma = codigo_arma;
        this.codigo_mu = codigo_mu;
        this.codigo_acc = codigo_acc;
        this.codigo_dp = codigo_dp;
        this.codigo_suc = codigo_suc;
        this.cantidad_inv = cantidad_inv;
        this.descripcion = descripcion;
        this.fecha_ingreso_inv = fecha_ingreso_inv;
        this.fecha_salida_inv = fecha_salida_inv;
    }

    public int getCodigo_inv() {
        return codigo_inv;
    }

    public void setCodigo_inv(int codigo_inv) {
        this.codigo_inv = codigo_inv;
    }

    public int getCodigo_arma() {
        return codigo_arma;
    }

    public void setCodigo_arma(int codigo_arma) {
        this.codigo_arma = codigo_arma;
    }

    public int getCodigo_mu() {
        return codigo_mu;
    }

    public void setCodigo_mu(int codigo_mu) {
        this.codigo_mu = codigo_mu;
    }

    public int getCodigo_acc() {
        return codigo_acc;
    }

    public void setCodigo_acc(int codigo_acc) {
        this.codigo_acc = codigo_acc;
    }

    public int getCodigo_dp() {
        return codigo_dp;
    }

    public void setCodigo_dp(int codigo_dp) {
        this.codigo_dp = codigo_dp;
    }

    public int getCodigo_suc() {
        return codigo_suc;
    }

    public void setCodigo_suc(int codigo_suc) {
        this.codigo_suc = codigo_suc;
    }

    public String getCantidad_inv() {
        return cantidad_inv;
    }

    public void setCantidad_inv(String cantidad_inv) {
        this.cantidad_inv = cantidad_inv;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha_ingreso_inv() {
        return fecha_ingreso_inv;
    }

    public void setFecha_ingreso_inv(Timestamp fecha_ingreso_inv) {
        this.fecha_ingreso_inv = fecha_ingreso_inv;
    }

    public Timestamp getFecha_salida_inv() {
        return fecha_salida_inv;
    }

    public void setFecha_salida_inv(Timestamp fecha_salida_inv) {
        this.fecha_salida_inv = fecha_salida_inv;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    
    //fk
    public Municion getMunicion() {
        return municion;
    }

    public void setMunicion(Municion municion) {
        this.municion = municion;
    }

    public Accesorio getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Accesorio accesorio) {
        this.accesorio = accesorio;
    }

    public Detalle_Pedido getDetalle_pedido() {
        return detalle_pedido;
    }

    public void setDetalle_pedido(Detalle_Pedido detalle_pedido) {
        this.detalle_pedido = detalle_pedido;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    //terminan las FK
    
    
}
