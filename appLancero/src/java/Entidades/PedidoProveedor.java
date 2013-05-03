/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Reyes
 */
@Entity
@Table(name = "pedido_proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoProveedor.findAll", query = "SELECT p FROM PedidoProveedor p"),
    @NamedQuery(name = "PedidoProveedor.findByCodioPp", query = "SELECT p FROM PedidoProveedor p WHERE p.codioPp = :codioPp"),
    @NamedQuery(name = "PedidoProveedor.findByFechaPp", query = "SELECT p FROM PedidoProveedor p WHERE p.fechaPp = :fechaPp")})
public class PedidoProveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIO_PP")
    private Integer codioPp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_PP")
    @Temporal(TemporalType.DATE)
    private Date fechaPp;
    @JoinColumn(name = "CODIGO_PROV", referencedColumnName = "CODIGO_PROV")
    @ManyToOne
    private Proveedor codigoProv;
    @JoinColumn(name = "CODIGO_DP", referencedColumnName = "CODIGO_DP")
    @ManyToOne
    private DetallePedido codigoDp;

    public PedidoProveedor() {
    }

    public PedidoProveedor(Integer codioPp) {
        this.codioPp = codioPp;
    }

    public PedidoProveedor(Integer codioPp, Date fechaPp) {
        this.codioPp = codioPp;
        this.fechaPp = fechaPp;
    }

    public Integer getCodioPp() {
        return codioPp;
    }

    public void setCodioPp(Integer codioPp) {
        this.codioPp = codioPp;
    }

    public Date getFechaPp() {
        return fechaPp;
    }

    public void setFechaPp(Date fechaPp) {
        this.fechaPp = fechaPp;
    }

    public Proveedor getCodigoProv() {
        return codigoProv;
    }

    public void setCodigoProv(Proveedor codigoProv) {
        this.codigoProv = codigoProv;
    }

    public DetallePedido getCodigoDp() {
        return codigoDp;
    }

    public void setCodigoDp(DetallePedido codigoDp) {
        this.codigoDp = codigoDp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codioPp != null ? codioPp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoProveedor)) {
            return false;
        }
        PedidoProveedor other = (PedidoProveedor) object;
        if ((this.codioPp == null && other.codioPp != null) || (this.codioPp != null && !this.codioPp.equals(other.codioPp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.PedidoProveedor[ codioPp=" + codioPp + " ]";
    }
    
}
