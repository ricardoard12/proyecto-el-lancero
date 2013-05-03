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
@Table(name = "color")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Color.findAll", query = "SELECT c FROM Color c"),
    @NamedQuery(name = "Color.findByCodigoColor", query = "SELECT c FROM Color c WHERE c.codigoColor = :codigoColor")})
public class Color implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_COLOR")
    private Integer codigoColor;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_COLOR")
    private String nombreColor;
    @OneToMany(mappedBy = "codigoColor")
    private List<Arma> armaList;
    @OneToMany(mappedBy = "codigoColor")
    private List<Accesorio> accesorioList;

    public Color() {
    }

    public Color(Integer codigoColor) {
        this.codigoColor = codigoColor;
    }

    public Color(Integer codigoColor, String nombreColor) {
        this.codigoColor = codigoColor;
        this.nombreColor = nombreColor;
    }

    public Integer getCodigoColor() {
        return codigoColor;
    }

    public void setCodigoColor(Integer codigoColor) {
        this.codigoColor = codigoColor;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    @XmlTransient
    public List<Arma> getArmaList() {
        return armaList;
    }

    public void setArmaList(List<Arma> armaList) {
        this.armaList = armaList;
    }

    @XmlTransient
    public List<Accesorio> getAccesorioList() {
        return accesorioList;
    }

    public void setAccesorioList(List<Accesorio> accesorioList) {
        this.accesorioList = accesorioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoColor != null ? codigoColor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Color)) {
            return false;
        }
        Color other = (Color) object;
        if ((this.codigoColor == null && other.codigoColor != null) || (this.codigoColor != null && !this.codigoColor.equals(other.codigoColor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Color[ codigoColor=" + codigoColor + " ]";
    }
    
}
