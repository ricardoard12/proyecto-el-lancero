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
@Table(name = "pais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByCodigoPais", query = "SELECT p FROM Pais p WHERE p.codigoPais = :codigoPais"),
    @NamedQuery(name = "Pais.findByCodigoCarea", query = "SELECT p FROM Pais p WHERE p.codigoCarea = :codigoCarea")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_PAIS")
    private Integer codigoPais;
    @Column(name = "CODIGO_CAREA")
    private Long codigoCarea;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_PAIS")
    private String nombrePais;

    public Pais() {
    }

    public Pais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Pais(Integer codigoPais, String nombrePais) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
    }

    public Integer getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Long getCodigoCarea() {
        return codigoCarea;
    }

    public void setCodigoCarea(Long codigoCarea) {
        this.codigoCarea = codigoCarea;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPais != null ? codigoPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.codigoPais == null && other.codigoPais != null) || (this.codigoPais != null && !this.codigoPais.equals(other.codigoPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mantenimientos.Pais[ codigoPais=" + codigoPais + " ]";
    }
    
}
