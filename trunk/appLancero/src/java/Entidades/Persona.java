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
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Persona.findByDuiPersona", query = "SELECT p FROM Persona p WHERE p.duiPersona = :duiPersona"),
    @NamedQuery(name = "Persona.findByNitPersona", query = "SELECT p FROM Persona p WHERE p.nitPersona = :nitPersona"),
    @NamedQuery(name = "Persona.findByLicenciaConducirPersona", query = "SELECT p FROM Persona p WHERE p.licenciaConducirPersona = :licenciaConducirPersona"),
    @NamedQuery(name = "Persona.findByUsuarioPersona", query = "SELECT p FROM Persona p WHERE p.usuarioPersona = :usuarioPersona"),
    @NamedQuery(name = "Persona.findByNombreEmpresaPersona", query = "SELECT p FROM Persona p WHERE p.nombreEmpresaPersona = :nombreEmpresaPersona")})
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private Integer idPersona;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOMBRE_PERSONA")
    private String nombrePersona;
    @Lob
    @Size(max = 65535)
    @Column(name = "APELLIDO_PERSONA")
    private String apellidoPersona;
    @Size(max = 20)
    @Column(name = "dui_persona")
    private String duiPersona;
    @Size(max = 20)
    @Column(name = "nit_persona")
    private String nitPersona;
    @Size(max = 25)
    @Column(name = "licencia_conducir_persona")
    private String licenciaConducirPersona;
    @Lob
    @Size(max = 65535)
    @Column(name = "TELEFONO_PERSONA")
    private String telefonoPersona;
    @Lob
    @Size(max = 65535)
    @Column(name = "CELULAR_PERSONA")
    private String celularPersona;
    @Lob
    @Size(max = 65535)
    @Column(name = "DIRECCION_PERSONA")
    private String direccionPersona;
    @Lob
    @Size(max = 65535)
    @Column(name = "CORREO_PERSONA")
    private String correoPersona;
    @Size(max = 15)
    @Column(name = "usuario_persona")
    private String usuarioPersona;
    @Lob
    @Size(max = 65535)
    @Column(name = "CONTRASENA_PERSONA")
    private String contrasenaPersona;
    @Size(max = 30)
    @Column(name = "nombre_empresa_persona")
    private String nombreEmpresaPersona;
    @Lob
    @Size(max = 65535)
    @Column(name = "SEXO_PERSONA")
    private String sexoPersona;
    @OneToMany(mappedBy = "idPersona")
    private List<Empleado> empleadoList;
    @OneToMany(mappedBy = "idPersona")
    private List<Cliente> clienteList;
    @JoinColumn(name = "CODIGO_DEPA", referencedColumnName = "CODIGO_DEPA")
    @ManyToOne
    private Departamento codigoDepa;
    @JoinColumn(name = "CODIGO_ROL", referencedColumnName = "CODIGO_ROL")
    @ManyToOne
    private Rol codigoRol;

    public Persona() {
    }

    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(Integer idPersona, String nombrePersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getDuiPersona() {
        return duiPersona;
    }

    public void setDuiPersona(String duiPersona) {
        this.duiPersona = duiPersona;
    }

    public String getNitPersona() {
        return nitPersona;
    }

    public void setNitPersona(String nitPersona) {
        this.nitPersona = nitPersona;
    }

    public String getLicenciaConducirPersona() {
        return licenciaConducirPersona;
    }

    public void setLicenciaConducirPersona(String licenciaConducirPersona) {
        this.licenciaConducirPersona = licenciaConducirPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getCelularPersona() {
        return celularPersona;
    }

    public void setCelularPersona(String celularPersona) {
        this.celularPersona = celularPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getUsuarioPersona() {
        return usuarioPersona;
    }

    public void setUsuarioPersona(String usuarioPersona) {
        this.usuarioPersona = usuarioPersona;
    }

    public String getContrasenaPersona() {
        return contrasenaPersona;
    }

    public void setContrasenaPersona(String contrasenaPersona) {
        this.contrasenaPersona = contrasenaPersona;
    }

    public String getNombreEmpresaPersona() {
        return nombreEmpresaPersona;
    }

    public void setNombreEmpresaPersona(String nombreEmpresaPersona) {
        this.nombreEmpresaPersona = nombreEmpresaPersona;
    }

    public String getSexoPersona() {
        return sexoPersona;
    }

    public void setSexoPersona(String sexoPersona) {
        this.sexoPersona = sexoPersona;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Departamento getCodigoDepa() {
        return codigoDepa;
    }

    public void setCodigoDepa(Departamento codigoDepa) {
        this.codigoDepa = codigoDepa;
    }

    public Rol getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(Rol codigoRol) {
        this.codigoRol = codigoRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atributos.Persona[ idPersona=" + idPersona + " ]";
    }
    
}
