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
@Table(name = "sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sucursal.findAll", query = "SELECT s FROM Sucursal s"),
    @NamedQuery(name = "Sucursal.findByCodigoSuc", query = "SELECT s FROM Sucursal s WHERE s.codigoSuc = :codigoSuc"),
    @NamedQuery(name = "Sucursal.findByCodigoDepa", query = "SELECT s FROM Sucursal s WHERE s.codigoDepa = :codigoDepa")})
public class Sucursal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_SUC")
    private Integer codigoSuc;
    @Column(name = "CODIGO_DEPA")
    private Integer codigoDepa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_SUC")
    private String nombreSuc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "DIRECCION_SUC")
    private String direccionSuc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "TELEFONO_SUC")
    private String telefonoSuc;

    public Sucursal() {
    }

    public Sucursal(Integer codigoSuc) {
        this.codigoSuc = codigoSuc;
    }

    public Sucursal(Integer codigoSuc, String nombreSuc, String direccionSuc, String telefonoSuc) {
        this.codigoSuc = codigoSuc;
        this.nombreSuc = nombreSuc;
        this.direccionSuc = direccionSuc;
        this.telefonoSuc = telefonoSuc;
    }

    public Integer getCodigoSuc() {
        return codigoSuc;
    }

    public void setCodigoSuc(Integer codigoSuc) {
        this.codigoSuc = codigoSuc;
    }

    public Integer getCodigoDepa() {
        return codigoDepa;
    }

    public void setCodigoDepa(Integer codigoDepa) {
        this.codigoDepa = codigoDepa;
    }

    public String getNombreSuc() {
        return nombreSuc;
    }

    public void setNombreSuc(String nombreSuc) {
        this.nombreSuc = nombreSuc;
    }

    public String getDireccionSuc() {
        return direccionSuc;
    }

    public void setDireccionSuc(String direccionSuc) {
        this.direccionSuc = direccionSuc;
    }

    public String getTelefonoSuc() {
        return telefonoSuc;
    }

    public void setTelefonoSuc(String telefonoSuc) {
        this.telefonoSuc = telefonoSuc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoSuc != null ? codigoSuc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursal)) {
            return false;
        }
        Sucursal other = (Sucursal) object;
        if ((this.codigoSuc == null && other.codigoSuc != null) || (this.codigoSuc != null && !this.codigoSuc.equals(other.codigoSuc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mantenimientos.Sucursal[ codigoSuc=" + codigoSuc + " ]";
    }
    
}
