/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Pais {

    private int codigo_pais;
    private int codigo_carea;
    private String nombre_pais;
    
    private Codigo_Area codigo_area;
    
    //contructor vacio
    public Pais(){
      }
    
    public Pais (int codigo_pais, int codigo_carea, String nombre_pais) {
    this.codigo_pais=codigo_pais;  
    this.codigo_carea=codigo_carea;
    this.nombre_pais=nombre_pais;
    }

    public int getCodigo_pais() {
        return codigo_pais;
    }

    public void setCodigo_pais(int codigo_pais) {
        this.codigo_pais = codigo_pais;
    }

    public int getCodigo_carea() {
        return codigo_carea;
    }

    public void setCodigo_carea(int codigo_carea) {
        this.codigo_carea = codigo_carea;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }
    
    
    //llamando las llaves foraneas
    
    public Codigo_Area getCodigo_Area() {
        return codigo_area;
    }

    public void setCodigo_Area(Codigo_Area codigo_area) {
        this.codigo_area = codigo_area;
    }
    
}
