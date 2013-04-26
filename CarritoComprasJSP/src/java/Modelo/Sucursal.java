/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Sucursal {
    private int codigo_suc;
    private int codigo_depa;
    private String nombre_suc;
    private String direccion_suc;
    private String telefono;
    
    //FK
    private Departamento departamento;
    
    public Sucursal () {
     this.setCodigo_suc(0);   
     this.setCodigo_depa(0);
     this.setNombre_suc(" ");
     this.setDireccion_suc(" ");
     this.setTelefono(" ");
    }

    public Sucursal(int codigo_suc, int codigo_depa, String nombre_suc, String direccion_suc, String telefono) {
        this.codigo_suc = codigo_suc;
        this.codigo_depa = codigo_depa;
        this.nombre_suc = nombre_suc;
        this.direccion_suc = direccion_suc;
        this.telefono = telefono;
    }

    public int getCodigo_suc() {
        return codigo_suc;
    }

    public void setCodigo_suc(int codigo_suc) {
        this.codigo_suc = codigo_suc;
    }

    public int getCodigo_depa() {
        return codigo_depa;
    }

    public void setCodigo_depa(int codigo_depa) {
        this.codigo_depa = codigo_depa;
    }

    public String getNombre_suc() {
        return nombre_suc;
    }

    public void setNombre_suc(String nombre_suc) {
        this.nombre_suc = nombre_suc;
    }

    public String getDireccion_suc() {
        return direccion_suc;
    }

    public void setDireccion_suc(String direccion_suc) {
        this.direccion_suc = direccion_suc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
