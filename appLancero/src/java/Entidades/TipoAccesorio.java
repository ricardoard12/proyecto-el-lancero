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
@Table(name = "tipo_accesorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAccesorio.findAll", query = "SELECT t FROM TipoAccesorio t"),
    @NamedQuery(name = "TipoAccesorio.findByCodigoTacc", query = "SELECT t FROM TipoAccesorio t WHERE t.codigoTacc = :codigoTacc")})
public class TipoAccesorio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_TACC")
    private Long codigoTacc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_TACC")
    private String nombreTacc;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPCION_TACC")
    private String descripcionTacc;
    @OneToMany(mappedBy = "codigoTacc")
    private List<Accesorio> accesorioList;

    public TipoAccesorio() {
    }

    public TipoAccesorio(Long codigoTacc) {
        this.codigoTacc = codigoTacc;
    }

    public TipoAccesorio(Long codigoTacc, String nombreTacc) {
        this.codigoTacc = codigoTacc;
        this.nombreTacc = nombreTacc;
    }

    public Long getCodigoTacc() {
        return codigoTacc;
    }

    public void setCodigoTacc(Long codigoTacc) {
        this.codigoTacc = codigoTacc;
    }

    public String getNombreTacc() {
        return nombreTacc;
    }

    public void setNombreTacc(String nombreTacc) {
        this.nombreTacc = nombreTacc;
    }

    public String getDescripcionTacc() {
        return descripcionTacc;
    }

    public void setDescripcionTacc(String descripcionTacc) {
        this.descripcionTacc = descripcionTacc;
    }

    @XmlTransient
    public List<Accesorio> getAccesorioList() {
        return accesorioList;
    }

    public void setAccesorioList(List<Accesorio> accesorioList) {
        this.accesorioList = accesorioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoTacc != null ? codigoTacc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAccesorio)) {
            return false;
        }
        TipoAccesorio other = (TipoAccesorio) object;
        if ((this.codigoTacc == null && other.codigoTacc != null) || (this.codigoTacc != null && !this.codigoTacc.equals(other.codigoTacc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.TipoAccesorio[ codigoTacc=" + codigoTacc + " ]";
    }
    
}
