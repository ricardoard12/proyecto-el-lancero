/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Codigo_Area {
    private int codigo_carea;
    private String nombre_carea;
    
    public Codigo_Area (int codigo_carea, String nombre_carea){
    
        this.codigo_carea = codigo_carea;
        this.nombre_carea = nombre_carea;
    }

    public int getCodigo_carea() {
        return codigo_carea;
    }

    public void setCodigo_carea(int codigo_carea) {
        this.codigo_carea = codigo_carea;
    }

    public String getNombre_carea() {
        return nombre_carea;
    }

    public void setNombre_carea(String nombre_carea) {
        this.nombre_carea = nombre_carea;
    }
    
    }
