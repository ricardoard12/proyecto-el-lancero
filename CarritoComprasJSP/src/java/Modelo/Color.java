/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Color {
    private int codigo_color;
    private String nombre_color;
    
    
    public Color(int codigo_color, String nombre_color) {
        this.codigo_color = codigo_color;
        this.nombre_color = nombre_color;
    }
    
    @Override
     public String toString() {
        return nombre_color.toUpperCase();
      }

    public int getCodigo_color() {
        return codigo_color;
    }

    public void setCodigo_color(int codigo_color) {
        this.codigo_color = codigo_color;
    }

    public String getNombre_color() {
        return nombre_color;
    }

    public void setNombre_color(String nombre_color) {
        this.nombre_color = nombre_color;
    }
    
     
}
