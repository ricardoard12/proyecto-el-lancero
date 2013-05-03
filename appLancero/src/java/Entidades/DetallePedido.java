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
@Table(name = "detalle_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallePedido.findAll", query = "SELECT d FROM DetallePedido d"),
    @NamedQuery(name = "DetallePedido.findByCodigoDp", query = "SELECT d FROM DetallePedido d WHERE d.codigoDp = :codigoDp")})
public class DetallePedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_DP")
    private Integer codigoDp;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "DESCRIPCION_DP")
    private String descripcionDp;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "CANTIDAD_LOTE_DP")
    private String cantidadLoteDp;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "PRECIO_LOTE_DP")
    private String precioLoteDp;
    @OneToMany(mappedBy = "codigoDp")
    private List<Inventario> inventarioList;
    @OneToMany(mappedBy = "codigoDp")
    private List<PedidoProveedor> pedidoProveedorList;

    public DetallePedido() {
    }

    public DetallePedido(Integer codigoDp) {
        this.codigoDp = codigoDp;
    }

    public DetallePedido(Integer codigoDp, String descripcionDp, String cantidadLoteDp, String precioLoteDp) {
        this.codigoDp = codigoDp;
        this.descripcionDp = descripcionDp;
        this.cantidadLoteDp = cantidadLoteDp;
        this.precioLoteDp = precioLoteDp;
    }

    public Integer getCodigoDp() {
        return codigoDp;
    }

    public void setCodigoDp(Integer codigoDp) {
        this.codigoDp = codigoDp;
    }

    public String getDescripcionDp() {
        return descripcionDp;
    }

    public void setDescripcionDp(String descripcionDp) {
        this.descripcionDp = descripcionDp;
    }

    public String getCantidadLoteDp() {
        return cantidadLoteDp;
    }

    public void setCantidadLoteDp(String cantidadLoteDp) {
        this.cantidadLoteDp = cantidadLoteDp;
    }

    public String getPrecioLoteDp() {
        return precioLoteDp;
    }

    public void setPrecioLoteDp(String precioLoteDp) {
        this.precioLoteDp = precioLoteDp;
    }

    @XmlTransient
    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    @XmlTransient
    public List<PedidoProveedor> getPedidoProveedorList() {
        return pedidoProveedorList;
    }

    public void setPedidoProveedorList(List<PedidoProveedor> pedidoProveedorList) {
        this.pedidoProveedorList = pedidoProveedorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoDp != null ? codigoDp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePedido)) {
            return false;
        }
        DetallePedido other = (DetallePedido) object;
        if ((this.codigoDp == null && other.codigoDp != null) || (this.codigoDp != null && !this.codigoDp.equals(other.codigoDp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.DetallePedido[ codigoDp=" + codigoDp + " ]";
    }
    
}
