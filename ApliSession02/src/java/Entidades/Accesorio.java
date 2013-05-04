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
@Table(name = "accesorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accesorio.findAll", query = "SELECT a FROM Accesorio a"),
    @NamedQuery(name = "Accesorio.findByCodigoAcc", query = "SELECT a FROM Accesorio a WHERE a.codigoAcc = :codigoAcc"),
    @NamedQuery(name = "Accesorio.findByTallaAcc", query = "SELECT a FROM Accesorio a WHERE a.tallaAcc = :tallaAcc")})
public class Accesorio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_ACC")
    private Integer codigoAcc;
    @Size(max = 3)
    @Column(name = "talla_acc")
    private String tallaAcc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "PRECIO_ACC")
    private String precioAcc;
    @JoinColumn(name = "CODIGO_MARCA", referencedColumnName = "CODIGO_MARCA")
    @ManyToOne(optional = false)
    private Marca codigoMarca;
    @JoinColumn(name = "CODIGO_TACC", referencedColumnName = "CODIGO_TACC")
    @ManyToOne
    private TipoAccesorio codigoTacc;
    @JoinColumn(name = "CODIGO_COLOR", referencedColumnName = "CODIGO_COLOR")
    @ManyToOne
    private Color codigoColor;
    @OneToMany(mappedBy = "codigoAcc")
    private List<Inventario> inventarioList;
    @OneToMany(mappedBy = "codigoAcc")
    private List<DetalleReserva> detalleReservaList;

    public Accesorio() {
    }

    public Accesorio(Integer codigoAcc) {
        this.codigoAcc = codigoAcc;
    }

    public Accesorio(Integer codigoAcc, String precioAcc) {
        this.codigoAcc = codigoAcc;
        this.precioAcc = precioAcc;
    }

    public Integer getCodigoAcc() {
        return codigoAcc;
    }

    public void setCodigoAcc(Integer codigoAcc) {
        this.codigoAcc = codigoAcc;
    }

    public String getTallaAcc() {
        return tallaAcc;
    }

    public void setTallaAcc(String tallaAcc) {
        this.tallaAcc = tallaAcc;
    }

    public String getPrecioAcc() {
        return precioAcc;
    }

    public void setPrecioAcc(String precioAcc) {
        this.precioAcc = precioAcc;
    }

    public Marca getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(Marca codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public TipoAccesorio getCodigoTacc() {
        return codigoTacc;
    }

    public void setCodigoTacc(TipoAccesorio codigoTacc) {
        this.codigoTacc = codigoTacc;
    }

    public Color getCodigoColor() {
        return codigoColor;
    }

    public void setCodigoColor(Color codigoColor) {
        this.codigoColor = codigoColor;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoAcc != null ? codigoAcc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accesorio)) {
            return false;
        }
        Accesorio other = (Accesorio) object;
        if ((this.codigoAcc == null && other.codigoAcc != null) || (this.codigoAcc != null && !this.codigoAcc.equals(other.codigoAcc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Accesorio[ codigoAcc=" + codigoAcc + " ]";
    }
    
}
