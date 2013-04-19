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
@Table(name = "municion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Municion.findAll", query = "SELECT m FROM Municion m"),
    @NamedQuery(name = "Municion.findByCodigoMu", query = "SELECT m FROM Municion m WHERE m.codigoMu = :codigoMu"),
    @NamedQuery(name = "Municion.findByCodigoMarca", query = "SELECT m FROM Municion m WHERE m.codigoMarca = :codigoMarca"),
    @NamedQuery(name = "Municion.findByCodigoCalibre", query = "SELECT m FROM Municion m WHERE m.codigoCalibre = :codigoCalibre")})
public class Municion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MU")
    private Integer codigoMu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MARCA")
    private int codigoMarca;
    @Column(name = "CODIGO_CALIBRE")
    private Long codigoCalibre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "PRECIO_MU")
    private String precioMu;

    public Municion() {
    }

    public Municion(Integer codigoMu) {
        this.codigoMu = codigoMu;
    }

    public Municion(Integer codigoMu, int codigoMarca, String precioMu) {
        this.codigoMu = codigoMu;
        this.codigoMarca = codigoMarca;
        this.precioMu = precioMu;
    }

    public Integer getCodigoMu() {
        return codigoMu;
    }

    public void setCodigoMu(Integer codigoMu) {
        this.codigoMu = codigoMu;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public Long getCodigoCalibre() {
        return codigoCalibre;
    }

    public void setCodigoCalibre(Long codigoCalibre) {
        this.codigoCalibre = codigoCalibre;
    }

    public String getPrecioMu() {
        return precioMu;
    }

    public void setPrecioMu(String precioMu) {
        this.precioMu = precioMu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMu != null ? codigoMu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municion)) {
            return false;
        }
        Municion other = (Municion) object;
        if ((this.codigoMu == null && other.codigoMu != null) || (this.codigoMu != null && !this.codigoMu.equals(other.codigoMu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mantenimientos.Municion[ codigoMu=" + codigoMu + " ]";
    }
    
}
