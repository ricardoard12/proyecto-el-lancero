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
@Table(name = "codigo_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CodigoArea.findAll", query = "SELECT c FROM CodigoArea c"),
    @NamedQuery(name = "CodigoArea.findByCodigoCarea", query = "SELECT c FROM CodigoArea c WHERE c.codigoCarea = :codigoCarea"),
    @NamedQuery(name = "CodigoArea.findByNombreCarea", query = "SELECT c FROM CodigoArea c WHERE c.nombreCarea = :nombreCarea")})
public class CodigoArea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_CAREA")
    private Long codigoCarea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "NOMBRE_CAREA")
    private String nombreCarea;
    @OneToMany(mappedBy = "codigoCarea")
    private List<Pais> paisList;

    public CodigoArea() {
    }

    public CodigoArea(Long codigoCarea) {
        this.codigoCarea = codigoCarea;
    }

    public CodigoArea(Long codigoCarea, String nombreCarea) {
        this.codigoCarea = codigoCarea;
        this.nombreCarea = nombreCarea;
    }

    public Long getCodigoCarea() {
        return codigoCarea;
    }

    public void setCodigoCarea(Long codigoCarea) {
        this.codigoCarea = codigoCarea;
    }

    public String getNombreCarea() {
        return nombreCarea;
    }

    public void setNombreCarea(String nombreCarea) {
        this.nombreCarea = nombreCarea;
    }

    @XmlTransient
    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCarea != null ? codigoCarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodigoArea)) {
            return false;
        }
        CodigoArea other = (CodigoArea) object;
        if ((this.codigoCarea == null && other.codigoCarea != null) || (this.codigoCarea != null && !this.codigoCarea.equals(other.codigoCarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.CodigoArea[ codigoCarea=" + codigoCarea + " ]";
    }
    
}
