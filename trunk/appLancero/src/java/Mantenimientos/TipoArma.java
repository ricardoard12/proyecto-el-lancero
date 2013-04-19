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
@Table(name = "tipo_arma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoArma.findAll", query = "SELECT t FROM TipoArma t"),
    @NamedQuery(name = "TipoArma.findByCodigoTa", query = "SELECT t FROM TipoArma t WHERE t.codigoTa = :codigoTa")})
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

    public TipoArma() {
    }

    public TipoArma(Integer codigoTa) {
        this.codigoTa = codigoTa;
    }

    public TipoArma(Integer codigoTa, String tipoTa) {
        this.codigoTa = codigoTa;
        this.tipoTa = tipoTa;
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
        return "Mantenimientos.TipoArma[ codigoTa=" + codigoTa + " ]";
    }
    
}
