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
@Table(name = "inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i"),
    @NamedQuery(name = "Inventario.findByCodigoInv", query = "SELECT i FROM Inventario i WHERE i.codigoInv = :codigoInv"),
    @NamedQuery(name = "Inventario.findByCantidadInv", query = "SELECT i FROM Inventario i WHERE i.cantidadInv = :cantidadInv"),
    @NamedQuery(name = "Inventario.findByFechaIngresoInv", query = "SELECT i FROM Inventario i WHERE i.fechaIngresoInv = :fechaIngresoInv"),
    @NamedQuery(name = "Inventario.findByFechaSalidaInv", query = "SELECT i FROM Inventario i WHERE i.fechaSalidaInv = :fechaSalidaInv")})
public class Inventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_INV")
    private Integer codigoInv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_INV")
    private int cantidadInv;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "DESCRIPCION_INV")
    private String descripcionInv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INGRESO_INV")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoInv;
    @Column(name = "FECHA_SALIDA_INV")
    @Temporal(TemporalType.DATE)
    private Date fechaSalidaInv;
    @JoinColumn(name = "CODIGO_MU", referencedColumnName = "CODIGO_MU")
    @ManyToOne(optional = false)
    private Municion codigoMu;
    @JoinColumn(name = "CODIGO_DP", referencedColumnName = "CODIGO_DP")
    @ManyToOne
    private DetallePedido codigoDp;
    @JoinColumn(name = "CODIGO_ACC", referencedColumnName = "CODIGO_ACC")
    @ManyToOne
    private Accesorio codigoAcc;
    @JoinColumn(name = "CODIGO_ARMA", referencedColumnName = "CODIGO_ARMA")
    @ManyToOne(optional = false)
    private Arma codigoArma;
    @JoinColumn(name = "CODIGO_SUC", referencedColumnName = "CODIGO_SUC")
    @ManyToOne
    private Sucursal codigoSuc;

    public Inventario() {
    }

    public Inventario(Integer codigoInv) {
        this.codigoInv = codigoInv;
    }

    public Inventario(Integer codigoInv, int cantidadInv, String descripcionInv, Date fechaIngresoInv) {
        this.codigoInv = codigoInv;
        this.cantidadInv = cantidadInv;
        this.descripcionInv = descripcionInv;
        this.fechaIngresoInv = fechaIngresoInv;
    }

    public Integer getCodigoInv() {
        return codigoInv;
    }

    public void setCodigoInv(Integer codigoInv) {
        this.codigoInv = codigoInv;
    }

    public int getCantidadInv() {
        return cantidadInv;
    }

    public void setCantidadInv(int cantidadInv) {
        this.cantidadInv = cantidadInv;
    }

    public String getDescripcionInv() {
        return descripcionInv;
    }

    public void setDescripcionInv(String descripcionInv) {
        this.descripcionInv = descripcionInv;
    }

    public Date getFechaIngresoInv() {
        return fechaIngresoInv;
    }

    public void setFechaIngresoInv(Date fechaIngresoInv) {
        this.fechaIngresoInv = fechaIngresoInv;
    }

    public Date getFechaSalidaInv() {
        return fechaSalidaInv;
    }

    public void setFechaSalidaInv(Date fechaSalidaInv) {
        this.fechaSalidaInv = fechaSalidaInv;
    }

    public Municion getCodigoMu() {
        return codigoMu;
    }

    public void setCodigoMu(Municion codigoMu) {
        this.codigoMu = codigoMu;
    }

    public DetallePedido getCodigoDp() {
        return codigoDp;
    }

    public void setCodigoDp(DetallePedido codigoDp) {
        this.codigoDp = codigoDp;
    }

    public Accesorio getCodigoAcc() {
        return codigoAcc;
    }

    public void setCodigoAcc(Accesorio codigoAcc) {
        this.codigoAcc = codigoAcc;
    }

    public Arma getCodigoArma() {
        return codigoArma;
    }

    public void setCodigoArma(Arma codigoArma) {
        this.codigoArma = codigoArma;
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
        hash += (codigoInv != null ? codigoInv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.codigoInv == null && other.codigoInv != null) || (this.codigoInv != null && !this.codigoInv.equals(other.codigoInv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Inventario[ codigoInv=" + codigoInv + " ]";
    }
    
}
