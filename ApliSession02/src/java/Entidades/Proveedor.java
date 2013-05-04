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
@Table(name = "proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByCodigoProv", query = "SELECT p FROM Proveedor p WHERE p.codigoProv = :codigoProv")})
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_PROV")
    private Integer codigoProv;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_PROV")
    private String nombreProv;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "TELEFONO_PROV")
    private String telefonoProv;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "CELULAR_PROV")
    private String celularProv;
    @OneToMany(mappedBy = "codigoProv")
    private List<PedidoProveedor> pedidoProveedorList;
    @JoinColumn(name = "CODIGO_PAIS", referencedColumnName = "CODIGO_PAIS")
    @ManyToOne
    private Pais codigoPais;

    public Proveedor() {
    }

    public Proveedor(Integer codigoProv) {
        this.codigoProv = codigoProv;
    }

    public Proveedor(Integer codigoProv, String nombreProv, String telefonoProv, String celularProv) {
        this.codigoProv = codigoProv;
        this.nombreProv = nombreProv;
        this.telefonoProv = telefonoProv;
        this.celularProv = celularProv;
    }

    public Integer getCodigoProv() {
        return codigoProv;
    }

    public void setCodigoProv(Integer codigoProv) {
        this.codigoProv = codigoProv;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(String telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    public String getCelularProv() {
        return celularProv;
    }

    public void setCelularProv(String celularProv) {
        this.celularProv = celularProv;
    }

    @XmlTransient
    public List<PedidoProveedor> getPedidoProveedorList() {
        return pedidoProveedorList;
    }

    public void setPedidoProveedorList(List<PedidoProveedor> pedidoProveedorList) {
        this.pedidoProveedorList = pedidoProveedorList;
    }

    public Pais getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Pais codigoPais) {
        this.codigoPais = codigoPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoProv != null ? codigoProv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.codigoProv == null && other.codigoProv != null) || (this.codigoProv != null && !this.codigoProv.equals(other.codigoProv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Proveedor[ codigoProv=" + codigoProv + " ]";
    }
    
}
