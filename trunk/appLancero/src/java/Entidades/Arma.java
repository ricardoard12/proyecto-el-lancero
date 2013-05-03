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
@Table(name = "arma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arma.findAll", query = "SELECT a FROM Arma a"),
    @NamedQuery(name = "Arma.findByCodigoArma", query = "SELECT a FROM Arma a WHERE a.codigoArma = :codigoArma"),
    @NamedQuery(name = "Arma.findBySerieArma", query = "SELECT a FROM Arma a WHERE a.serieArma = :serieArma"),
    @NamedQuery(name = "Arma.findByNumeroBalisticaArma", query = "SELECT a FROM Arma a WHERE a.numeroBalisticaArma = :numeroBalisticaArma")})
public class Arma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_ARMA")
    private Integer codigoArma;
    @Size(max = 25)
    @Column(name = "serie_arma")
    private String serieArma;
    @Size(max = 25)
    @Column(name = "numero_balistica_arma")
    private String numeroBalisticaArma;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "PRECIO_ARMA")
    private String precioArma;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPCION_ARMA")
    private String descripcionArma;
    @JoinColumn(name = "CODIGO_MARCA", referencedColumnName = "CODIGO_MARCA")
    @ManyToOne(optional = false)
    private Marca codigoMarca;
    @JoinColumn(name = "CODIGO_COLOR", referencedColumnName = "CODIGO_COLOR")
    @ManyToOne
    private Color codigoColor;
    @JoinColumn(name = "CODIGO_MODELO", referencedColumnName = "CODIGO_MODELO")
    @ManyToOne
    private ModeloArma codigoModelo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoArma")
    private List<Inventario> inventarioList;
    @OneToMany(mappedBy = "codigoArma")
    private List<DetalleReserva> detalleReservaList;

    public Arma() {
    }

    public Arma(Integer codigoArma) {
        this.codigoArma = codigoArma;
    }

    public Arma(Integer codigoArma, String precioArma) {
        this.codigoArma = codigoArma;
        this.precioArma = precioArma;
    }

    public Integer getCodigoArma() {
        return codigoArma;
    }

    public void setCodigoArma(Integer codigoArma) {
        this.codigoArma = codigoArma;
    }

    public String getSerieArma() {
        return serieArma;
    }

    public void setSerieArma(String serieArma) {
        this.serieArma = serieArma;
    }

    public String getNumeroBalisticaArma() {
        return numeroBalisticaArma;
    }

    public void setNumeroBalisticaArma(String numeroBalisticaArma) {
        this.numeroBalisticaArma = numeroBalisticaArma;
    }

    public String getPrecioArma() {
        return precioArma;
    }

    public void setPrecioArma(String precioArma) {
        this.precioArma = precioArma;
    }

    public String getDescripcionArma() {
        return descripcionArma;
    }

    public void setDescripcionArma(String descripcionArma) {
        this.descripcionArma = descripcionArma;
    }

    public Marca getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(Marca codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public Color getCodigoColor() {
        return codigoColor;
    }

    public void setCodigoColor(Color codigoColor) {
        this.codigoColor = codigoColor;
    }

    public ModeloArma getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(ModeloArma codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    @XmlTransient
    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    @XmlTransient
    public List<DetalleReserva> getDetalleReservaList() {
        return detalleReservaList;
    }

    public void setDetalleReservaList(List<DetalleReserva> detalleReservaList) {
        this.detalleReservaList = detalleReservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoArma != null ? codigoArma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arma)) {
            return false;
        }
        Arma other = (Arma) object;
        if ((this.codigoArma == null && other.codigoArma != null) || (this.codigoArma != null && !this.codigoArma.equals(other.codigoArma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Arma[ codigoArma=" + codigoArma + " ]";
    }
    
}
