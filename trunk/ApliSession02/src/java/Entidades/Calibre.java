/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Reyes
 */
@Entity
@Table(name = "calibre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calibre.findAll", query = "SELECT c FROM Calibre c"),
    @NamedQuery(name = "Calibre.findByCodigoCalibre", query = "SELECT c FROM Calibre c WHERE c.codigoCalibre = :codigoCalibre")})
public class Calibre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_CALIBRE")
    private Long codigoCalibre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_CALIBRE")
    private String nombreCalibre;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPCION_CALIBRE")
    private String descripcionCalibre;
    @OneToMany(mappedBy = "codigoCalibre")
    private List<Municion> municionList;
    @OneToMany(mappedBy = "codigoCalibre")
    private List<ModeloArma> modeloArmaList;

    public Calibre() {
    }

    public Calibre(Long codigoCalibre) {
        this.codigoCalibre = codigoCalibre;
    }

    public Calibre(Long codigoCalibre, String nombreCalibre) {
        this.codigoCalibre = codigoCalibre;
        this.nombreCalibre = nombreCalibre;
    }

    public Long getCodigoCalibre() {
        return codigoCalibre;
    }

    public void setCodigoCalibre(Long codigoCalibre) {
        this.codigoCalibre = codigoCalibre;
    }

    public String getNombreCalibre() {
        return nombreCalibre;
    }

    public void setNombreCalibre(String nombreCalibre) {
        this.nombreCalibre = nombreCalibre;
    }

    public String getDescripcionCalibre() {
        return descripcionCalibre;
    }

    public void setDescripcionCalibre(String descripcionCalibre) {
        this.descripcionCalibre = descripcionCalibre;
    }

    @XmlTransient
    public List<Municion> getMunicionList() {
        return municionList;
    }

    public void setMunicionList(List<Municion> municionList) {
        this.municionList = municionList;
    }

    @XmlTransient
    public List<ModeloArma> getModeloArmaList() {
        return modeloArmaList;
    }

    public void setModeloArmaList(List<ModeloArma> modeloArmaList) {
        this.modeloArmaList = modeloArmaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCalibre != null ? codigoCalibre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calibre)) {
            return false;
        }
        Calibre other = (Calibre) object;
        if ((this.codigoCalibre == null && other.codigoCalibre != null) || (this.codigoCalibre != null && !this.codigoCalibre.equals(other.codigoCalibre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Calibre[ codigoCalibre=" + codigoCalibre + " ]";
    }
    
}
