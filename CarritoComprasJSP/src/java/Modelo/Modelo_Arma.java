/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Modelo_Arma {
    private int codigo_modelo;
    private int codigo_calibre;
    private int codigo_ta;
    private String nombre_modelo;
    private String descripcion_modelo;
    
    private Tipo_Arma tipo_arma;
    private Calibre calibre;
    

public Modelo_Arma(int codigo_modelo, int codigo_calibre, int codigo_ta, String nombre_modelo, 
String descripcion_modelo) {
        this.codigo_modelo = codigo_modelo;
        this.codigo_calibre = codigo_calibre;
        this.codigo_ta = codigo_ta;
this.nombre_modelo = nombre_modelo;
this.descripcion_modelo = descripcion_modelo;

    }

public String toString() {
        return nombre_modelo.toUpperCase();
}

public int getCodigo_Modelo() {
        return codigo_modelo;
    }

public void setCodigo_Modelo(int codigo_modelo) {
        this.codigo_modelo = codigo_modelo;
    }

      public int getCodigo_Calibre() {
        return codigo_calibre;
    }

    public void setCodigo_Calibre(int codigo_calibre) {
        this.codigo_calibre = codigo_calibre;
    }

    public int getCodigo_Ta() {
        return codigo_ta;
    }
    
    public void setCodigo_Ta(int codigo_ta) {
        this.codigo_ta = codigo_ta;
    }
    
      public String getNombre_Modelo() {
        return nombre_modelo;
    }

    public void setNombre_Modelo(String nombre_modelo) {
        this.nombre_modelo = nombre_modelo;
    }
    
    public String getDescripcion_Modelo() {
        return descripcion_modelo;
    }
    
     public void setDescripcion_Modelo(String descripcion_modelo) {
        this.descripcion_modelo = descripcion_modelo;
    }

    public Tipo_Arma getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(Tipo_Arma tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    public Calibre getCalibre() {
        return calibre;
    }

    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }
     
        
}