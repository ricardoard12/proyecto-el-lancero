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
@Table(name = "modelo_arma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModeloArma.findAll", query = "SELECT m FROM ModeloArma m"),
    @NamedQuery(name = "ModeloArma.findByCodigoModelo", query = "SELECT m FROM ModeloArma m WHERE m.codigoModelo = :codigoModelo")})
public class ModeloArma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MODELO")
    private Integer codigoModelo;
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
    @OneToMany(mappedBy = "codigoModelo")
    private List<Arma> armaList;
    @JoinColumn(name = "CODIGO_TA", referencedColumnName = "CODIGO_TA")
    @ManyToOne
    private TipoArma codigoTa;
    @JoinColumn(name = "CODIGO_CALIBRE", referencedColumnName = "CODIGO_CALIBRE")
    @ManyToOne
    private Calibre codigoCalibre;

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

    @XmlTransient
    public List<Arma> getArmaList() {
        return armaList;
    }

    public void setArmaList(List<Arma> armaList) {
        this.armaList = armaList;
    }

    public TipoArma getCodigoTa() {
        return codigoTa;
    }

    public void setCodigoTa(TipoArma codigoTa) {
        this.codigoTa = codigoTa;
    }

    public Calibre getCodigoCalibre() {
        return codigoCalibre;
    }

    public void setCodigoCalibre(Calibre codigoCalibre) {
        this.codigoCalibre = codigoCalibre;
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
        return "Atributos.ModeloArma[ codigoModelo=" + codigoModelo + " ]";
    }
    
}
