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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Reyes
 */
@Entity
@Table(name = "orden_requerimiento_sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenRequerimientoSucursal.findAll", query = "SELECT o FROM OrdenRequerimientoSucursal o"),
    @NamedQuery(name = "OrdenRequerimientoSucursal.findByCodigoOrs", query = "SELECT o FROM OrdenRequerimientoSucursal o WHERE o.codigoOrs = :codigoOrs"),
    @NamedQuery(name = "OrdenRequerimientoSucursal.findByFechaRequerimientoOrs", query = "SELECT o FROM OrdenRequerimientoSucursal o WHERE o.fechaRequerimientoOrs = :fechaRequerimientoOrs"),
    @NamedQuery(name = "OrdenRequerimientoSucursal.findByFechaRecepcionOrs", query = "SELECT o FROM OrdenRequerimientoSucursal o WHERE o.fechaRecepcionOrs = :fechaRecepcionOrs")})
public class OrdenRequerimientoSucursal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_ORS")
    private Integer codigoOrs;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "DESCRIPCION_ORS")
    private String descripcionOrs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_REQUERIMIENTO_ORS")
    @Temporal(TemporalType.DATE)
    private Date fechaRequerimientoOrs;
    @Column(name = "FECHA_RECEPCION_ORS")
    @Temporal(TemporalType.DATE)
    private Date fechaRecepcionOrs;
    @JoinColumn(name = "CODIGO_SUC", referencedColumnName = "CODIGO_SUC")
    @ManyToOne(optional = false)
    private Sucursal codigoSuc;

    public OrdenRequerimientoSucursal() {
    }

    public OrdenRequerimientoSucursal(Integer codigoOrs) {
        this.codigoOrs = codigoOrs;
    }

    public OrdenRequerimientoSucursal(Integer codigoOrs, String descripcionOrs, Date fechaRequerimientoOrs) {
        this.codigoOrs = codigoOrs;
        this.descripcionOrs = descripcionOrs;
        this.fechaRequerimientoOrs = fechaRequerimientoOrs;
    }

    public Integer getCodigoOrs() {
        return codigoOrs;
    }

    public void setCodigoOrs(Integer codigoOrs) {
        this.codigoOrs = codigoOrs;
    }

    public String getDescripcionOrs() {
        return descripcionOrs;
    }

    public void setDescripcionOrs(String descripcionOrs) {
        this.descripcionOrs = descripcionOrs;
    }

    public Date getFechaRequerimientoOrs() {
        return fechaRequerimientoOrs;
    }

    public void setFechaRequerimientoOrs(Date fechaRequerimientoOrs) {
        this.fechaRequerimientoOrs = fechaRequerimientoOrs;
    }

    public Date getFechaRecepcionOrs() {
        return fechaRecepcionOrs;
    }

    public void setFechaRecepcionOrs(Date fechaRecepcionOrs) {
        this.fechaRecepcionOrs = fechaRecepcionOrs;
    }

    public Sucursal getCodigoSuc() {
        return codigoSuc;
    }

    public void setCodigoSuc(Sucursal codigoSuc) {
        this.codigoSuc = codigoSuc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOrs != null ? codigoOrs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenRequerimientoSucursal)) {
            return false;
        }
        OrdenRequerimientoSucursal other = (OrdenRequerimientoSucursal) object;
        if ((this.codigoOrs == null && other.codigoOrs != null) || (this.codigoOrs != null && !this.codigoOrs.equals(other.codigoOrs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.OrdenRequerimientoSucursal[ codigoOrs=" + codigoOrs + " ]";
    }
    
}
