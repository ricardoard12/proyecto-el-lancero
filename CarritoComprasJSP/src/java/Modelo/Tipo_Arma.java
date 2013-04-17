/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Tipo_Arma {
    private int codigo_ta;
    private String tipo_ta;
    
    public Tipo_Arma (int codigo_ta, String tipo_ta
            ){
        this.codigo_ta=codigo_ta;
        this.tipo_ta=tipo_ta;
            
        }

    public int getCodigo_ta() {
        return codigo_ta;
    }

    public void setCodigo_ta(int codigo_ta) {
        this.codigo_ta = codigo_ta;
    }

    public String getTipo_ta() {
        return tipo_ta;
    }

    public void setTipo_ta(String tipo_ta) {
        this.tipo_ta = tipo_ta;
    }
    
}