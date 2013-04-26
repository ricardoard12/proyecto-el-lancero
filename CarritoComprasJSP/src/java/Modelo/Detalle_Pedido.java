/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Detalle_Pedido {
    private int codigo_dp;
    private String descripcion_dp;
    private String cantidad_lote_dp;
    private String precio_lote_dp;

    
    public Detalle_Pedido () {
        
      this.setCodigo_dp(0);
      this.setDescripcion_dp(" ");
      this.setCantidad_lote_dp(" ");
      this.setPrecio_lote_dp(" ");
    }
    
    public Detalle_Pedido(int codigo_dp, String descripcion_dp, String cantidad_lote_dp, String precio_lote_dp) {
        this.codigo_dp = codigo_dp;
        this.descripcion_dp = descripcion_dp;
        this.cantidad_lote_dp = cantidad_lote_dp;
        this.precio_lote_dp = precio_lote_dp;
    }

    public int getCodigo_dp() {
        return codigo_dp;
    }

    public void setCodigo_dp(int codigo_dp) {
        this.codigo_dp = codigo_dp;
    }

    public String getDescripcion_dp() {
        return descripcion_dp;
    }

    public void setDescripcion_dp(String descripcion_dp) {
        this.descripcion_dp = descripcion_dp;
    }

    public String getCantidad_lote_dp() {
        return cantidad_lote_dp;
    }

    public void setCantidad_lote_dp(String cantidad_lote_dp) {
        this.cantidad_lote_dp = cantidad_lote_dp;
    }

    public String getPrecio_lote_dp() {
        return precio_lote_dp;
    }

    public void setPrecio_lote_dp(String precio_lote_dp) {
        this.precio_lote_dp = precio_lote_dp;
    }
    
    
}
