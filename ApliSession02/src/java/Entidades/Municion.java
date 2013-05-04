/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "municion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Municion.findAll", query = "SELECT m FROM Municion m"),
    @NamedQuery(name = "Municion.findByCodigoMu", query = "SELECT m FROM Municion m WHERE m.codigoMu = :codigoMu")})
public class Municion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MU")
    private Integer codigoMu;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "PRECIO_MU")
    private String precioMu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoMu")
    private List<Inventario> inventarioList;
    @OneToMany(mappedBy = "codigoMu")
    private List<DetalleReserva> detalleReservaList;
    @JoinColumn(name = "CODIGO_MARCA", referencedColumnName = "CODIGO_MARCA")
    @ManyToOne(optional = false)
    private Marca codigoMarca;
    @JoinColumn(name = "CODIGO_CALIBRE", referencedColumnName = "CODIGO_CALIBRE")
    @ManyToOne
    private Calibre codigoCalibre;

    public Municion() {
    }

    public Municion(Integer codigoMu) {
        this.codigoMu = codigoMu;
    }

    public Municion(Integer codigoMu, String precioMu) {
        this.codigoMu = codigoMu;
        this.precioMu = precioMu;
    }

    public Integer getCodigoMu() {
        return codigoMu;
    }

    public void setCodigoMu(Integer codigoMu) {
        this.codigoMu = codigoMu;
    }

    public String getPrecioMu() {
        return precioMu;
    }

    public void setPrecioMu(String precioMu) {
        this.precioMu = precioMu;
    }

    @XmlTransient
    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    @XmlTransient
    public List<DetalleReserva> getDetalleReservaList() {
        return detalleReservaList;
    }

    public void setDetalleReservaList(List<DetalleReserva> detalleReservaList) {
        this.detalleReservaList = detalleReservaList;
    }

    public Marca getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(Marca codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public Calibre getCodigoCalibre() {
        return codigoCalibre;
    }

    public void setCodigoCalibre(Calibre codigoCalibre) {
        this.codigoCalibre = codigoCalibre;
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
        return "Atributos.Municion[ codigoMu=" + codigoMu + " ]";
    }
    
}
