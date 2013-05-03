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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Reyes
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodigoCl", query = "SELECT c FROM Cliente c WHERE c.codigoCl = :codigoCl"),
    @NamedQuery(name = "Cliente.findByLicenciaPortacionArmaCl", query = "SELECT c FROM Cliente c WHERE c.licenciaPortacionArmaCl = :licenciaPortacionArmaCl"),
    @NamedQuery(name = "Cliente.findBySolvenciaCl", query = "SELECT c FROM Cliente c WHERE c.solvenciaCl = :solvenciaCl")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_CL")
    private Integer codigoCl;
    @Size(max = 25)
    @Column(name = "licencia_portacion_arma_cl")
    private String licenciaPortacionArmaCl;
    @Size(max = 30)
    @Column(name = "solvencia_cl")
    private String solvenciaCl;
    @OneToMany(mappedBy = "codigoCl")
    private List<Matricula> matriculaList;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne
    private Persona idPersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCl")
    private List<Reserva> reservaList;

    public Cliente() {
    }

    public Cliente(Integer codigoCl) {
        this.codigoCl = codigoCl;
    }

    public Integer getCodigoCl() {
        return codigoCl;
    }

    public void setCodigoCl(Integer codigoCl) {
        this.codigoCl = codigoCl;
    }

    public String getLicenciaPortacionArmaCl() {
        return licenciaPortacionArmaCl;
    }

    public void setLicenciaPortacionArmaCl(String licenciaPortacionArmaCl) {
        this.licenciaPortacionArmaCl = licenciaPortacionArmaCl;
    }

    public String getSolvenciaCl() {
        return solvenciaCl;
    }

    public void setSolvenciaCl(String solvenciaCl) {
        this.solvenciaCl = solvenciaCl;
    }

    @XmlTransient
    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
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
        hash += (codigoCl != null ? codigoCl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codigoCl == null && other.codigoCl != null) || (this.codigoCl != null && !this.codigoCl.equals(other.codigoCl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Cliente[ codigoCl=" + codigoCl + " ]";
    }
    
}
