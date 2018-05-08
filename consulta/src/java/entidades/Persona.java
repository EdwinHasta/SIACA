/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC_Angelo
 */
@Entity
@Table(name = "PERSONA", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByApellidos", query = "SELECT p FROM Persona p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Persona.findByFechanacimiento", query = "SELECT p FROM Persona p WHERE p.fechanacimiento = :fechanacimiento")
    , @NamedQuery(name = "Persona.findByNombres", query = "SELECT p FROM Persona p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Persona.findByNumero", query = "SELECT p FROM Persona p WHERE p.numero = :numero")
    , @NamedQuery(name = "Persona.findByPersonaid", query = "SELECT p FROM Persona p WHERE p.personaid = :personaid")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "FECHANACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechanacimiento;
    @Size(max = 100)
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "NUMERO")
    private BigInteger numero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERSONAID")
    private BigDecimal personaid;
    @JoinColumn(name = "LUGARNACIMIENTO", referencedColumnName = "CIUDADID")
    @ManyToOne
    private Ciudad lugarnacimiento;
    @JoinColumn(name = "LUGARRESIDENCIA", referencedColumnName = "CIUDADID")
    @ManyToOne
    private Ciudad lugarresidencia;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Profesor profesor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Estudiante estudiante;

    public Persona() {
    }

    public Persona(BigDecimal personaid) {
        this.personaid = personaid;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    public BigDecimal getPersonaid() {
        return personaid;
    }

    public void setPersonaid(BigDecimal personaid) {
        this.personaid = personaid;
    }

    public Ciudad getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(Ciudad lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    public Ciudad getLugarresidencia() {
        return lugarresidencia;
    }

    public void setLugarresidencia(Ciudad lugarresidencia) {
        this.lugarresidencia = lugarresidencia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaid != null ? personaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.personaid == null && other.personaid != null) || (this.personaid != null && !this.personaid.equals(other.personaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Persona[ personaid=" + personaid + " ]";
    }
    
}
