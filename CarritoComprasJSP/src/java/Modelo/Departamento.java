/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Departamento {
    private int codigo_depa;
    private int codigo_pais;
    private String nombre_depa;
    
    //FK
    private Pais pais;
    
    public Departamento () {
      this.setCodigo_depa(0);
      this.setCodigo_pais(0);
      this.setNombre_depa(" ");
      
    }

    public Departamento(int codigo_depa, int codigo_pais, String nombre_depa) {
        this.codigo_depa = codigo_depa;
        this.codigo_pais = codigo_pais;
        this.nombre_depa = nombre_depa;
    }

    public int getCodigo_depa() {
        return codigo_depa;
    }

    public void setCodigo_depa(int codigo_depa) {
        this.codigo_depa = codigo_depa;
    }

    public int getCodigo_pais() {
        return codigo_pais;
    }

    public void setCodigo_pais(int codigo_pais) {
        this.codigo_pais = codigo_pais;
    }

    public String getNombre_depa() {
        return nombre_depa;
    }

    public void setNombre_depa(String nombre_depa) {
        this.nombre_depa = nombre_depa;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}
