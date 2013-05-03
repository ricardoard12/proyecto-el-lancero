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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Reyes
 */
@Entity
@Table(name = "detalle_reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleReserva.findAll", query = "SELECT d FROM DetalleReserva d"),
    @NamedQuery(name = "DetalleReserva.findByCodigoDr", query = "SELECT d FROM DetalleReserva d WHERE d.codigoDr = :codigoDr"),
    @NamedQuery(name = "DetalleReserva.findByCantidadArmaDr", query = "SELECT d FROM DetalleReserva d WHERE d.cantidadArmaDr = :cantidadArmaDr"),
    @NamedQuery(name = "DetalleReserva.findByCantidadMunicionDr", query = "SELECT d FROM DetalleReserva d WHERE d.cantidadMunicionDr = :cantidadMunicionDr"),
    @NamedQuery(name = "DetalleReserva.findByCantidadAccesorioDr", query = "SELECT d FROM DetalleReserva d WHERE d.cantidadAccesorioDr = :cantidadAccesorioDr")})
public class DetalleReserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_DR")
    private Integer codigoDr;
    @Column(name = "CANTIDAD_ARMA_DR")
    private Integer cantidadArmaDr;
    @Column(name = "CANTIDAD_MUNICION_DR")
    private Integer cantidadMunicionDr;
    @Column(name = "CANTIDAD_ACCESORIO_DR")
    private Integer cantidadAccesorioDr;
    @JoinColumn(name = "CODIGO_ARMA", referencedColumnName = "CODIGO_ARMA")
    @ManyToOne
    private Arma codigoArma;
    @JoinColumn(name = "CODIGO_MU", referencedColumnName = "CODIGO_MU")
    @ManyToOne
    private Municion codigoMu;
    @JoinColumn(name = "CODIGO_ACC", referencedColumnName = "CODIGO_ACC")
    @ManyToOne
    private Accesorio codigoAcc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoDr")
    private List<Reserva> reservaList;

    public DetalleReserva() {
    }

    public DetalleReserva(Integer codigoDr) {
        this.codigoDr = codigoDr;
    }

    public Integer getCodigoDr() {
        return codigoDr;
    }

    public void setCodigoDr(Integer codigoDr) {
        this.codigoDr = codigoDr;
    }

    public Integer getCantidadArmaDr() {
        return cantidadArmaDr;
    }

    public void setCantidadArmaDr(Integer cantidadArmaDr) {
        this.cantidadArmaDr = cantidadArmaDr;
    }

    public Integer getCantidadMunicionDr() {
        return cantidadMunicionDr;
    }

    public void setCantidadMunicionDr(Integer cantidadMunicionDr) {
        this.cantidadMunicionDr = cantidadMunicionDr;
    }

    public Integer getCantidadAccesorioDr() {
        return cantidadAccesorioDr;
    }

    public void setCantidadAccesorioDr(Integer cantidadAccesorioDr) {
        this.cantidadAccesorioDr = cantidadAccesorioDr;
    }

    public Arma getCodigoArma() {
        return codigoArma;
    }

    public void setCodigoArma(Arma codigoArma) {
        this.codigoArma = codigoArma;
    }

    public Municion getCodigoMu() {
        return codigoMu;
    }

    public void setCodigoMu(Municion codigoMu) {
        this.codigoMu = codigoMu;
    }

    public Accesorio getCodigoAcc() {
        return codigoAcc;
    }

    public void setCodigoAcc(Accesorio codigoAcc) {
        this.codigoAcc = codigoAcc;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoDr != null ? codigoDr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleReserva)) {
            return false;
        }
        DetalleReserva other = (DetalleReserva) object;
        if ((this.codigoDr == null && other.codigoDr != null) || (this.codigoDr != null && !this.codigoDr.equals(other.codigoDr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.DetalleReserva[ codigoDr=" + codigoDr + " ]";
    }
    
}
