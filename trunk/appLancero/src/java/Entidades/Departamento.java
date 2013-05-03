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
@Table(name = "departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByCodigoDepa", query = "SELECT d FROM Departamento d WHERE d.codigoDepa = :codigoDepa")})
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_DEPA")
    private Integer codigoDepa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_DEPA")
    private String nombreDepa;
    @OneToMany(mappedBy = "codigoDepa")
    private List<Sucursal> sucursalList;
    @JoinColumn(name = "CODIGO_PAIS", referencedColumnName = "CODIGO_PAIS")
    @ManyToOne(optional = false)
    private Pais codigoPais;
    @OneToMany(mappedBy = "codigoDepa")
    private List<Persona> personaList;

    public Departamento() {
    }

    public Departamento(Integer codigoDepa) {
        this.codigoDepa = codigoDepa;
    }

    public Departamento(Integer codigoDepa, String nombreDepa) {
        this.codigoDepa = codigoDepa;
        this.nombreDepa = nombreDepa;
    }

    public Integer getCodigoDepa() {
        return codigoDepa;
    }

    public void setCodigoDepa(Integer codigoDepa) {
        this.codigoDepa = codigoDepa;
    }

    public String getNombreDepa() {
        return nombreDepa;
    }

    public void setNombreDepa(String nombreDepa) {
        this.nombreDepa = nombreDepa;
    }

    @XmlTransient
    public List<Sucursal> getSucursalList() {
        return sucursalList;
    }

    public void setSucursalList(List<Sucursal> sucursalList) {
        this.sucursalList = sucursalList;
    }

    public Pais getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Pais codigoPais) {
        this.codigoPais = codigoPais;
    }

    @XmlTransient
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoDepa != null ? codigoDepa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.codigoDepa == null && other.codigoDepa != null) || (this.codigoDepa != null && !this.codigoDepa.equals(other.codigoDepa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Departamento[ codigoDepa=" + codigoDepa + " ]";
    }
    
}
