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
@Table(name = "modelo_arma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModeloArma.findAll", query = "SELECT m FROM ModeloArma m"),
    @NamedQuery(name = "ModeloArma.findByCodigoModelo", query = "SELECT m FROM ModeloArma m WHERE m.codigoModelo = :codigoModelo"),
    @NamedQuery(name = "ModeloArma.findByCodigoCalibre", query = "SELECT m FROM ModeloArma m WHERE m.codigoCalibre = :codigoCalibre"),
    @NamedQuery(name = "ModeloArma.findByCodigoTa", query = "SELECT m FROM ModeloArma m WHERE m.codigoTa = :codigoTa")})
public class ModeloArma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MODELO")
    private Integer codigoModelo;
    @Column(name = "CODIGO_CALIBRE")
    private Long codigoCalibre;
    @Column(name = "CODIGO_TA")
    private Integer codigoTa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_MODELO")
    private String nombreModelo;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPCION_MODELO")
    private String descripcionModelo;

    public ModeloArma() {
    }

    public ModeloArma(Integer codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public ModeloArma(Integer codigoModelo, String nombreModelo) {
        this.codigoModelo = codigoModelo;
        this.nombreModelo = nombreModelo;
    }

    public Integer getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(Integer codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public Long getCodigoCalibre() {
        return codigoCalibre;
    }

    public void setCodigoCalibre(Long codigoCalibre) {
        this.codigoCalibre = codigoCalibre;
    }

    public Integer getCodigoTa() {
        return codigoTa;
    }

    public void setCodigoTa(Integer codigoTa) {
        this.codigoTa = codigoTa;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getDescripcionModelo() {
        return descripcionModelo;
    }

    public void setDescripcionModelo(String descripcionModelo) {
        this.descripcionModelo = descripcionModelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoModelo != null ? codigoModelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModeloArma)) {
            return false;
        }
        ModeloArma other = (ModeloArma) object;
        if ((this.codigoModelo == null && other.codigoModelo != null) || (this.codigoModelo != null && !this.codigoModelo.equals(other.codigoModelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mantenimientos.ModeloArma[ codigoModelo=" + codigoModelo + " ]";
    }
    
}
