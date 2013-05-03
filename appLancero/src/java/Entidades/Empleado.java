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
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByCodigoEm", query = "SELECT e FROM Empleado e WHERE e.codigoEm = :codigoEm"),
    @NamedQuery(name = "Empleado.findByFechaIngresoEm", query = "SELECT e FROM Empleado e WHERE e.fechaIngresoEm = :fechaIngresoEm")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_EM")
    private Integer codigoEm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INGRESO_EM")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoEm;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "INGRESOS_EM")
    private String ingresosEm;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne
    private Persona idPersona;

    public Empleado() {
    }

    public Empleado(Integer codigoEm) {
        this.codigoEm = codigoEm;
    }

    public Empleado(Integer codigoEm, Date fechaIngresoEm, String ingresosEm) {
        this.codigoEm = codigoEm;
        this.fechaIngresoEm = fechaIngresoEm;
        this.ingresosEm = ingresosEm;
    }

    public Integer getCodigoEm() {
        return codigoEm;
    }

    public void setCodigoEm(Integer codigoEm) {
        this.codigoEm = codigoEm;
    }

    public Date getFechaIngresoEm() {
        return fechaIngresoEm;
    }

    public void setFechaIngresoEm(Date fechaIngresoEm) {
        this.fechaIngresoEm = fechaIngresoEm;
    }

    public String getIngresosEm() {
        return ingresosEm;
    }

    public void setIngresosEm(String ingresosEm) {
        this.ingresosEm = ingresosEm;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEm != null ? codigoEm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codigoEm == null && other.codigoEm != null) || (this.codigoEm != null && !this.codigoEm.equals(other.codigoEm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Empleado[ codigoEm=" + codigoEm + " ]";
    }
    
}
