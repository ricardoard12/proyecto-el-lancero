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
@Table(name = "tipo_arma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoArma.findAll", query = "SELECT t FROM TipoArma t"),
    @NamedQuery(name = "TipoArma.findByCodigoTa", query = "SELECT t FROM TipoArma t WHERE t.codigoTa = :codigoTa"),
    @NamedQuery(name = "TipoArma.findByDescripcion", query = "SELECT t FROM TipoArma t WHERE t.descripcion = :descripcion")})
public class TipoArma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_TA")
    private Integer codigoTa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "TIPO_TA")
    private String tipoTa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "codigoTa")
    private List<ModeloArma> modeloArmaList;

    public TipoArma() {
    }

    public TipoArma(Integer codigoTa) {
        this.codigoTa = codigoTa;
    }

    public TipoArma(Integer codigoTa, String tipoTa, String descripcion) {
        this.codigoTa = codigoTa;
        this.tipoTa = tipoTa;
        this.descripcion = descripcion;
    }

    public Integer getCodigoTa() {
        return codigoTa;
    }

    public void setCodigoTa(Integer codigoTa) {
        this.codigoTa = codigoTa;
    }

    public String getTipoTa() {
        return tipoTa;
    }

    public void setTipoTa(String tipoTa) {
        this.tipoTa = tipoTa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (codigoTa != null ? codigoTa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoArma)) {
            return false;
        }
        TipoArma other = (TipoArma) object;
        if ((this.codigoTa == null && other.codigoTa != null) || (this.codigoTa != null && !this.codigoTa.equals(other.codigoTa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.TipoArma[ codigoTa=" + codigoTa + " ]";
    }
    
}
