/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Reyes
 */
@Entity
@Table(name = "departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByCodigoDepa", query = "SELECT d FROM Departamento d WHERE d.codigoDepa = :codigoDepa"),
    @NamedQuery(name = "Departamento.findByCodigoPais", query = "SELECT d FROM Departamento d WHERE d.codigoPais = :codigoPais")})
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_DEPA")
    private Integer codigoDepa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_PAIS")
    private int codigoPais;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_DEPA")
    private String nombreDepa;

    public Departamento() {
    }

    public Departamento(Integer codigoDepa) {
        this.codigoDepa = codigoDepa;
    }

    public Departamento(Integer codigoDepa, int codigoPais, String nombreDepa) {
        this.codigoDepa = codigoDepa;
        this.codigoPais = codigoPais;
        this.nombreDepa = nombreDepa;
    }

    public Integer getCodigoDepa() {
        return codigoDepa;
    }

    public void setCodigoDepa(Integer codigoDepa) {
        this.codigoDepa = codigoDepa;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombreDepa() {
        return nombreDepa;
    }

    public void setNombreDepa(String nombreDepa) {
        this.nombreDepa = nombreDepa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoDepa != null ? codigoDepa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.codigoDepa == null && other.codigoDepa != null) || (this.codigoDepa != null && !this.codigoDepa.equals(other.codigoDepa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mantenimientos.Departamento[ codigoDepa=" + codigoDepa + " ]";
    }
    
}
