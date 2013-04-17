/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Calibre {
    private int codigo_calibre;
    private String nombre_calibre;
    private String descripcion_calibre;
    

public Calibre (int codigo_calibre, String nombre_calibre, String descripcion_calibre
            ){
        this.codigo_calibre=codigo_calibre;
        this.nombre_calibre=nombre_calibre;
        this.descripcion_calibre=descripcion_calibre;
            }

    public int getCodigo_calibre() {
        return codigo_calibre;
    }

    public void setCodigo_calibre(int codigo_calibre) {
        this.codigo_calibre = codigo_calibre;
    }

    public String getNombre_calibre() {
        return nombre_calibre;
    }

    public void setNombre_calibre(String nombre_calibre) {
        this.nombre_calibre = nombre_calibre;
    }

    public String getDescripcion_calibre() {
        return descripcion_calibre;
    }

    public void setDescripcion_calibre(String descripcion_calibre) {
        this.descripcion_calibre = descripcion_calibre;
    }

}
