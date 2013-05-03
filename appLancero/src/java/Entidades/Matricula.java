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
@Table(name = "matricula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m"),
    @NamedQuery(name = "Matricula.findByCodigoMatricula", query = "SELECT m FROM Matricula m WHERE m.codigoMatricula = :codigoMatricula"),
    @NamedQuery(name = "Matricula.findByFechaVencimientoMatricula", query = "SELECT m FROM Matricula m WHERE m.fechaVencimientoMatricula = :fechaVencimientoMatricula")})
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MATRICULA")
    private Integer codigoMatricula;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NUMERO_MATRICULA")
    private String numeroMatricula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_VENCIMIENTO_MATRICULA")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimientoMatricula;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "DESCRIPCION_ARMA_MATRICULA")
    private String descripcionArmaMatricula;
    @JoinColumn(name = "CODIGO_CL", referencedColumnName = "CODIGO_CL")
    @ManyToOne
    private Cliente codigoCl;

    public Matricula() {
    }

    public Matricula(Integer codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public Matricula(Integer codigoMatricula, String numeroMatricula, Date fechaVencimientoMatricula, String descripcionArmaMatricula) {
        this.codigoMatricula = codigoMatricula;
        this.numeroMatricula = numeroMatricula;
        this.fechaVencimientoMatricula = fechaVencimientoMatricula;
        this.descripcionArmaMatricula = descripcionArmaMatricula;
    }

    public Integer getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(Integer codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Date getFechaVencimientoMatricula() {
        return fechaVencimientoMatricula;
    }

    public void setFechaVencimientoMatricula(Date fechaVencimientoMatricula) {
        this.fechaVencimientoMatricula = fechaVencimientoMatricula;
    }

    public String getDescripcionArmaMatricula() {
        return descripcionArmaMatricula;
    }

    public void setDescripcionArmaMatricula(String descripcionArmaMatricula) {
        this.descripcionArmaMatricula = descripcionArmaMatricula;
    }

    public Cliente getCodigoCl() {
        return codigoCl;
    }

    public void setCodigoCl(Cliente codigoCl) {
        this.codigoCl = codigoCl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMatricula != null ? codigoMatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matricula)) {
            return false;
        }
        Matricula other = (Matricula) object;
        if ((this.codigoMatricula == null && other.codigoMatricula != null) || (this.codigoMatricula != null && !this.codigoMatricula.equals(other.codigoMatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Matricula[ codigoMatricula=" + codigoMatricula + " ]";
    }
    
}
